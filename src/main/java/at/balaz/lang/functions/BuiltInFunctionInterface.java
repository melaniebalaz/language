package at.balaz.lang.functions;

import at.balaz.lang.primitives.DataTypeInterface;

import java.util.List;

public interface BuiltInFunctionInterface extends DataTypeInterface{

    public String getName();
    public int getParameterCount();
    public DataTypeInterface execute(List<DataTypeInterface> parameters);
}
