package primitives;

import java.math.BigDecimal;
import java.util.List;

public class NumberType implements DataTypeInterface<BigDecimal>, ReversibleInterface {
    private final BigDecimal data;

    public NumberType(BigDecimal data) {
        this.data = data;
    }

    @Override
    public DataTypeInterface<BigDecimal> reverseData() {
        return null;
    }

    @Override
    public BigDecimal getRawType() {
        return data;
    }
}
