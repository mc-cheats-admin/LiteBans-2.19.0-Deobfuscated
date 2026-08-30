package litebans;

import java.sql.PreparedStatement;
import litebans.aJ;
import litebans.bT;
import litebans.ch;

public final class b9
extends bT {
    private b9(ch ch2, PreparedStatement preparedStatement, String string) {
        super(ch2, preparedStatement, string, null);
    }

    @Override
    public b9 a(boolean bl) {
        b9 b92;
        b9 b93 = b92 = this;
        boolean bl2 = false;
        bT bT2 = this;
        char c = bl ? (char)'1' : '0';
        boolean bl3 = false;
        bT2.a(String.valueOf(c));
        return b92;
    }

    @Override
    public bT a(boolean bl) {
        return this.a(bl);
    }

    public /* synthetic */ b9(ch ch2, PreparedStatement preparedStatement, String string, aJ aJ2) {
        this(ch2, preparedStatement, string);
    }
}

