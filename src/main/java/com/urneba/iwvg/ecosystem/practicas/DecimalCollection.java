package com.urneba.iwvg.ecosystem.practicas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DecimalCollection {

    private List<Double> collection;

    public DecimalCollection() {
        this.collection = new ArrayList<>();
    }

    public void add(double value) {
        this.collection.add(value);
    }

    public int size() {
        return this.collection.size();
    }

    public double sum() {
        this.validateIsNullOrEmpty();
        return this.collection.stream().mapToDouble(Double::doubleValue).sum();
    }

    private void validateIsNullOrEmpty() {
        if ((this.collection == null) || this.collection.isEmpty()) {
            throw new ArithmeticException("Null or Empty collection");
        }
    }

    public double higher() {
        this.validateIsNullOrEmpty();
        return Collections.max(this.collection);
    }

    public double lower() {
        this.validateIsNullOrEmpty();
        return Collections.min(this.collection);
    }

    public double average() {
        this.validateIsNullOrEmpty();
        return this.collection.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
    }

    public double multiply() {
        this.validateIsNullOrEmpty();
        return this.collection.stream().reduce(1.0, (accumulator, value) -> (accumulator * value));
    }
}
