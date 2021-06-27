/* This file was generated by SableCC (http://www.sablecc.org/). */

package prefixa.node;

import prefixa.analysis.*;

@SuppressWarnings("nls")
public final class ACondCondicao extends PCondicao
{
    private TLPar _lPar_;
    private PCondicao _condicao_;
    private TRPar _rPar_;

    public ACondCondicao()
    {
        // Constructor
    }

    public ACondCondicao(
        @SuppressWarnings("hiding") TLPar _lPar_,
        @SuppressWarnings("hiding") PCondicao _condicao_,
        @SuppressWarnings("hiding") TRPar _rPar_)
    {
        // Constructor
        setLPar(_lPar_);

        setCondicao(_condicao_);

        setRPar(_rPar_);

    }

    @Override
    public Object clone()
    {
        return new ACondCondicao(
            cloneNode(this._lPar_),
            cloneNode(this._condicao_),
            cloneNode(this._rPar_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACondCondicao(this);
    }

    public TLPar getLPar()
    {
        return this._lPar_;
    }

    public void setLPar(TLPar node)
    {
        if(this._lPar_ != null)
        {
            this._lPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lPar_ = node;
    }

    public PCondicao getCondicao()
    {
        return this._condicao_;
    }

    public void setCondicao(PCondicao node)
    {
        if(this._condicao_ != null)
        {
            this._condicao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._condicao_ = node;
    }

    public TRPar getRPar()
    {
        return this._rPar_;
    }

    public void setRPar(TRPar node)
    {
        if(this._rPar_ != null)
        {
            this._rPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rPar_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lPar_)
            + toString(this._condicao_)
            + toString(this._rPar_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lPar_ == child)
        {
            this._lPar_ = null;
            return;
        }

        if(this._condicao_ == child)
        {
            this._condicao_ = null;
            return;
        }

        if(this._rPar_ == child)
        {
            this._rPar_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lPar_ == oldChild)
        {
            setLPar((TLPar) newChild);
            return;
        }

        if(this._condicao_ == oldChild)
        {
            setCondicao((PCondicao) newChild);
            return;
        }

        if(this._rPar_ == oldChild)
        {
            setRPar((TRPar) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}