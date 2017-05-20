/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiler.node;

import compiler.analysis.*;

@SuppressWarnings("nls")
public final class AEqualRelationOper extends PRelationOper
{
    private TEqual _equal_;

    public AEqualRelationOper()
    {
        // Constructor
    }

    public AEqualRelationOper(
        @SuppressWarnings("hiding") TEqual _equal_)
    {
        // Constructor
        setEqual(_equal_);

    }

    @Override
    public Object clone()
    {
        return new AEqualRelationOper(
            cloneNode(this._equal_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEqualRelationOper(this);
    }

    public TEqual getEqual()
    {
        return this._equal_;
    }

    public void setEqual(TEqual node)
    {
        if(this._equal_ != null)
        {
            this._equal_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._equal_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._equal_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._equal_ == child)
        {
            this._equal_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._equal_ == oldChild)
        {
            setEqual((TEqual) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}