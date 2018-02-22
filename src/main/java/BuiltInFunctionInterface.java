import primitives.DataTypeInterface;

import java.util.List;

interface BuiltInFunctionInterface extends DataTypeInterface{

    public String getName();
    public int getParameterCount();
    public DataTypeInterface execute(List<DataTypeInterface> parameters);
}
