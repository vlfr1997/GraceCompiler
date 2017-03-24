/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiler.analysis;

import java.util.*;
import compiler.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    public void caseAFuncDefProgram(AFuncDefProgram node)
    {
        defaultCase(node);
    }

    public void caseACommandProgram(ACommandProgram node)
    {
        defaultCase(node);
    }

    public void caseACommd(ACommd node)
    {
        defaultCase(node);
    }

    public void caseABlockBlock(ABlockBlock node)
    {
        defaultCase(node);
    }

    public void caseASemiStmt(ASemiStmt node)
    {
        defaultCase(node);
    }

    public void caseAAssignmentStmt(AAssignmentStmt node)
    {
        defaultCase(node);
    }

    public void caseABlockStmt(ABlockStmt node)
    {
        defaultCase(node);
    }

    public void caseAFuncCallStmt(AFuncCallStmt node)
    {
        defaultCase(node);
    }

    public void caseAIfStmt(AIfStmt node)
    {
        defaultCase(node);
    }

    public void caseAWhileStmt(AWhileStmt node)
    {
        defaultCase(node);
    }

    public void caseAReturnStmt(AReturnStmt node)
    {
        defaultCase(node);
    }

    public void caseAWithoutElseIfStmt(AWithoutElseIfStmt node)
    {
        defaultCase(node);
    }

    public void caseAWithElseIfStmt(AWithElseIfStmt node)
    {
        defaultCase(node);
    }

    public void caseASemiStmtWithElse(ASemiStmtWithElse node)
    {
        defaultCase(node);
    }

    public void caseAAssignmentStmtWithElse(AAssignmentStmtWithElse node)
    {
        defaultCase(node);
    }

    public void caseABlockStmtWithElse(ABlockStmtWithElse node)
    {
        defaultCase(node);
    }

    public void caseAFuncCallStmtWithElse(AFuncCallStmtWithElse node)
    {
        defaultCase(node);
    }

    public void caseAIfElseStmtWithElse(AIfElseStmtWithElse node)
    {
        defaultCase(node);
    }

    public void caseAWhileStmtWithElse(AWhileStmtWithElse node)
    {
        defaultCase(node);
    }

    public void caseAReturnStmtWithElse(AReturnStmtWithElse node)
    {
        defaultCase(node);
    }

    public void caseAFactorExpr(AFactorExpr node)
    {
        defaultCase(node);
    }

    public void caseAPlusExpr(APlusExpr node)
    {
        defaultCase(node);
    }

    public void caseAMinusExpr(AMinusExpr node)
    {
        defaultCase(node);
    }

    public void caseAExprParFactor(AExprParFactor node)
    {
        defaultCase(node);
    }

    public void caseAMultFactor(AMultFactor node)
    {
        defaultCase(node);
    }

    public void caseADivFactor(ADivFactor node)
    {
        defaultCase(node);
    }

    public void caseAModFactor(AModFactor node)
    {
        defaultCase(node);
    }

    public void caseATermExprPar(ATermExprPar node)
    {
        defaultCase(node);
    }

    public void caseAParExprPar(AParExprPar node)
    {
        defaultCase(node);
    }

    public void caseATermTermSign(ATermTermSign node)
    {
        defaultCase(node);
    }

    public void caseASignPlusTermSign(ASignPlusTermSign node)
    {
        defaultCase(node);
    }

    public void caseASignMinusTermSign(ASignMinusTermSign node)
    {
        defaultCase(node);
    }

    public void caseAIntConstTerm(AIntConstTerm node)
    {
        defaultCase(node);
    }

    public void caseACharConstTerm(ACharConstTerm node)
    {
        defaultCase(node);
    }

    public void caseALValueTerm(ALValueTerm node)
    {
        defaultCase(node);
    }

    public void caseAFuncCallTerm(AFuncCallTerm node)
    {
        defaultCase(node);
    }

    public void caseACondCond(ACondCond node)
    {
        defaultCase(node);
    }

    public void caseACondOrCond(ACondOrCond node)
    {
        defaultCase(node);
    }

    public void caseACondCondAnd(ACondCondAnd node)
    {
        defaultCase(node);
    }

    public void caseACondAndCondAnd(ACondAndCondAnd node)
    {
        defaultCase(node);
    }

    public void caseACondCondNot(ACondCondNot node)
    {
        defaultCase(node);
    }

    public void caseACondNotCondNot(ACondNotCondNot node)
    {
        defaultCase(node);
    }

    public void caseAExprCondPar(AExprCondPar node)
    {
        defaultCase(node);
    }

    public void caseACondCondPar(ACondCondPar node)
    {
        defaultCase(node);
    }

    public void caseACondRelatCondRelat(ACondRelatCondRelat node)
    {
        defaultCase(node);
    }

    public void caseAEqualRelatOper(AEqualRelatOper node)
    {
        defaultCase(node);
    }

    public void caseANEqualRelatOper(ANEqualRelatOper node)
    {
        defaultCase(node);
    }

    public void caseALessRelatOper(ALessRelatOper node)
    {
        defaultCase(node);
    }

    public void caseALessEqualRelatOper(ALessEqualRelatOper node)
    {
        defaultCase(node);
    }

    public void caseAGreaterRelatOper(AGreaterRelatOper node)
    {
        defaultCase(node);
    }

    public void caseAGreaterEqualRelatOper(AGreaterEqualRelatOper node)
    {
        defaultCase(node);
    }

    public void caseAFunctionDefinition(AFunctionDefinition node)
    {
        defaultCase(node);
    }

    public void caseAHeaderHeader(AHeaderHeader node)
    {
        defaultCase(node);
    }

    public void caseAFparFunctionParameters(AFparFunctionParameters node)
    {
        defaultCase(node);
    }

    public void caseASemiFparSemiFunctionParameters(ASemiFparSemiFunctionParameters node)
    {
        defaultCase(node);
    }

    public void caseAFparDefFparametersDefinition(AFparDefFparametersDefinition node)
    {
        defaultCase(node);
    }

    public void caseACommaIdCommaIdentifier(ACommaIdCommaIdentifier node)
    {
        defaultCase(node);
    }

    public void caseADataRetType(ADataRetType node)
    {
        defaultCase(node);
    }

    public void caseANothRetType(ANothRetType node)
    {
        defaultCase(node);
    }

    public void caseAIntTypeDataType(AIntTypeDataType node)
    {
        defaultCase(node);
    }

    public void caseACharTypeDataType(ACharTypeDataType node)
    {
        defaultCase(node);
    }

    public void caseATypeType(ATypeType node)
    {
        defaultCase(node);
    }

    public void caseATypeFparType(ATypeFparType node)
    {
        defaultCase(node);
    }

    public void caseAArrayTypeConstIntBrackets(AArrayTypeConstIntBrackets node)
    {
        defaultCase(node);
    }

    public void caseAEmptyEmptyBrackets(AEmptyEmptyBrackets node)
    {
        defaultCase(node);
    }

    public void caseAFuncDefLocalDefinition(AFuncDefLocalDefinition node)
    {
        defaultCase(node);
    }

    public void caseAFuncDeclLocalDefinition(AFuncDeclLocalDefinition node)
    {
        defaultCase(node);
    }

    public void caseAVarDefLocalDefinition(AVarDefLocalDefinition node)
    {
        defaultCase(node);
    }

    public void caseAVarVariableDefinition(AVarVariableDefinition node)
    {
        defaultCase(node);
    }

    public void caseAFuncDeclFunctionDeclaration(AFuncDeclFunctionDeclaration node)
    {
        defaultCase(node);
    }

    public void caseAFuncCallFuncCall(AFuncCallFuncCall node)
    {
        defaultCase(node);
    }

    public void caseAExprCommaExprFuncCallExpr(AExprCommaExprFuncCallExpr node)
    {
        defaultCase(node);
    }

    public void caseACommaExprCommaExpr(ACommaExprCommaExpr node)
    {
        defaultCase(node);
    }

    public void caseAIdLValue(AIdLValue node)
    {
        defaultCase(node);
    }

    public void caseAStringLiteralLValue(AStringLiteralLValue node)
    {
        defaultCase(node);
    }

    public void caseALValueLValue(ALValueLValue node)
    {
        defaultCase(node);
    }

    public void caseTComment(TComment node)
    {
        defaultCase(node);
    }

    public void caseTPlus(TPlus node)
    {
        defaultCase(node);
    }

    public void caseTMinus(TMinus node)
    {
        defaultCase(node);
    }

    public void caseTMult(TMult node)
    {
        defaultCase(node);
    }

    public void caseTDivision(TDivision node)
    {
        defaultCase(node);
    }

    public void caseTDiv(TDiv node)
    {
        defaultCase(node);
    }

    public void caseTMod(TMod node)
    {
        defaultCase(node);
    }

    public void caseTAssign(TAssign node)
    {
        defaultCase(node);
    }

    public void caseTEqual(TEqual node)
    {
        defaultCase(node);
    }

    public void caseTNEqual(TNEqual node)
    {
        defaultCase(node);
    }

    public void caseTLess(TLess node)
    {
        defaultCase(node);
    }

    public void caseTLessEqual(TLessEqual node)
    {
        defaultCase(node);
    }

    public void caseTGreater(TGreater node)
    {
        defaultCase(node);
    }

    public void caseTGreaterEqual(TGreaterEqual node)
    {
        defaultCase(node);
    }

    public void caseTLPar(TLPar node)
    {
        defaultCase(node);
    }

    public void caseTRPar(TRPar node)
    {
        defaultCase(node);
    }

    public void caseTLBrc(TLBrc node)
    {
        defaultCase(node);
    }

    public void caseTRBrc(TRBrc node)
    {
        defaultCase(node);
    }

    public void caseTLBkt(TLBkt node)
    {
        defaultCase(node);
    }

    public void caseTRBkt(TRBkt node)
    {
        defaultCase(node);
    }

    public void caseTSemi(TSemi node)
    {
        defaultCase(node);
    }

    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    public void caseTColon(TColon node)
    {
        defaultCase(node);
    }

    public void caseTNumber(TNumber node)
    {
        defaultCase(node);
    }

    public void caseTConstChar(TConstChar node)
    {
        defaultCase(node);
    }

    public void caseTConstString(TConstString node)
    {
        defaultCase(node);
    }

    public void caseTChar(TChar node)
    {
        defaultCase(node);
    }

    public void caseTInt(TInt node)
    {
        defaultCase(node);
    }

    public void caseTAnd(TAnd node)
    {
        defaultCase(node);
    }

    public void caseTOr(TOr node)
    {
        defaultCase(node);
    }

    public void caseTNot(TNot node)
    {
        defaultCase(node);
    }

    public void caseTIf(TIf node)
    {
        defaultCase(node);
    }

    public void caseTThen(TThen node)
    {
        defaultCase(node);
    }

    public void caseTElse(TElse node)
    {
        defaultCase(node);
    }

    public void caseTWhile(TWhile node)
    {
        defaultCase(node);
    }

    public void caseTDo(TDo node)
    {
        defaultCase(node);
    }

    public void caseTNothing(TNothing node)
    {
        defaultCase(node);
    }

    public void caseTFunction(TFunction node)
    {
        defaultCase(node);
    }

    public void caseTReference(TReference node)
    {
        defaultCase(node);
    }

    public void caseTReturn(TReturn node)
    {
        defaultCase(node);
    }

    public void caseTVariable(TVariable node)
    {
        defaultCase(node);
    }

    public void caseTIdentifier(TIdentifier node)
    {
        defaultCase(node);
    }

    public void caseTWhiteSpaces(TWhiteSpaces node)
    {
        defaultCase(node);
    }

    public void caseTEscSequence(TEscSequence node)
    {
        defaultCase(node);
    }

    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
