/* This file was generated by SableCC (http://www.sablecc.org/). */

package prefixa.node;

import prefixa.analysis.*;

@SuppressWarnings("nls")
public final class AConstanExpUn extends PExpUn
{
    private PConstante _constante_;

    public AConstanExpUn()
    {
        // Constructor
    }

    public AConstanExpUn(
        @SuppressWarnings("hiding") PConstante _constante_)
    {
        // Constructor
        setConstante(_constante_);

    }

    @Override
    public Object clone()
    {
        return new AConstanExpUn(
            cloneNode(this._constante_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAConstanExpUn(this);
    }

    public PConstante getConstante()
    {
        return this._constante_;
    }

    public void setConstante(PConstante node)
    {
        if(this._constante_ != null)
        {
            this._constante_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._constante_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._constante_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._constante_ == child)
        {
            this._constante_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._constante_ == oldChild)
        {
            setConstante((PConstante) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}