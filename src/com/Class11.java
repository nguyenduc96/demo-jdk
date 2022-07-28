package com;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonTypeName;

public class Class11 {
    @JsonFormat(shape = JsonFormat.Shape.NUMBER_FLOAT, pattern = "%.2f")
    private Double a;

    public Class11(Double a) {
        this.a = a;
    }

    public Class11() {
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }
}
