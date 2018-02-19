import java.util.List;

interface BuiltInFunction {

    public String getName();
    public int getParameterCount();
    public Object execute(List<Object> parameters);
}
