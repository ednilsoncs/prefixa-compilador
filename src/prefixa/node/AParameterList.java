/* This file was generated by SableCC (http://www.sablecc.org/). */

package prefixa.node;

import java.util.*;
import prefixa.analysis.*;

@SuppressWarnings("nls")
public final class AParameterList extends PParameterList
{
    private PParameterDeclaration _parameterDeclaration_;
    private final LinkedList<PParameterListTail> _parameterListTail_ = new LinkedList<PParameterListTail>();

    public AParameterList()
    {
        // Constructor
    }

    public AParameterList(
        @SuppressWarnings("hiding") PParameterDeclaration _parameterDeclaration_,
        @SuppressWarnings("hiding") List<PParameterListTail> _parameterListTail_)
    {
        // Constructor
        setParameterDeclaration(_parameterDeclaration_);

        setParameterListTail(_parameterListTail_);

    }

    @Override
    public Object clone()
    {
        return new AParameterList(
            cloneNode(this._parameterDeclaration_),
            cloneList(this._parameterListTail_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParameterList(this);
    }

    public PParameterDeclaration getParameterDeclaration()
    {
        return this._parameterDeclaration_;
    }

    public void setParameterDeclaration(PParameterDeclaration node)
    {
        if(this._parameterDeclaration_ != null)
        {
            this._parameterDeclaration_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parameterDeclaration_ = node;
    }

    public LinkedList<PParameterListTail> getParameterListTail()
    {
        return this._parameterListTail_;
    }

    public void setParameterListTail(List<PParameterListTail> list)
    {
        this._parameterListTail_.clear();
        this._parameterListTail_.addAll(list);
        for(PParameterListTail e : list)
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
            + toString(this._parameterDeclaration_)
            + toString(this._parameterListTail_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._parameterDeclaration_ == child)
        {
            this._parameterDeclaration_ = null;
            return;
        }

        if(this._parameterListTail_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._parameterDeclaration_ == oldChild)
        {
            setParameterDeclaration((PParameterDeclaration) newChild);
            return;
        }

        for(ListIterator<PParameterListTail> i = this._parameterListTail_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PParameterListTail) newChild);
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
