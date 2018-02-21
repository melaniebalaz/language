import java.util.List;

interface BuiltInFunctionInterface {

    public String getName();
    public int getParameterCount();
    public Object execute(List<Object> parameters);
}
