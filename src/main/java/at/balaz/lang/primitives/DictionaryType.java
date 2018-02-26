package at.balaz.lang.primitives;

import at.balaz.lang.functions.GetInterface;

import java.util.Map;

public class DictionaryType implements DataTypeInterface<Map<StringType,DataTypeInterface<?>>>, GetInterface<StringType> {

    private final Map<StringType,DataTypeInterface<?>> data;

    public DictionaryType(Map<StringType, DataTypeInterface<?>> data) {

        this.data = data;
    }

    @Override
    public Map<StringType,DataTypeInterface<?>> getRawType() {
        return data;
    }

    @Override
    public DataTypeInterface<?> getData(StringType position) {
        return data.get(position);
    }
}
