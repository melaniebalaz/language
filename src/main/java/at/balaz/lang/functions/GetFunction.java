package at.balaz.lang.functions;

import at.balaz.lang.primitives.DataTypeInterface;

import java.util.List;

public class GetFunction implements BuiltInFunctionInterface{

    private final String name ="get";
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getParameterCount() {
        return 2;
    }

    @Override
    public DataTypeInterface execute(List<DataTypeInterface> parameters) {
        return null;
    }

    @Override
    public Object getRawType() {
        return null;
    }
}
