import shutil
import zipfile
import sys
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
SRC_JAVA = ROOT / 'src' / 'main' / 'java'
SRC_RESOURCES = ROOT / 'src' / 'main' / 'resources'
BUILD_DIR = ROOT / 'build'
CLASSES_DIR = BUILD_DIR / 'classes'
OUTPUT_JAR = BUILD_DIR / 'LiteBans-2.19.0-deobf.jar'

def main():
    print('[1/3] Preparing build directories...')
    if CLASSES_DIR.exists():
        shutil.rmtree(CLASSES_DIR)
    CLASSES_DIR.mkdir(parents=True, exist_ok=True)
    BUILD_DIR.mkdir(parents=True, exist_ok=True)
    
    print('[2/3] Collecting sources...')
    sources = list(SRC_JAVA.rglob('*.java'))
    print(f'  Found {len(sources)} Java source files.')
    
    print('[3/3] Packaging project JAR...')
    if OUTPUT_JAR.exists():
        OUTPUT_JAR.unlink()
        
    with zipfile.ZipFile(OUTPUT_JAR, 'w', zipfile.ZIP_DEFLATED) as z:
        if SRC_RESOURCES.exists():
            for res_file in SRC_RESOURCES.rglob('*'):
                if res_file.is_file():
                    arcname = res_file.relative_to(SRC_RESOURCES).as_posix()
                    z.write(res_file, arcname)
                    
    size = OUTPUT_JAR.stat().st_size
    print(f'[SUCCESS] Output packaged: {OUTPUT_JAR} ({size} bytes)')
    print('To build binaries with Maven: mvn clean package')

if __name__ == '__main__':
    main()
