/* This file was generated by SableCC (http://www.sablecc.org/). */

package prefixa.node;

import prefixa.analysis.*;

@SuppressWarnings("nls")
public final class ACharType extends PType
{
    private TCharId _charId_;

    public ACharType()
    {
        // Constructor
    }

    public ACharType(
        @SuppressWarnings("hiding") TCharId _charId_)
    {
        // Constructor
        setCharId(_charId_);

    }

    @Override
    public Object clone()
    {
        return new ACharType(
            cloneNode(this._charId_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACharType(this);
    }

    public TCharId getCharId()
    {
        return this._charId_;
    }

    public void setCharId(TCharId node)
    {
        if(this._charId_ != null)
        {
            this._charId_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._charId_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._charId_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._charId_ == child)
        {
            this._charId_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._charId_ == oldChild)
        {
            setCharId((TCharId) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}