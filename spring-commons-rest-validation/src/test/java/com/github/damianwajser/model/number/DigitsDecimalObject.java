package com.github.damianwajser.model.number;

import com.github.damianwajser.validator.annotation.number.Digits;

import java.math.BigDecimal;

public class DigitsDecimalObject {

    @Digits(integer = 3, fraction = 2, businessCode = "a-400")
    private BigDecimal value;

    public DigitsDecimalObject() {
    }

    public DigitsDecimalObject(BigDecimal value) {
        super();
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
