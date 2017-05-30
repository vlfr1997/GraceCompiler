package compiler;

/**
 * Created by bill on 30/05/17.
 */
public class Error
{

    public void varDeclaration(Record rec)
    {
        System.out.println("[line:"+rec.getLine()+"]:Error variable "+ rec.getName()+ " already declared in the same scope");
    }

    public void varUndefined(String varName, int line)
    {
        System.out.println("[line:"+line+"]:Error variable "+ varName+ " is undeclared");
    }

    public void returnStatement(Record rec)
    {
        System.out.println("[line:"+rec.getLine()+"]:Error in function "+ rec.getName()+ " no return statement");
    }

    public void returnDiffType(String type)
    {
        System.out.println("[line:???]:Error return type expects "+type+", but you gave nothing");
    }

    public void returnDiffType(RecType recType, String type)
    {
        System.out.println("[line:"+recType.getLine()+"]:Error return type expects "+type+", but you gave "+recType.getType()+" "+recType.getDimensions());
    }


    public void nothingFunctCall(RecType recType)
    {
        System.out.println("[line:"+recType.getLine()+"]:Error in function call statement "+ recType.getVarName()+ " type must be nothing");
    }

    public void undeclaredFunct(String name, int line)
    {
        System.out.println("[line:"+line+"]:Error call to function with name "+ name+ " but function is not declared or defined");
    }

    public void callFunctionVarInsted(Record rec, int line)
    {
        System.out.println("[line:"+line+"]:Error call for function with name "+ rec.getName()+ " but its variable instead, declared in line:"+rec.getLine());
    }

    public void callFunctionArguments(RecordFunction rec, int line)
    {
        System.out.println("[line:"+line+"]:Error call for function with name "+ rec.getName()+ " but has different number of argument function header is ");
        rec.printHeader();
    }

    public void callFunctionParamRef(int parameterPos, int line)
    {
        System.out.println("[line:"+line+"]:Error the "+parameterPos +" parameter must be lvalue");
    }

    public void callFunctionParamType(int parameterPos, int line, Record rec, int expectedDimensions, String type, int dimensions)
    {
        System.out.println("[line:"+line+"]:Error the "+parameterPos +" parameter must be "+rec.getType()+" dimensions "+expectedDimensions+"instead of type "+type+" dimensions "+dimensions);
    }

    public void mainFunctType(Record rec)
    {
        System.out.println("[line:"+rec.getLine()+"]:Error main function must be nothing");
    }

    public void mainFunctArgs(Record rec)
    {
        System.out.println("[line:"+rec.getLine()+"]:Error main function must have 0 arguments");
    }

    public void arrayIndex(String type , int line)
    {
        System.out.println("[line:"+line+"]:Error array index must be int not "+type);
    }
}