package litebans;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import litebans.a_;
import litebans.bT;
import litebans.c1;
import litebans.ch;
import litebans.d9;
import litebans.dZ;
import litebans.di_0;
import litebans.eM;
import litebans.hc;
import litebans.iA;
import litebans.jT;
import litebans.jv_0;
import litebans.kL;
import litebans.kR;
import litebans.kc_0;
import litebans.kp;
import litebans.kx_0;
import litebans.ll;
import litebans.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public static final class h3
implements ch {
    private final di_0 a;

    public h3(@NotNull di_0 di_02) {
        this.a = di_02;
    }

    @Override
    public di_0 e() {
        return this.a;
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public void a(@Nullable String string, @Nullable String string2, @NotNull CharSequence charSequence, @NotNull dZ dZ2, boolean bl) {
    }

    @Override
    public void a(@NotNull dZ dZ2, @Nullable String string, @Nullable String string2, @NotNull CharSequence charSequence, boolean bl) {
    }

    @Override
    public long c() {
        return 0L;
    }

    @Override
    public int a(@NotNull c1 c12, @Nullable String string, @Nullable String string2) {
        return 0;
    }

    @Override
    public jT a(@Nullable String string, @Nullable String string2, @NotNull eM eM2, @NotNull c1 c12) {
        return kc_0.a(0.0, 0.0);
    }

    @Override
    public void c(@NotNull dZ dZ2) {
    }

    @Override
    public void a(@Nullable String string, @Nullable String string2, @Nullable String string3, boolean bl, boolean bl2) {
    }

    @Override
    public iA a(@NotNull iA iA2, boolean bl) {
        return new iA(null, null, null, new Date());
    }

    @Override
    public int a(@NotNull iA iA2) {
        return 0;
    }

    @Override
    public void close() {
    }

    @Override
    public List a(@Nullable String string, @Nullable String string2, @NotNull a_ a_2, @Nullable String string3, boolean bl, int n) {
        return ll.e();
    }

    @Override
    public List a(@NotNull dZ dZ2, int n) {
        return ll.e();
    }

    @Override
    public List a(@NotNull jv_0 jv_02, @NotNull a_ a_2, boolean bl, int n) {
        return ll.e();
    }

    @Override
    public int a(@NotNull hc hc2, @NotNull a_ a_2) {
        return 0;
    }

    @Override
    public List a(@NotNull String string, @NotNull a_ a_2, @NotNull String string2, int n) {
        return ll.e();
    }

    @Override
    public List a(@Nullable String string, int n) {
        return ll.e();
    }

    @Override
    public Collection a(@NotNull a_ a_2, long l3, long l5, boolean bl) {
        return ll.e();
    }

    @Override
    public dZ a(@Nullable String string, @Nullable String string2, @NotNull a_ a_2, @Nullable String string3, boolean bl, boolean bl2) {
        return null;
    }

    @Override
    public dZ a(@NotNull String string, @Nullable String string2, @Nullable String string3, @NotNull a_ a_2) {
        return null;
    }

    @Override
    public List a(@NotNull String string, @Nullable String string2, @Nullable String string3, @NotNull a_ a_2, boolean bl) {
        return ll.e();
    }

    @Override
    public dZ a(long l3, @NotNull a_ a_2, @NotNull String string, boolean bl) {
        return null;
    }

    @Override
    public dZ a(@NotNull String string, @NotNull a_ a_2, @NotNull String string2, boolean bl) {
        return null;
    }

    @Override
    public dZ a(@NotNull dZ dZ2, boolean bl) {
        return null;
    }

    @Override
    public dZ a(@Nullable String string, @Nullable String string2, @NotNull a_ a_2, boolean bl, boolean bl2) {
        return null;
    }

    @Override
    public long a(@NotNull kL kL2, @NotNull String string, boolean bl) {
        return 0L;
    }

    @Override
    public boolean a(@NotNull UUID uUID, @NotNull a_ a_2) {
        return false;
    }

    @Override
    public kp a(@NotNull UUID uUID, int n) {
        return kx_0.a();
    }

    @Override
    public kp a(@NotNull UUID uUID) {
        return kx_0.a();
    }

    @Override
    public List a(@NotNull String string) {
        return ll.e();
    }

    @Override
    public iA c(@Nullable String string) {
        return null;
    }

    @Override
    public List b(@Nullable String string, int n) {
        return ll.e();
    }

    @Override
    public long b(@NotNull dZ dZ2) {
        return 0L;
    }

    @Override
    public void a(@Nullable Connection connection, @NotNull kL kL2, boolean bl) {
    }

    @Override
    public dZ a(@NotNull ResultSet resultSet, @NotNull a_ a_2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public bT c(@NotNull CharSequence charSequence) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void a(@Nullable String string, long l3) {
    }

    @Override
    public ResultSet a(@NotNull kL kL2, @NotNull String string, int n) {
        return kx_0.a();
    }

    @Override
    public ResultSet a(@NotNull kL kL2) {
        return kx_0.a();
    }

    @Override
    public void a(@NotNull CharSequence charSequence, long l3, @NotNull dZ dZ2) {
    }

    @Override
    public long a(@NotNull String string, long l3, @NotNull String string2) {
        return -1L;
    }

    @Override
    public ResultSet b(@NotNull String string) {
        return new kp();
    }

    @Override
    public void a(boolean bl) {
    }

    @Override
    public boolean b(@NotNull kL kL2, @NotNull String string, boolean bl) {
        return false;
    }

    @Override
    public boolean a() {
        return kR.b(this);
    }

    @Override
    public w d() {
        return kR.a(this);
    }

    @Override
    public List a(@NotNull iA iA2, @NotNull a_ a_2, @NotNull String string, boolean bl, int n) {
        return kR.a((ch)this, iA2, a_2, string, bl, n);
    }

    @Override
    public List b(@NotNull ResultSet resultSet, @NotNull a_ a_2) {
        return kR.a((ch)this, resultSet, a_2);
    }

    @Override
    public String a(@NotNull jv_0 jv_02) {
        return kR.a((ch)this, jv_02);
    }

    @Override
    public CharSequence b(@NotNull CharSequence charSequence, @NotNull jv_0 jv_02) {
        return kR.a((ch)this, charSequence, jv_02);
    }

    @Override
    public CharSequence a(@NotNull CharSequence charSequence, @Nullable String string, @Nullable String string2, boolean bl) {
        return kR.a((ch)this, charSequence, string, string2, bl);
    }

    @Override
    public CharSequence a(@NotNull CharSequence charSequence) {
        return kR.a((ch)this, charSequence);
    }

    @Override
    public CharSequence a(@NotNull CharSequence charSequence, @Nullable iA iA2, boolean bl) {
        return kR.a((ch)this, charSequence, iA2, bl);
    }

    @Override
    public CharSequence a(@NotNull CharSequence charSequence, @Nullable jv_0 jv_02) {
        return kR.b(this, charSequence, jv_02);
    }

    @Override
    public CharSequence a(@NotNull CharSequence charSequence, @NotNull d9 d92) {
        return kR.a((ch)this, charSequence, d92);
    }

    @Override
    public CharSequence a(@NotNull CharSequence charSequence, @Nullable dZ dZ2, boolean bl) {
        return kR.a((ch)this, charSequence, dZ2, bl);
    }

    @Override
    public CharSequence a(@NotNull CharSequence charSequence, @Nullable dZ dZ2, @Nullable iA iA2, boolean bl) {
        return kR.a((ch)this, charSequence, dZ2, iA2, bl);
    }

    @Override
    public CharSequence a(@NotNull CharSequence charSequence, @Nullable String string, @Nullable String string2, @Nullable String string3, @Nullable String string4, @Nullable String string5) {
        return kR.a((ch)this, charSequence, string, string2, string3, string4, string5);
    }

    @Override
    public boolean a(@NotNull dZ dZ2, @NotNull jv_0 jv_02) {
        return kR.a((ch)this, dZ2, jv_02);
    }

    @Override
    public boolean a(@Nullable dZ dZ2) {
        return kR.a((ch)this, dZ2);
    }

    @Override
    public ResultSet a(UUID uUID, int n) {
        return this.a(uUID, n);
    }

    @Override
    public ResultSet a(UUID uUID) {
        return this.a(uUID);
    }
}

