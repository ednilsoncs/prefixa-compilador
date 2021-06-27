/* This file was generated by SableCC (http://www.sablecc.org/). */

package prefixa.node;

import prefixa.analysis.*;

@SuppressWarnings("nls")
public final class AIfThenElseStatement extends PStatement
{
    private TIfId _ifId_;
    private TLPar _lPar_;
    private PCondicao _condicao_;
    private TRPar _rPar_;
    private PCompoundStatement _thenCompStmt_;
    private TElseId _elseId_;
    private PCompoundStatement _elseCompStmt_;

    public AIfThenElseStatement()
    {
        // Constructor
    }

    public AIfThenElseStatement(
        @SuppressWarnings("hiding") TIfId _ifId_,
        @SuppressWarnings("hiding") TLPar _lPar_,
        @SuppressWarnings("hiding") PCondicao _condicao_,
        @SuppressWarnings("hiding") TRPar _rPar_,
        @SuppressWarnings("hiding") PCompoundStatement _thenCompStmt_,
        @SuppressWarnings("hiding") TElseId _elseId_,
        @SuppressWarnings("hiding") PCompoundStatement _elseCompStmt_)
    {
        // Constructor
        setIfId(_ifId_);

        setLPar(_lPar_);

        setCondicao(_condicao_);

        setRPar(_rPar_);

        setThenCompStmt(_thenCompStmt_);

        setElseId(_elseId_);

        setElseCompStmt(_elseCompStmt_);

    }

    @Override
    public Object clone()
    {
        return new AIfThenElseStatement(
            cloneNode(this._ifId_),
            cloneNode(this._lPar_),
            cloneNode(this._condicao_),
            cloneNode(this._rPar_),
            cloneNode(this._thenCompStmt_),
            cloneNode(this._elseId_),
            cloneNode(this._elseCompStmt_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIfThenElseStatement(this);
    }

    public TIfId getIfId()
    {
        return this._ifId_;
    }

    public void setIfId(TIfId node)
    {
        if(this._ifId_ != null)
        {
            this._ifId_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ifId_ = node;
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

    public PCompoundStatement getThenCompStmt()
    {
        return this._thenCompStmt_;
    }

    public void setThenCompStmt(PCompoundStatement node)
    {
        if(this._thenCompStmt_ != null)
        {
            this._thenCompStmt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._thenCompStmt_ = node;
    }

    public TElseId getElseId()
    {
        return this._elseId_;
    }

    public void setElseId(TElseId node)
    {
        if(this._elseId_ != null)
        {
            this._elseId_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._elseId_ = node;
    }

    public PCompoundStatement getElseCompStmt()
    {
        return this._elseCompStmt_;
    }

    public void setElseCompStmt(PCompoundStatement node)
    {
        if(this._elseCompStmt_ != null)
        {
            this._elseCompStmt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._elseCompStmt_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._ifId_)
            + toString(this._lPar_)
            + toString(this._condicao_)
            + toString(this._rPar_)
            + toString(this._thenCompStmt_)
            + toString(this._elseId_)
            + toString(this._elseCompStmt_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._ifId_ == child)
        {
            this._ifId_ = null;
            return;
        }

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

        if(this._thenCompStmt_ == child)
        {
            this._thenCompStmt_ = null;
            return;
        }

        if(this._elseId_ == child)
        {
            this._elseId_ = null;
            return;
        }

        if(this._elseCompStmt_ == child)
        {
            this._elseCompStmt_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._ifId_ == oldChild)
        {
            setIfId((TIfId) newChild);
            return;
        }

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

        if(this._thenCompStmt_ == oldChild)
        {
            setThenCompStmt((PCompoundStatement) newChild);
            return;
        }

        if(this._elseId_ == oldChild)
        {
            setElseId((TElseId) newChild);
            return;
        }

        if(this._elseCompStmt_ == oldChild)
        {
            setElseCompStmt((PCompoundStatement) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
