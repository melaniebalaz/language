package primitives;

import operations.AdditionInterface;
import operations.MultiplicationInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListType implements DataTypeInterface<List<DataTypeInterface<?>>>,
        ReversibleInterface, AdditionInterface {
    private final List<DataTypeInterface<?>> data;

    public ListType(List<DataTypeInterface<?>> data) {
        this.data = data;
    }

    @Override
    public DataTypeInterface<List<DataTypeInterface<?>>> reverseData() {
        List<DataTypeInterface<?>> list = new ArrayList<>(data);
        Collections.reverse(list);
        return new ListType(list);
    }

    @Override
    public List<DataTypeInterface<?>> getRawType() {
        return data;
    }

    @Override
    public ListType add(DataTypeInterface a) {
        return null;
    }
}
