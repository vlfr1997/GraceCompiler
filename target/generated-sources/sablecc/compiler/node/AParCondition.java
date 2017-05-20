/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiler.node;

import compiler.analysis.*;

@SuppressWarnings("nls")
public final class AParCondition extends PCondition
{
    private PCondition _condition_;

    public AParCondition()
    {
        // Constructor
    }

    public AParCondition(
        @SuppressWarnings("hiding") PCondition _condition_)
    {
        // Constructor
        setCondition(_condition_);

    }

    @Override
    public Object clone()
    {
        return new AParCondition(
            cloneNode(this._condition_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParCondition(this);
    }

    public PCondition getCondition()
    {
        return this._condition_;
    }

    public void setCondition(PCondition node)
    {
        if(this._condition_ != null)
        {
            this._condition_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._condition_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._condition_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._condition_ == child)
        {
            this._condition_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._condition_ == oldChild)
        {
            setCondition((PCondition) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
