/* This file was generated by SableCC (http://www.sablecc.org/). */

package prefixa.node;

import prefixa.analysis.*;

@SuppressWarnings("nls")
public final class AComandoAtrib extends PComandoAtrib
{
    private PVar _var_;
    private TAtribuicao _atribuicao_;
    private PStmt _stmt_;

    public AComandoAtrib()
    {
        // Constructor
    }

    public AComandoAtrib(
        @SuppressWarnings("hiding") PVar _var_,
        @SuppressWarnings("hiding") TAtribuicao _atribuicao_,
        @SuppressWarnings("hiding") PStmt _stmt_)
    {
        // Constructor
        setVar(_var_);

        setAtribuicao(_atribuicao_);

        setStmt(_stmt_);

    }

    @Override
    public Object clone()
    {
        return new AComandoAtrib(
            cloneNode(this._var_),
            cloneNode(this._atribuicao_),
            cloneNode(this._stmt_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAComandoAtrib(this);
    }

    public PVar getVar()
    {
        return this._var_;
    }

    public void setVar(PVar node)
    {
        if(this._var_ != null)
        {
            this._var_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._var_ = node;
    }

    public TAtribuicao getAtribuicao()
    {
        return this._atribuicao_;
    }

    public void setAtribuicao(TAtribuicao node)
    {
        if(this._atribuicao_ != null)
        {
            this._atribuicao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._atribuicao_ = node;
    }

    public PStmt getStmt()
    {
        return this._stmt_;
    }

    public void setStmt(PStmt node)
    {
        if(this._stmt_ != null)
        {
            this._stmt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._stmt_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._var_)
            + toString(this._atribuicao_)
            + toString(this._stmt_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._var_ == child)
        {
            this._var_ = null;
            return;
        }

        if(this._atribuicao_ == child)
        {
            this._atribuicao_ = null;
            return;
        }

        if(this._stmt_ == child)
        {
            this._stmt_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._var_ == oldChild)
        {
            setVar((PVar) newChild);
            return;
        }

        if(this._atribuicao_ == oldChild)
        {
            setAtribuicao((TAtribuicao) newChild);
            return;
        }

        if(this._stmt_ == oldChild)
        {
            setStmt((PStmt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
