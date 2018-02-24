package primitives;

import java.util.HashMap;
import java.util.Map;

public class DictionaryType implements DataTypeInterface<Map<StringType,DataTypeInterface<?>>> {

    private final Map<StringType,DataTypeInterface<?>> data;

    public DictionaryType(Map<StringType, DataTypeInterface<?>> data) {
        this.data = data;
    }

    @Override
    public Map<StringType,DataTypeInterface<?>> getRawType() {
        return data;
    }
}
