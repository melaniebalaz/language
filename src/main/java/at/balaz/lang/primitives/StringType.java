package at.balaz.lang.primitives;

import at.balaz.lang.functions.ReversibleInterface;
import at.balaz.lang.operations.AdditionInterface;

public class StringType implements DataTypeInterface<String>, ReversibleInterface<StringType>,
        AdditionInterface<StringType> {

    private final String data;

    public StringType(String data) {
        this.data = data;
    }

    @Override
    public StringType reverseData() {
        return new StringType(
                new StringBuffer(data)
                        .reverse()
                        .toString()
        );
    }

    @Override
    public String getRawType() {
        return data;
    }

    @Override
    public StringType add(StringType a) {
        return new StringType( data + a.getRawType());
    }
}

