/* This file was generated by SableCC (http://www.sablecc.org/). */

package prefixa.node;

import prefixa.analysis.*;

@SuppressWarnings("nls")
public final class TCharId extends Token
{
    public TCharId()
    {
        super.setText("char");
    }

    public TCharId(int line, int pos)
    {
        super.setText("char");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TCharId(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTCharId(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TCharId text.");
    }
}