package litebans;

import java.util.UUID;
import litebans.as;
import litebans.jv_0;
import litebans.x_0;

public final class be_0
implements jv_0 {
    final /* synthetic */ String e;
    final /* synthetic */ String d;
    final /* synthetic */ UUID c;

    public be_0(String string, String string2, UUID uUID) {
        this.e = string;
        this.d = string2;
        this.c = uUID;
    }

    public Void a(String string) {
        x_0.a();
        throw new as();
    }

    @Override
    public String g() {
        return this.e;
    }

    public Void a() {
        x_0.a();
        throw new as();
    }

    @Override
    public String b() {
        return this.d;
    }

    @Override
    public String i() {
        return this.e;
    }

    @Override
    public String h() {
        return null;
    }

    @Override
    public UUID d() {
        return this.c;
    }

    @Override
    public String a() {
        return this.c.toString();
    }

    @Override
    public boolean e(String string) {
        return false;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public boolean j() {
        return false;
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public void d(String string) {
    }

    @Override
    public void a(String string) {
    }

    @Override
    public void b(String string) {
    }

    @Override
    public void a(String string, byte[] byArray) {
    }

    @Override
    public void c(String string) {
        this.a(string);
    }

    @Override
    public Object c() {
        return this.a();
    }
}

