package at.balaz.lang.functions;

import at.balaz.lang.primitives.DataTypeInterface;

public interface ReversibleInterface<T extends DataTypeInterface> {
    T reverseData();
}
