/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.grammars.java_1_7.node;

import org.sablecc.grammars.java_1_7.analysis.*;

@SuppressWarnings("nls")
public final class TSuperKeyword extends Token
{
    public TSuperKeyword()
    {
        super.setText("super");
    }

    public TSuperKeyword(int line, int pos)
    {
        super.setText("super");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TSuperKeyword(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSuperKeyword(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TSuperKeyword text.");
    }
}