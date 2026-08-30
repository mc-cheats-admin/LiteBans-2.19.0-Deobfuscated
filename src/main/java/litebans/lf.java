package litebans;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import litebans.eo_0;
import litebans.ew;
import litebans.hl;
import litebans.kb_0;
import litebans.ll;
import litebans.lo_0;
import litebans.lv_0;
import org.jetbrains.annotations.NotNull;

static class lf
extends lv_0 {
    private static /* synthetic */ String[] g;

    public static final boolean a(@NotNull Collection collection, @NotNull Iterable iterable) {
        ew.a((Object)collection, g[19]);
        ew.a((Object)iterable, g[20]);
        if (iterable instanceof Collection) {
            return collection.addAll((Collection)iterable);
        }
        boolean bl = false;
        for (Object t2 : iterable) {
            if (!collection.add(t2)) continue;
            bl = true;
        }
        return bl;
    }

    public static final boolean a(@NotNull Collection collection, @NotNull Object[] objectArray) {
        ew.a((Object)collection, g[23]);
        ew.a((Object)objectArray, g[24]);
        return collection.addAll(lo_0.a(objectArray));
    }

    public static final boolean a(@NotNull Iterable iterable, @NotNull eo_0 eo_02) {
        ew.a((Object)iterable, g[38]);
        ew.a((Object)eo_02, g[39]);
        return lf.a(iterable, eo_02, true);
    }

    private static final boolean a(Iterable iterable, eo_0 eo_02, boolean bl) {
        boolean bl2 = false;
        Iterator iterator = iterable.iterator();
        boolean bl3 = false;
        while (iterator.hasNext()) {
            if ((Boolean)eo_02.a(iterator.next()) != bl) continue;
            iterator.remove();
            bl2 = true;
        }
        return bl2;
    }

    public static final boolean a(@NotNull List list, @NotNull eo_0 eo_02) {
        ew.a((Object)list, g[51]);
        ew.a((Object)eo_02, g[52]);
        return lf.a(list, eo_02, false);
    }

    private static final boolean a(List list, eo_0 eo_02, boolean bl) {
        if (!(list instanceof RandomAccess)) {
            ew.b(list, g[53]);
            return lf.a(kb_0.a(list), eo_02, bl);
        }
        int n = 0;
        int n2 = 0;
        int n3 = ll.b(list);
        if (n2 <= n3) {
            while (true) {
                Object e;
                if ((Boolean)eo_02.a(e = list.get(n2)) != bl) {
                    if (n != n2) {
                        list.set(n, e);
                    }
                    ++n;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        if (n < list.size()) {
            n3 = n;
            n2 = ll.b(list);
            if (n3 <= n2) {
                while (true) {
                    list.remove(n2);
                    if (n2 == n3) break;
                    --n2;
                }
            }
            return true;
        }
        return false;
    }

    private static final void i() {
        g = new String[]{hl.a("\u3bfa\u3bb2\u3bae\u3baf\u3bb5\u3bf8", -832619578), hl.a("\uab9e\uabd6\uabca\uabcb\uabd1\uab9c", -1209619550), hl.a("\u0d6c\u0d65\u0d6c\u0d64\u0d6c\u0d67\u0d7d\u0d7a", 1371868425), hl.a("\u45df\u4597\u458b\u458a\u4590\u45dd", -1988540957), hl.a("\u1cad\u1ca4\u1cad\u1ca5\u1cad\u1ca6\u1cbc\u1cbb", -552133432), hl.a("\u0134\u017c\u0160\u0161\u017b\u0136", 2136867080), hl.a("\uc55a\uc512\uc50e\uc50f\uc515\uc558", -2082224794), hl.a("\u3f1c\u3f15\u3f1c\u3f14\u3f1c\u3f17\u3f0d\u3f0a", -1102430343), hl.a("\u013c\u0174\u0168\u0169\u0173\u013e", 810746112), hl.a("\u37e4\u37ed\u37e4\u37ec\u37e4\u37ef\u37f5\u37f2", -1388628095), hl.a("\ua704\ua74c\ua750\ua751\ua74b\ua706", 1265542968), hl.a("\u7a1c\u7a15\u7a1c\u7a14\u7a1c\u7a17\u7a0d\u7a0a", 1296202361), hl.a("\u6e6c\u6e24\u6e38\u6e39\u6e23\u6e6e", 1517514320), hl.a("\ud5f8\ud5b0\ud5ac\ud5ad\ud5b7\ud5fa", 2038748612), hl.a("\u4bdb\u4bd2\u4bdb\u4bd3\u4bdb\u4bd0\u4bca\u4bcd", 1695108030), hl.a("\u726d\u7225\u7239\u7238\u7222\u726f", -2114293167), hl.a("\u4f04\u4f0d\u4f04\u4f0c\u4f04\u4f0f\u4f15\u4f12", 1422806881), hl.a("\ua1a9\ua1e1\ua1fd\ua1fc\ua1e6\ua1ab", 29794709), hl.a("\u4165\u416c\u4165\u416d\u4165\u416e\u4174\u4173", -1310048000), hl.a("\u6b8f\u6bc7\u6bdb\u6bda\u6bc0\u6b8d", -1370461261), hl.a("\u2a30\u2a39\u2a30\u2a38\u2a30\u2a3b\u2a21\u2a26", -1984746923), hl.a("\u13fe\u13b6\u13aa\u13ab\u13b1\u13fc", -152300606), hl.a("\uf56f\uf566\uf56f\uf567\uf56f\uf564\uf57e\uf579", 2089940234), hl.a("\uadf0\uadb8\uada4\uada5\uadbf\uadf2", -2030064180), hl.a("\ubc96\ubc9f\ubc96\ubc9e\ubc96\ubc9d\ubc87\ubc80", 1419492595), hl.a("\u8fa1\u8fe9\u8ff5\u8ff4\u8fee\u8fa3", 1629261725), hl.a("\uf85d\uf815\uf809\uf808\uf812\uf85f", 1303246945), hl.a("\u1b17\u1b1e\u1b17\u1b1f\u1b17\u1b1c\u1b06\u1b01", 2018843506), hl.a("\u2ccb\u2c83\u2c9f\u2c9e\u2c84\u2cc9", -1138283273), hl.a("\u821c\u8215\u821c\u8214\u821c\u8217\u820d\u820a", 1694007929), hl.a("\uee25\uee6d\uee71\uee70\uee6a\uee27", -1512903143), hl.a("\u76dc\u76d5\u76dc\u76d4\u76dc\u76d7\u76cd\u76ca", -945260871), hl.a("\ucdf9\ucdb1\ucdad\ucdac\ucdb6\ucdfb", 1986579909), hl.a("\u45bd\u45b4\u45bd\u45b5\u45bd\u45b6\u45ac\u45ab", -506706472), hl.a("\u7634\u767c\u7660\u7661\u767b\u7636", 964392456), hl.a("\uf10e\uf107\uf10e\uf106\uf10e\uf105\uf11f\uf118", -371068565), hl.a("\ua20c\ua244\ua258\ua259\ua243\ua20e", -469786064), hl.a("\u25c5\u25cc\u25c5\u25cd\u25c5\u25ce\u25d4\u25d3", -380754528), hl.a("\u2d68\u2d20\u2d3c\u2d3d\u2d27\u2d6a", -2143212204), hl.a("\ubade\ubadc\ubacb\ubaca\ubac7\ubacd\ubacf\ubada\ubacb", -82855250), hl.a("\u1eb4\u1efc\u1ee0\u1ee1\u1efb\u1eb6", 1835540104), hl.a("\u4b04\u4b06\u4b11\u4b10\u4b1d\u4b17\u4b15\u4b00\u4b11", -2016457868), hl.a("\u0abe\u0af6\u0aea\u0aeb\u0af1\u0abc", 2132675202), hl.a("\u56d5\u569d\u5681\u5680\u569a\u56d7", 508253929), hl.a("\uf632\uf617\uf60d\uf60a\uf65e\uf617\uf60d\uf65e\uf61b\uf613\uf60e\uf60a\uf607\uf650", 1704719998), hl.a("\u53d8\u5390\u538c\u538d\u5397\u53da", 366040036), hl.a("\ud6a1\ud6e9\ud6f5\ud6f4\ud6ee\ud6a3", 534959773), hl.a("\u7732\u7717\u770d\u770a\u775e\u7717\u770d\u775e\u771b\u7713\u770e\u770a\u7707\u7750", -1578076290), hl.a("\ufc7e\ufc36\ufc2a\ufc2b\ufc31\ufc7c", 36895810), hl.a("\uf43f\uf477\uf46b\uf46a\uf470\uf43d", 1317925891), hl.a("\ub3de\ub3dc\ub3cb\ub3ca\ub3c7\ub3cd\ub3cf\ub3da\ub3cb", 266646446), hl.a("\udd09\udd41\udd5d\udd5c\udd46\udd0b", 378854709), hl.a("\ucb60\ucb62\ucb75\ucb74\ucb79\ucb73\ucb71\ucb64\ucb75", -1922249968), hl.a("", -2068969940)};
    }

    static {
        lf.i();
    }
}

