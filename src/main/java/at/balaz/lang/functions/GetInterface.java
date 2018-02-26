package at.balaz.lang.functions;

import at.balaz.lang.primitives.DataTypeInterface;

public interface GetInterface<T extends DataTypeInterface> {

    DataTypeInterface getData(T position);
}
