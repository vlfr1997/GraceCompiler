/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiler.node;

import compiler.analysis.*;

@SuppressWarnings("nls")
public final class AEmptyEmptyBrackets extends PEmptyBrackets
{
    private TLBkt _lBkt_;
    private TRBkt _rBkt_;

    public AEmptyEmptyBrackets()
    {
        // Constructor
    }

    public AEmptyEmptyBrackets(
        @SuppressWarnings("hiding") TLBkt _lBkt_,
        @SuppressWarnings("hiding") TRBkt _rBkt_)
    {
        // Constructor
        setLBkt(_lBkt_);

        setRBkt(_rBkt_);

    }

    @Override
    public Object clone()
    {
        return new AEmptyEmptyBrackets(
            cloneNode(this._lBkt_),
            cloneNode(this._rBkt_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEmptyEmptyBrackets(this);
    }

    public TLBkt getLBkt()
    {
        return this._lBkt_;
    }

    public void setLBkt(TLBkt node)
    {
        if(this._lBkt_ != null)
        {
            this._lBkt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lBkt_ = node;
    }

    public TRBkt getRBkt()
    {
        return this._rBkt_;
    }

    public void setRBkt(TRBkt node)
    {
        if(this._rBkt_ != null)
        {
            this._rBkt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rBkt_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lBkt_)
            + toString(this._rBkt_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lBkt_ == child)
        {
            this._lBkt_ = null;
            return;
        }

        if(this._rBkt_ == child)
        {
            this._rBkt_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lBkt_ == oldChild)
        {
            setLBkt((TLBkt) newChild);
            return;
        }

        if(this._rBkt_ == oldChild)
        {
            setRBkt((TRBkt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
