package litebans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.UUID;
import litebans.a_;
import litebans.bK;
import litebans.bz;
import litebans.ch;
import litebans.dZ;
import litebans.di_0;
import litebans.eq_0;
import litebans.ew;
import litebans.fS;
import litebans.f_;
import litebans.fg_0;
import litebans.gf_0;
import litebans.hl;
import litebans.iv_0;
import litebans.kR;
import litebans.o;
import litebans.q_0;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public static final class f9
extends fS {
    private static /* synthetic */ String[] m;

    public f9(@NotNull di_0 di_02) {
        super(di_02, m[0], m[1], 0, 0L, 24, null);
    }

    @Override
    public boolean c(@NotNull String string) {
        return super.c(string) || bz.a(string, m[2], true);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(@NotNull String string, @NotNull Connection connection, @NotNull ch ch2, boolean bl) {
        PreparedStatement preparedStatement = connection.prepareStatement(m[3] + this.i() + m[4]);
        AutoCloseable autoCloseable = preparedStatement;
        Throwable throwable = null;
        try {
            Object object = (PreparedStatement)autoCloseable;
            boolean bl2 = false;
            ResultSet resultSet = preparedStatement.executeQuery();
            AutoCloseable autoCloseable2 = resultSet;
            Throwable throwable2 = null;
            try {
                Object object2 = (ResultSet)autoCloseable2;
                boolean bl3 = false;
                while (resultSet.next()) {
                    Object object3;
                    try {
                        Object object4;
                        String string2;
                        Object object5;
                        Object object6;
                        Object object7;
                        Object object8;
                        Object object9;
                        Object object10;
                        Object object11;
                        boolean bl4;
                        String string3 = resultSet.getString(m[5]);
                        object3 = null;
                        String string4 = null;
                        String string5 = null;
                        string5 = resultSet.getString(m[6]);
                        boolean bl5 = string5 != null && ((CharSequence)string5).length() > 0 ? true : (bl4 = false);
                        if (string3 != null) {
                            object3 = bK.c.e(string3);
                            try {
                                object11 = connection.prepareStatement(m[7] + this.i() + m[8] + this.i() + m[9]);
                                object10 = (AutoCloseable)object11;
                                object9 = null;
                                try {
                                    object8 = (PreparedStatement)object10;
                                    boolean bl6 = false;
                                    object11.setString(1, string3);
                                    ResultSet resultSet2 = object11.executeQuery();
                                    object7 = resultSet2;
                                    object6 = null;
                                    try {
                                        object5 = (ResultSet)object7;
                                        boolean bl7 = false;
                                        if (resultSet2.next()) {
                                            string4 = resultSet2.getString(this.i() + m[10]);
                                            string5 = resultSet2.getString(m[11]);
                                        }
                                        object5 = iv_0.a;
                                    }
                                    catch (Throwable throwable3) {
                                        object6 = throwable3;
                                        throw throwable3;
                                    }
                                    finally {
                                        f_.a((AutoCloseable)object7, (Throwable)object6);
                                    }
                                    object8 = iv_0.a;
                                }
                                catch (Throwable throwable4) {
                                    object9 = throwable4;
                                    throw throwable4;
                                }
                                finally {
                                    f_.a((AutoCloseable)object10, (Throwable)object9);
                                }
                            }
                            catch (Exception exception) {
                                object10 = this;
                                boolean bl8 = false;
                                ((w)((fg_0)object10).h().a(w.class)).a(exception);
                            }
                        }
                        if (string4 == null && object3 != null) {
                            string4 = this.a(UUID.fromString((String)object3));
                        }
                        object11 = resultSet.getString(m[12]);
                        object10 = null;
                        if (object11 != null) {
                            try {
                                PreparedStatement preparedStatement2 = connection.prepareStatement(m[13] + this.i() + m[14] + this.i() + m[15]);
                                object8 = preparedStatement2;
                                Throwable throwable5 = null;
                                try {
                                    Object object12 = (PreparedStatement)object8;
                                    boolean bl9 = false;
                                    preparedStatement2.setString(1, (String)object11);
                                    object6 = preparedStatement2.executeQuery();
                                    object5 = (AutoCloseable)object6;
                                    Throwable throwable6 = null;
                                    try {
                                        Object object13 = object5;
                                        boolean bl10 = false;
                                        if (object6.next()) {
                                            object10 = bK.c.e(object6.getString(m[16]));
                                        }
                                        object13 = iv_0.a;
                                    }
                                    catch (Throwable throwable7) {
                                        throwable6 = throwable7;
                                        throw throwable7;
                                    }
                                    finally {
                                        f_.a((AutoCloseable)object5, throwable6);
                                    }
                                    object12 = iv_0.a;
                                }
                                catch (Throwable throwable8) {
                                    throwable5 = throwable8;
                                    throw throwable8;
                                }
                                finally {
                                    f_.a((AutoCloseable)object8, throwable5);
                                }
                            }
                            catch (Exception exception) {
                                object8 = this;
                                boolean bl11 = false;
                                ((w)((fg_0)object8).h().a(w.class)).a(exception);
                            }
                        }
                        if ((string2 = resultSet.getString(m[17])) == null) {
                            string2 = m[18];
                        }
                        object9 = string2;
                        fg_0 fg_02 = this;
                        boolean bl12 = false;
                        o o2 = (o)fg_02.h().a(o.class);
                        ew.a(resultSet);
                        fg_02 = this;
                        bl12 = false;
                        object8 = o2.a(resultSet, m[19], false, ((q_0)fg_02.h().a(q_0.class)).f().aF());
                        long l3 = ((Date)object8).getTime();
                        object6 = this;
                        boolean bl13 = false;
                        o o3 = (o)((fg_0)object6).h().a(o.class);
                        object6 = this;
                        bl13 = false;
                        object7 = o3.a(resultSet, m[20], false, ((q_0)((fg_0)object6).h().a(q_0.class)).f().aF());
                        long l5 = ((Date)object7).getTime();
                        if (resultSet.getTimestamp(m[21]) == null) {
                            l5 = -1L;
                        }
                        if (bl4 || kR.a(ch2, (String)object3, null, null, false, false, 30, null) == null) {
                            CharSequence charSequence = (CharSequence)object9;
                            Object object14 = object10;
                            if (object14 == null) {
                                object14 = m[22];
                            }
                            dZ dZ2 = new dZ(a_.h, (String)object3, string5, charSequence, (String)object14, (String)object11, eq_0.f.b(), null, l3, l5, 0, false, bl4, false, 0L, 27648, null);
                            ch2.c(dZ2);
                            object4 = bl4 ? this.f().incrementAndGet() : this.g().incrementAndGet();
                        } else {
                            this.m().warning(m[23] + (String)object3);
                            object4 = iv_0.a;
                        }
                        if (string4 == null || object3 == null) continue;
                        new gf_0(this.h(), string4, (String)object3, m[24]).run();
                    }
                    catch (Exception exception) {
                        object3 = this;
                        boolean bl14 = false;
                        ((w)((fg_0)object3).h().a(w.class)).a(exception);
                    }
                }
                object2 = iv_0.a;
            }
            catch (Throwable throwable9) {
                throwable2 = throwable9;
                throw throwable9;
            }
            finally {
                f_.a(autoCloseable2, throwable2);
            }
            object = iv_0.a;
        }
        catch (Throwable throwable10) {
            throwable = throwable10;
            throw throwable10;
        }
        finally {
            f_.a(autoCloseable, throwable);
        }
    }

    private static final void a() {
        m = new String[]{hl.a("\u078a\u07bd\u07a6\u07af\u07ad\u07ad\u0789\u07ac\u07a5\u07a1\u07a6\u079c\u07a7\u07a7\u07a4\u07bb", -1419573304), hl.a("\ue348\ue34b\ue35e\ue355", 10674954), hl.a("\u4d31\u4d32\u4d27", -343585421), hl.a("\u0e00\u0e16\u0e1f\u0e16\u0e10\u0e07\u0e73\u0e79\u0e73\u0e15\u0e01\u0e1c\u0e1e\u0e73", -1461121453), hl.a("\u9fb8\u9fbb\u9fb4\u9ffa\u9f8d\u9f92\u9f9f\u9f88\u9f9f\u9ffa\u9fb8\u9fbb\u9fb4\u9f85\u9fa9\u9fae\u9fbb\u9fae\u9fbf\u9fe7\u9feb", 2042404826), hl.a("\u8517\u8517\u850b\u8506", 1197376834), hl.a("\uf089\uf08a\uf085\uf0b4\uf082\uf09b", -1257377557), hl.a("\u5937\u5921\u5928\u5921\u5927\u5930\u5944", -5219996), hl.a("\u1330\u132c\u1321\u1339\u1325\u1332\u136c\u132c\u1321\u1333\u1334\u1329\u1330\u1360\u1306\u1312\u130f\u130d\u1360", 1265439552), hl.a("\u34ef\u34f3\u34fe\u34e6\u34fa\u34ed\u34ec\u34bf\u34c8\u34d7\u34da\u34cd\u34da\u34bf\u34ca\u34ca\u34d6\u34db\u34a2\u34a0\u34bf\u34d0\u34cd\u34db\u34da\u34cd\u34bf\u34dd\u34c6\u34bf\u34f3\u34fe\u34ec\u34eb\u34f3\u34f0\u34f8\u34f6\u34f1\u34bf\u34db\u34da\u34cc\u34dc\u34bf\u34d3\u34d6\u34d2\u34d6\u34cb\u34bf\u34ae", 995046559), hl.a("\u0578\u0564\u0569\u0571\u056d\u057a", 986711304), hl.a("\u455a\u4557\u4545\u4542\u455f\u4546", -2021636810), hl.a("\ue0d3\ue0d0\ue0df\ue0ee\ue0c2\ue0c5\ue0d0\ue0d7\ue0d7", 57991345), hl.a("\uc9ae\uc9b8\uc9b1\uc9b8\uc9be\uc9a9\uc9dd\uc9a8\uc9a8\uc9b4\uc9b9\uc9dd\uc9bb\uc9af\uc9b2\uc9b0\uc9dd", -684930563), hl.a("\uba3a\uba26\uba2b\uba33\uba2f\uba38\uba39\uba6a\uba1d\uba02\uba0f\uba18\uba0f\uba6a", -2024228278), hl.a("\u3616\u360a\u3607\u361f\u3603\u3614\u365b\u3659\u3646\u3629\u3634\u3622\u3623\u3634\u3646\u3624\u363f\u3646\u360a\u3607\u3615\u3612\u360a\u3609\u3601\u360f\u3608\u3646\u3622\u3623\u3635\u3625\u3646\u362a\u362f\u362b\u362f\u3632\u3646\u3657", 1938896486), hl.a("\u6eba\u6eba\u6ea6\u6eab", 1710780143), hl.a("\ubc29\ubc2a\ubc25\ubc14\ubc39\ubc2e\ubc2a\ubc38\ubc24\ubc25", 823311435), hl.a("", 1570677889), hl.a("\uac49\uac4a\uac45\uac74\uac49\uac4e\uac4c\uac42\uac45", -2042188757), hl.a("\u6580\u6583\u658c\u65bd\u6587\u658c\u6586", 445146594), hl.a("\u4bbc\u4bbf\u4bb0\u4b81\u4bbb\u4bb0\u4bba", -1460450338), hl.a("\u7b82", 1822063521), hl.a("\udb6c\udb42\udb4b\udb4a\udb57\udb4c\udb4b\udb42\udb05\udb41\udb50\udb55\udb49\udb4c\udb46\udb44\udb51\udb40\udb05\udb47\udb44\udb4b\udb05\udb43\udb4a\udb57\udb05", 1406393125), hl.a("\uda9d", 1704975038)};
    }

    static {
        f9.a();
    }
}

