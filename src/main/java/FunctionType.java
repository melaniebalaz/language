import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class FunctionType implements primitives.DataTypeInterface {

    private List<TerminalNode> parameters;
    private List<AdvancedCalculatorParser.StatementContext> statements;

    public FunctionType(List<TerminalNode> parameters, List<AdvancedCalculatorParser.StatementContext> statements) {
        this.parameters = parameters;
        this.statements = statements;
    }

    @Override
    public Object getRawType() {
        throw new RuntimeException("getRawType for functions is not supported");
    }

    public List<TerminalNode> getParameters() {
        return parameters;
    }

    public void setParameters(List<TerminalNode> parameters) {
        this.parameters = parameters;
    }

    public List<AdvancedCalculatorParser.StatementContext> getStatements() {
        return statements;
    }

    public void setStatements(List<AdvancedCalculatorParser.StatementContext> statements) {
        this.statements = statements;
    }
}
