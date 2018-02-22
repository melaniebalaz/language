package operations;

import primitives.DataTypeInterface;

public interface MultiplicationInterface<T extends DataTypeInterface>  {
    public T multiply(T multiplier);
}
