/* This file was generated by SableCC (http://www.sablecc.org/). */

package prefixa.node;

import prefixa.analysis.*;

@SuppressWarnings("nls")
public final class AVezesOpr extends POpr
{
    private TMult _mult_;
    private PStmt _stmt_;
    private PStmt _stmtL_;

    public AVezesOpr()
    {
        // Constructor
    }

    public AVezesOpr(
        @SuppressWarnings("hiding") TMult _mult_,
        @SuppressWarnings("hiding") PStmt _stmt_,
        @SuppressWarnings("hiding") PStmt _stmtL_)
    {
        // Constructor
        setMult(_mult_);

        setStmt(_stmt_);

        setStmtL(_stmtL_);

    }

    @Override
    public Object clone()
    {
        return new AVezesOpr(
            cloneNode(this._mult_),
            cloneNode(this._stmt_),
            cloneNode(this._stmtL_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVezesOpr(this);
    }

    public TMult getMult()
    {
        return this._mult_;
    }

    public void setMult(TMult node)
    {
        if(this._mult_ != null)
        {
            this._mult_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._mult_ = node;
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

    public PStmt getStmtL()
    {
        return this._stmtL_;
    }

    public void setStmtL(PStmt node)
    {
        if(this._stmtL_ != null)
        {
            this._stmtL_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._stmtL_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._mult_)
            + toString(this._stmt_)
            + toString(this._stmtL_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._mult_ == child)
        {
            this._mult_ = null;
            return;
        }

        if(this._stmt_ == child)
        {
            this._stmt_ = null;
            return;
        }

        if(this._stmtL_ == child)
        {
            this._stmtL_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._mult_ == oldChild)
        {
            setMult((TMult) newChild);
            return;
        }

        if(this._stmt_ == oldChild)
        {
            setStmt((PStmt) newChild);
            return;
        }

        if(this._stmtL_ == oldChild)
        {
            setStmtL((PStmt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}