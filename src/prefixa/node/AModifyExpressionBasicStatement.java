/* This file was generated by SableCC (http://www.sablecc.org/). */

package prefixa.node;

import prefixa.analysis.*;

@SuppressWarnings("nls")
public final class AModifyExpressionBasicStatement extends PBasicStatement
{
    private PModifyExpression _modifyExpression_;

    public AModifyExpressionBasicStatement()
    {
        // Constructor
    }

    public AModifyExpressionBasicStatement(
        @SuppressWarnings("hiding") PModifyExpression _modifyExpression_)
    {
        // Constructor
        setModifyExpression(_modifyExpression_);

    }

    @Override
    public Object clone()
    {
        return new AModifyExpressionBasicStatement(
            cloneNode(this._modifyExpression_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAModifyExpressionBasicStatement(this);
    }

    public PModifyExpression getModifyExpression()
    {
        return this._modifyExpression_;
    }

    public void setModifyExpression(PModifyExpression node)
    {
        if(this._modifyExpression_ != null)
        {
            this._modifyExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._modifyExpression_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._modifyExpression_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._modifyExpression_ == child)
        {
            this._modifyExpression_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._modifyExpression_ == oldChild)
        {
            setModifyExpression((PModifyExpression) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
