package primitives;

import java.util.List;

public class ListType implements DataTypeInterface<List>, ReversibleInterface {
    private final List<Object> data;

    public ListType(List<Object> data) {
        this.data = data;
    }

    @Override
    public DataTypeInterface<List> reverseData() {
        return null;
    }

    @Override
    public List getRawType() {
        return data;
    }
}
