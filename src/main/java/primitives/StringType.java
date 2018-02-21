package primitives;

public class StringType implements DataTypeInterface<String>, ReversibleInterface {

    private final String data;

    public StringType(String data) {
        this.data = data;
    }

    @Override
    public DataTypeInterface<String> reverseData() {
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
}

