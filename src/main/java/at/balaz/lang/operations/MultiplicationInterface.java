package at.balaz.lang.operations;

import at.balaz.lang.primitives.DataTypeInterface;

public interface MultiplicationInterface<T extends DataTypeInterface>  {
    public T multiply(T multiplier);
}
