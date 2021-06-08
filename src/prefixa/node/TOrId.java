/* This file was generated by SableCC (http://www.sablecc.org/). */

package prefixa.node;

import prefixa.analysis.*;

@SuppressWarnings("nls")
public final class TOrId extends Token
{
    public TOrId()
    {
        super.setText("or");
    }

    public TOrId(int line, int pos)
    {
        super.setText("or");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TOrId(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTOrId(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TOrId text.");
    }
}
