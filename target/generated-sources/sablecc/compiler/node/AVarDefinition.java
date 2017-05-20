/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiler.node;

import java.util.*;
import compiler.analysis.*;

@SuppressWarnings("nls")
public final class AVarDefinition extends PVarDefinition
{
    private final LinkedList<PVarIdentifier> _varIdentifier_ = new LinkedList<PVarIdentifier>();
    private PVarType _varType_;

    public AVarDefinition()
    {
        // Constructor
    }

    public AVarDefinition(
        @SuppressWarnings("hiding") List<PVarIdentifier> _varIdentifier_,
        @SuppressWarnings("hiding") PVarType _varType_)
    {
        // Constructor
        setVarIdentifier(_varIdentifier_);

        setVarType(_varType_);

    }

    @Override
    public Object clone()
    {
        return new AVarDefinition(
            cloneList(this._varIdentifier_),
            cloneNode(this._varType_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVarDefinition(this);
    }

    public LinkedList<PVarIdentifier> getVarIdentifier()
    {
        return this._varIdentifier_;
    }

    public void setVarIdentifier(List<PVarIdentifier> list)
    {
        this._varIdentifier_.clear();
        this._varIdentifier_.addAll(list);
        for(PVarIdentifier e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    public PVarType getVarType()
    {
        return this._varType_;
    }

    public void setVarType(PVarType node)
    {
        if(this._varType_ != null)
        {
            this._varType_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._varType_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._varIdentifier_)
            + toString(this._varType_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._varIdentifier_.remove(child))
        {
            return;
        }

        if(this._varType_ == child)
        {
            this._varType_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PVarIdentifier> i = this._varIdentifier_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PVarIdentifier) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._varType_ == oldChild)
        {
            setVarType((PVarType) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
