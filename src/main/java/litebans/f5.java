package litebans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import litebans.aa_0;
import litebans.di_0;
import litebans.fg_0;
import litebans.hl;
import litebans.jb_0;
import litebans.ll;
import org.jetbrains.annotations.NotNull;

public final class f5
extends fg_0 {
    private static /* synthetic */ String[] d;

    public f5(@NotNull di_0 di_02) {
        super(di_02);
    }

    @Override
    public void run() {
        boolean bl;
        Collection collection;
        String string;
        String string2;
        int n;
        Object object = jb_0.a();
        int n2 = 0;
        int n3 = 4;
        String string3 = ((String)object).substring(n2, n3);
        aa_0.a((fg_0)this, (CharSequence)("LiteBans - Copyright \u00a9 2016-" + string3 + " Ruan Wessels. All rights reserved.\n\n"));
        aa_0.a((fg_0)this, (CharSequence)"LiteBans includes the following third-party software:\n");
        aa_0.a((fg_0)this, (CharSequence)"Software Licensed Under Apache License Version 2.0 (https://www.apache.org/licenses/LICENSE-2.0):");
        object = this;
        fg_0 fg_02 = this;
        n2 = 0;
        String[] stringArray = new String[]{"Kotlin - Copyright (C) 2010-2020 JetBrains s.r.o and respective authors and developers", "HikariCP - Copyright (C) 2013 Brett Wooldridge", "json-simple - Copyright (C) 2012 Yidong Fang", "Apache Commons Compress - Copyright 2002-2021 The Apache Software Foundation"};
        boolean bl2 = false;
        String[] stringArray2 = stringArray;
        Collection collection2 = new ArrayList(stringArray.length);
        boolean bl3 = false;
        int n4 = stringArray2.length;
        for (n = 0; n < n4; ++n) {
            string = string2 = stringArray2[n];
            collection = collection2;
            bl = false;
            collection.add("  " + string);
        }
        aa_0.a(fg_02, (CharSequence)ll.a((List)collection2, "\n", null, null, 0, null, null, 62, null));
        aa_0.a((fg_0)this, (CharSequence)"=====\nOther Software Licenses:");
        object = this;
        fg_02 = this;
        n2 = 0;
        stringArray = new String[]{"bungeecord-chat - (c) 2012-2025 SpigotMC Pty + ", "bungeecord-config - (c) 2012-2025 SpigotMC Pty + ", "Redistribution and use in source and binary forms, with or without", "modification, are permitted provided that the following conditions are met:", "Redistributions of source code must retain the above copyright notice, this", "list of conditions and the following ", "Redistributions in binary form must reproduce the above copyright notice,", "this list of conditions and the following disclaimer in the documentation", "and/or other materials provided with the ", "The name of the author may not be used to endorse or promote products derived", "from this software without specific prior written ", "You may not use the software for commercial software hosting services without", "written permission from the ", "THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS \"AS IS\"", "AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE", "IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE", "ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE", "LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR", "CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF", "SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS", "INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN", "CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)", "ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE", "POSSIBILITY OF SUCH "};
        bl2 = false;
        stringArray2 = stringArray;
        collection2 = new ArrayList(stringArray.length);
        bl3 = false;
        n4 = stringArray2.length;
        for (n = 0; n < n4; ++n) {
            string = string2 = stringArray2[n];
            collection = collection2;
            bl = false;
            collection.add("  " + string);
        }
        aa_0.a(fg_02, (CharSequence)ll.a((List)collection2, "\n", null, null, 0, null, null, 62, null));
    }

    private static final void a() {
        d = new String[]{"LiteBans - Copyright \u00a9 2016-", " Ruan Wessels. All rights reserved.\n\n", "LiteBans includes the following third-party software:\n", "Software Licensed Under Apache License Version 2.0 (https://www.apache.org/licenses/LICENSE-2.0):", "Kotlin - Copyright (C) 2010-2020 JetBrains s.r.o and respective authors and developers", "HikariCP - Copyright (C) 2013 Brett Wooldridge", "json-simple - Copyright (C) 2012 Yidong Fang", "Apache Commons Compress - Copyright 2002-2021 The Apache Software Foundation", "  ", "\n", "=====\nOther Software Licenses:", "bungeecord-chat - (c) 2012-2025 SpigotMC Pty + ", "bungeecord-config - (c) 2012-2025 SpigotMC Pty + ", "Redistribution and use in source and binary forms, with or without", "modification, are permitted provided that the following conditions are met:", "Redistributions of source code must retain the above copyright notice, this", "list of conditions and the following ", "Redistributions in binary form must reproduce the above copyright notice,", "this list of conditions and the following disclaimer in the documentation", "and/or other materials provided with the ", "The name of the author may not be used to endorse or promote products derived", "from this software without specific prior written ", "You may not use the software for commercial software hosting services without", "written permission from the ", "THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS \"AS IS\"", "AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE", "IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE", "ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE", "LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR", "CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF", "SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS", "INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN", "CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)", "ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE", "POSSIBILITY OF SUCH ", "  ", "\n", "Kotlin - Copyright (C) 2010-2020 JetBrains s.r.o and respective authors and developers", "HikariCP - Copyright (C) 2013 Brett Wooldridge", "json-simple - Copyright (C) 2012 Yidong Fang", "Apache Commons Compress - Copyright 2002-2021 The Apache Software Foundation", "  ", "\n", "bungeecord-chat - (c) 2012-2025 SpigotMC Pty + ", "bungeecord-config - (c) 2012-2025 SpigotMC Pty + ", "Redistribution and use in source and binary forms, with or without", "modification, are permitted provided that the following conditions are met:", "Redistributions of source code must retain the above copyright notice, this", "list of conditions and the following ", "Redistributions in binary form must reproduce the above copyright notice,", "this list of conditions and the following disclaimer in the documentation", "and/or other materials provided with the ", "The name of the author may not be used to endorse or promote products derived", "from this software without specific prior written ", "You may not use the software for commercial software hosting services without", "written permission from the ", "THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS \"AS IS\"", "AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE", "IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE", "ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE", "LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR", "CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF", "SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS", "INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN", "CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)", "ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE", "POSSIBILITY OF SUCH ", "  ", "\n"};
    }

    static {
        f5.a();
    }
}

