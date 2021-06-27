/* This file was generated by SableCC (http://www.sablecc.org/). */

package prefixa.node;

import prefixa.analysis.*;

@SuppressWarnings("nls")
public final class ANoneTipoRetornoFunc extends PTipoRetornoFunc
{
    private TNoneId _noneId_;

    public ANoneTipoRetornoFunc()
    {
        // Constructor
    }

    public ANoneTipoRetornoFunc(
        @SuppressWarnings("hiding") TNoneId _noneId_)
    {
        // Constructor
        setNoneId(_noneId_);

    }

    @Override
    public Object clone()
    {
        return new ANoneTipoRetornoFunc(
            cloneNode(this._noneId_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANoneTipoRetornoFunc(this);
    }

    public TNoneId getNoneId()
    {
        return this._noneId_;
    }

    public void setNoneId(TNoneId node)
    {
        if(this._noneId_ != null)
        {
            this._noneId_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._noneId_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._noneId_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._noneId_ == child)
        {
            this._noneId_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._noneId_ == oldChild)
        {
            setNoneId((TNoneId) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
