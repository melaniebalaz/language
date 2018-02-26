package at.balaz.lang.operations;

import at.balaz.lang.primitives.DataTypeInterface;

public interface AdditionInterface<T extends DataTypeInterface> {

    public T add(T a);
}
