/* This file was generated by SableCC (http://www.sablecc.org/). */

package prefixa.node;

import prefixa.analysis.*;

@SuppressWarnings("nls")
public final class TElseId extends Token
{
    public TElseId()
    {
        super.setText("else");
    }

    public TElseId(int line, int pos)
    {
        super.setText("else");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TElseId(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTElseId(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TElseId text.");
    }
}