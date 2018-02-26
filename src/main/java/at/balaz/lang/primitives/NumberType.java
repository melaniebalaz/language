package at.balaz.lang.primitives;

import at.balaz.lang.operations.AdditionInterface;
import at.balaz.lang.operations.DivisionInterface;
import at.balaz.lang.operations.MultiplicationInterface;
import at.balaz.lang.operations.SubtractionInterface;

import java.math.BigDecimal;

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
