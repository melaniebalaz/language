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

        if (parameters.size()>2){
            throw new RuntimeException("Incorrect number of parameters");
        }
        if (parameters.get(0) instanceof GetInterface){
            return ((GetInterface) parameters.get(0)).getData(parameters.get(1));
        }
        else throw new RuntimeException("The get function cannot be executed on a " + parameters.get(0).getClass().getSimpleName());
    }

    @Override
    public Object getRawType() {
        return null;
    }
}
