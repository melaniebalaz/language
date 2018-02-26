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

    @Override
    public boolean equals(Object a){
        if (a instanceof StringType){
            StringType str = (StringType)a;
            return (data.equals(str.getRawType()));
        }
        else {
            return false;
        }

    }

    @Override
    public int hashCode() {
        return data.hashCode();
    }
}

