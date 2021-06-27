/* This file was generated by SableCC (http://www.sablecc.org/). */

package prefixa.node;

import prefixa.analysis.*;

@SuppressWarnings("nls")
public final class ACompStmtStatement extends PStatement
{
    private PCompoundStatement _compoundStatement_;

    public ACompStmtStatement()
    {
        // Constructor
    }

    public ACompStmtStatement(
        @SuppressWarnings("hiding") PCompoundStatement _compoundStatement_)
    {
        // Constructor
        setCompoundStatement(_compoundStatement_);

    }

    @Override
    public Object clone()
    {
        return new ACompStmtStatement(
            cloneNode(this._compoundStatement_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACompStmtStatement(this);
    }

    public PCompoundStatement getCompoundStatement()
    {
        return this._compoundStatement_;
    }

    public void setCompoundStatement(PCompoundStatement node)
    {
        if(this._compoundStatement_ != null)
        {
            this._compoundStatement_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._compoundStatement_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._compoundStatement_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._compoundStatement_ == child)
        {
            this._compoundStatement_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._compoundStatement_ == oldChild)
        {
            setCompoundStatement((PCompoundStatement) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
