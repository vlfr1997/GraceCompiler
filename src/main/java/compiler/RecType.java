package compiler;

/**
 * Created by d on 10/05/17.
 */

public class RecType {

    private String type;
    private int dimensions;


    public RecType(String tp, int dim)
    {
        type = tp;
        dimensions = dim;
    }

    public String getType() {
        return type;
    }

    public int getDimensions()
    {
        return dimensions;
    }

    public void setDimensions(int dim)
    {
        dimensions = dim;
    }
}