/* This file was generated by SableCC (http://www.sablecc.org/). */

package prefixa.node;

import prefixa.analysis.*;

@SuppressWarnings("nls")
public final class ACharConstante extends PConstante
{
    private TCharVar _charVar_;

    public ACharConstante()
    {
        // Constructor
    }

    public ACharConstante(
        @SuppressWarnings("hiding") TCharVar _charVar_)
    {
        // Constructor
        setCharVar(_charVar_);

    }

    @Override
    public Object clone()
    {
        return new ACharConstante(
            cloneNode(this._charVar_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACharConstante(this);
    }

    public TCharVar getCharVar()
    {
        return this._charVar_;
    }

    public void setCharVar(TCharVar node)
    {
        if(this._charVar_ != null)
        {
            this._charVar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._charVar_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._charVar_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._charVar_ == child)
        {
            this._charVar_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._charVar_ == oldChild)
        {
            setCharVar((TCharVar) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
