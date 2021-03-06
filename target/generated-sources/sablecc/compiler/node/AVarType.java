/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiler.node;

import java.util.*;
import compiler.analysis.*;

@SuppressWarnings("nls")
public final class AVarType extends PVarType
{
    private PGeneralType _generalType_;
    private final LinkedList<PConstIntBr> _constIntBr_ = new LinkedList<PConstIntBr>();

    public AVarType()
    {
        // Constructor
    }

    public AVarType(
        @SuppressWarnings("hiding") PGeneralType _generalType_,
        @SuppressWarnings("hiding") List<PConstIntBr> _constIntBr_)
    {
        // Constructor
        setGeneralType(_generalType_);

        setConstIntBr(_constIntBr_);

    }

    @Override
    public Object clone()
    {
        return new AVarType(
            cloneNode(this._generalType_),
            cloneList(this._constIntBr_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVarType(this);
    }

    public PGeneralType getGeneralType()
    {
        return this._generalType_;
    }

    public void setGeneralType(PGeneralType node)
    {
        if(this._generalType_ != null)
        {
            this._generalType_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._generalType_ = node;
    }

    public LinkedList<PConstIntBr> getConstIntBr()
    {
        return this._constIntBr_;
    }

    public void setConstIntBr(List<PConstIntBr> list)
    {
        this._constIntBr_.clear();
        this._constIntBr_.addAll(list);
        for(PConstIntBr e : list)
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
            + toString(this._generalType_)
            + toString(this._constIntBr_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._generalType_ == child)
        {
            this._generalType_ = null;
            return;
        }

        if(this._constIntBr_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._generalType_ == oldChild)
        {
            setGeneralType((PGeneralType) newChild);
            return;
        }

        for(ListIterator<PConstIntBr> i = this._constIntBr_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PConstIntBr) newChild);
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
