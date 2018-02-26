package at.balaz.lang.primitives;

import at.balaz.lang.functions.GetInterface;
import at.balaz.lang.functions.ReversibleInterface;
import at.balaz.lang.operations.AdditionInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListType implements DataTypeInterface<List<DataTypeInterface<?>>>,
        ReversibleInterface, AdditionInterface, GetInterface {
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
        List<DataTypeInterface<?>> newList = new ArrayList(data);
        if (a instanceof ListType ){
            newList.addAll((Collection<? extends DataTypeInterface<?>>) a.getRawType());
        }
        else {
            newList.add(a);
        }
        return new ListType(newList);
    }
}
