import java.util.List;

public class ReverseFunction implements BuiltInFunction{

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
    public Object execute(List<Object> parameters) {
        if (parameters.size()>1){
            throw new RuntimeException("Incorrect number of parameters");
        }
        if (parameters.get(0) instanceof String) {
            return new StringBuffer(((String)parameters.get(0))).reverse().toString();
        }
        else return null;
    }
}
