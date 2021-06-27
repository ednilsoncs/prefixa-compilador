/* This file was generated by SableCC (http://www.sablecc.org/). */

package prefixa.node;

import java.util.*;
import prefixa.analysis.*;

@SuppressWarnings("nls")
public final class AParametros extends PParametros
{
    private PStmt _stmt_;
    private final LinkedList<PParamAdicional> _paramAdicional_ = new LinkedList<PParamAdicional>();

    public AParametros()
    {
        // Constructor
    }

    public AParametros(
        @SuppressWarnings("hiding") PStmt _stmt_,
        @SuppressWarnings("hiding") List<PParamAdicional> _paramAdicional_)
    {
        // Constructor
        setStmt(_stmt_);

        setParamAdicional(_paramAdicional_);

    }

    @Override
    public Object clone()
    {
        return new AParametros(
            cloneNode(this._stmt_),
            cloneList(this._paramAdicional_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParametros(this);
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

    public LinkedList<PParamAdicional> getParamAdicional()
    {
        return this._paramAdicional_;
    }

    public void setParamAdicional(List<PParamAdicional> list)
    {
        this._paramAdicional_.clear();
        this._paramAdicional_.addAll(list);
        for(PParamAdicional e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._stmt_)
            + toString(this._paramAdicional_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._stmt_ == child)
        {
            this._stmt_ = null;
            return;
        }

        if(this._paramAdicional_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._stmt_ == oldChild)
        {
            setStmt((PStmt) newChild);
            return;
        }

        for(ListIterator<PParamAdicional> i = this._paramAdicional_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PParamAdicional) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
