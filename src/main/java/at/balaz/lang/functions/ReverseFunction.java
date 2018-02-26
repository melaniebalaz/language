package at.balaz.lang.functions;

import at.balaz.lang.primitives.DataTypeInterface;

import java.util.List;

public class ReverseFunction implements BuiltInFunctionInterface {

    String name = "reverse";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getParameterCount() {
        return 1;
    }

    @Override
    public DataTypeInterface execute(List<DataTypeInterface> parameters) {
        if (parameters.size()>1){
            throw new RuntimeException("Incorrect number of parameters");
        }
        if (parameters.get(0) instanceof ReversibleInterface){
            return ((ReversibleInterface) parameters.get(0)).reverseData();
        }
        else throw new RuntimeException(parameters.get(0).getClass().getSimpleName() + "is not reversable");
    }

    @Override
    public Object getRawType() {
        return null;
    }
}
