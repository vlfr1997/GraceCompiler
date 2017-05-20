/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiler.node;

import compiler.analysis.*;

@SuppressWarnings("nls")
public final class AValLvalue extends PLvalue
{
    private PLvalue _lvalue_;
    private PExpression _expression_;

    public AValLvalue()
    {
        // Constructor
    }

    public AValLvalue(
        @SuppressWarnings("hiding") PLvalue _lvalue_,
        @SuppressWarnings("hiding") PExpression _expression_)
    {
        // Constructor
        setLvalue(_lvalue_);

        setExpression(_expression_);

    }

    @Override
    public Object clone()
    {
        return new AValLvalue(
            cloneNode(this._lvalue_),
            cloneNode(this._expression_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAValLvalue(this);
    }

    public PLvalue getLvalue()
    {
        return this._lvalue_;
    }

    public void setLvalue(PLvalue node)
    {
        if(this._lvalue_ != null)
        {
            this._lvalue_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lvalue_ = node;
    }

    public PExpression getExpression()
    {
        return this._expression_;
    }

    public void setExpression(PExpression node)
    {
        if(this._expression_ != null)
        {
            this._expression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expression_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lvalue_)
            + toString(this._expression_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lvalue_ == child)
        {
            this._lvalue_ = null;
            return;
        }

        if(this._expression_ == child)
        {
            this._expression_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lvalue_ == oldChild)
        {
            setLvalue((PLvalue) newChild);
            return;
        }

        if(this._expression_ == oldChild)
        {
            setExpression((PExpression) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
