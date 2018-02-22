package primitives;

import operations.AdditionInterface;
import operations.MultiplicationInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListType implements DataTypeInterface<List>, ReversibleInterface, AdditionInterface {
    private final List<Object> data;

    public ListType(List<Object> data) {
        this.data = data;
    }

    @Override
    public DataTypeInterface<List> reverseData() {
        List list = new ArrayList(data);
        Collections.reverse(list);
        return new ListType(list);
    }

    @Override
    public List getRawType() {
        return data;
    }

    @Override
    public DataTypeInterface add(DataTypeInterface a, DataTypeInterface b) {
        return null;
    }
}
