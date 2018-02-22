package primitives;

import operations.AdditionInterface;
import operations.DivisionInterface;
import operations.MultiplicationInterface;
import operations.SubtractionInterface;

import java.math.BigDecimal;
import java.util.List;

public class NumberType implements DataTypeInterface<BigDecimal>, AdditionInterface<NumberType>, DivisionInterface<NumberType>, MultiplicationInterface<NumberType>, SubtractionInterface<NumberType> {
    private final BigDecimal data;

    public NumberType(BigDecimal data) {
        this.data = data;
    }

    @Override
    public BigDecimal getRawType() {
        return data;
    }

    @Override
    public NumberType add(NumberType a) {
        return new NumberType(data.add(a.getRawType()));
    }

    @Override
    public NumberType divide(NumberType a) {
        return new NumberType(data.divide(a.getRawType()));
    }

    @Override
    public NumberType multiply(NumberType a) {
        return new NumberType(data.multiply(a.getRawType()));
    }

    @Override
    public NumberType subtract(NumberType a) {
        return new NumberType(data.subtract(a.getRawType()));
    }
}
