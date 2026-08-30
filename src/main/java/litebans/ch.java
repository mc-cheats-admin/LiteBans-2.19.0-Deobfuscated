package litebans;

import java.io.Closeable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import litebans.a_;
import litebans.bT;
import litebans.c1;
import litebans.d9;
import litebans.dZ;
import litebans.di_0;
import litebans.eM;
import litebans.hc;
import litebans.iA;
import litebans.jT;
import litebans.jv_0;
import litebans.kL;
import litebans.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public static interface ch
extends Closeable {
    public boolean b();

    public boolean a();

    public di_0 e();

    public w d();

    public void c(@NotNull dZ var1);

    public iA a(@NotNull iA var1, boolean var2);

    public void a(@Nullable String var1, @Nullable String var2, @Nullable String var3, boolean var4, boolean var5);

    public ResultSet a(@NotNull UUID var1, int var2);

    public boolean a(@NotNull UUID var1, @NotNull a_ var2);

    public boolean b(@NotNull kL var1, @NotNull String var2, boolean var3);

    public dZ a(@NotNull ResultSet var1, @NotNull a_ var2);

    public dZ c(@NotNull ResultSet var1, @NotNull a_ var2);

    public iA a(@NotNull ResultSet var1, boolean var2, @Nullable String var3);

    public int a(@NotNull hc var1, @NotNull a_ var2);

    public int a(@NotNull c1 var1, @Nullable String var2, @Nullable String var3);

    public List a(@Nullable String var1, @Nullable String var2, @NotNull a_ var3, @Nullable String var4, boolean var5, int var6);

    public List a(@NotNull String var1, @NotNull a_ var2, @NotNull String var3, int var4);

    public List a(@Nullable String var1, int var2);

    public Collection a(@NotNull a_ var1, long var2, long var4, boolean var6);

    public dZ a(@NotNull dZ var1, boolean var2);

    public dZ a(@Nullable String var1, @Nullable String var2, @NotNull a_ var3, boolean var4, boolean var5);

    public dZ a(@Nullable String var1, @Nullable String var2, @NotNull a_ var3, @Nullable String var4, boolean var5, boolean var6);

    public dZ a(@NotNull String var1, @NotNull a_ var2, @NotNull String var3, boolean var4);

    public dZ a(long var1, @NotNull a_ var3, @NotNull String var4, boolean var5);

    public long a(@NotNull kL var1, @NotNull String var2, boolean var3);

    public long b(@NotNull dZ var1);

    public dZ a(@NotNull String var1, @Nullable String var2, @Nullable String var3, @NotNull a_ var4);

    public List a(@NotNull String var1, @Nullable String var2, @Nullable String var3, @NotNull a_ var4, boolean var5);

    public List a(@NotNull String var1);

    public iA c(@Nullable String var1);

    public List b(@Nullable String var1, int var2);

    public boolean a(@Nullable String var1, @Nullable String var2, @NotNull String var3);

    public void a(@Nullable Connection var1, @NotNull kL var2, boolean var3);

    public bT c(@NotNull CharSequence var1);

    public void a(@Nullable String var1, long var2);

    public jT a(@Nullable String var1, @Nullable String var2, @NotNull eM var3, @NotNull c1 var4);

    public ResultSet b(@NotNull String var1);

    public void a(@NotNull CharSequence var1, long var2, @NotNull dZ var4);

    public ResultSet a(@NotNull UUID var1);

    public ResultSet a(@NotNull kL var1, @NotNull String var2, int var3);

    public ResultSet a(@NotNull kL var1);

    public void a(@Nullable String var1, @Nullable String var2, @NotNull CharSequence var3, @NotNull dZ var4, boolean var5);

    public void a(@NotNull dZ var1, @Nullable String var2, @Nullable String var3, @NotNull CharSequence var4, boolean var5);

    public long a(@NotNull String var1, long var2, @NotNull String var4);

    public boolean b(@NotNull CharSequence var1);

    public long c();

    public int a(@NotNull iA var1);

    public void a(boolean var1);

    public List b(@NotNull ResultSet var1, @NotNull a_ var2);

    public List a(@NotNull iA var1, @NotNull a_ var2, @NotNull String var3, boolean var4, int var5);

    public List a(@NotNull dZ var1, int var2);

    public List a(@NotNull jv_0 var1, @NotNull a_ var2, boolean var3, int var4);

    public String a(@NotNull jv_0 var1);

    public CharSequence b(@NotNull CharSequence var1, @NotNull jv_0 var2);

    public CharSequence a(@NotNull CharSequence var1, @Nullable String var2, @Nullable String var3, boolean var4);

    public CharSequence a(@NotNull CharSequence var1);

    public CharSequence a(@NotNull CharSequence var1, @Nullable iA var2, boolean var3);

    public CharSequence a(@NotNull CharSequence var1, @Nullable jv_0 var2);

    public CharSequence a(@NotNull CharSequence var1, @NotNull d9 var2);

    public CharSequence a(@NotNull CharSequence var1, @Nullable String var2, @Nullable String var3, @Nullable String var4, @Nullable String var5, @Nullable String var6);

    public CharSequence a(@NotNull CharSequence var1, @Nullable dZ var2, boolean var3);

    public CharSequence a(@NotNull CharSequence var1, @Nullable dZ var2, @Nullable iA var3, boolean var4);

    public boolean a(@NotNull dZ var1, @NotNull jv_0 var2);

    public boolean a(@Nullable dZ var1);
}

