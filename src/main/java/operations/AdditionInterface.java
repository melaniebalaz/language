package operations;

import primitives.DataTypeInterface;

public interface AdditionInterface<T extends DataTypeInterface> {

    public T add(T a);
}
