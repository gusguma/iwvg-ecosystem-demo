package com.urneba.iwvg.ecosystem.practicas;

/**
 * Conceptos: Las fracciones propias son aquellas cuyo numerador es menor que el denominador
 * <p>
 * Las fracciones impropias son aquellas cuyo numerador es mayor que el denominador
 * <p>
 * Dos fracciones son equivalentes cuando el producto de extremos (numerador de la primera por denominador de la segunda) es igual al
 * producto de medios (denominador de la primera por el numerador de la segunda)
 * <p>
 * Las fracciones irreducibles son aquellas que no se pueden simplificar, esto sucede cuando el numerador y el denominador son primos entre
 * sí
 * <p>
 * Reducir varias fracciones a común denominador consiste en convertirlas en otras equivalentes que tengan el mismo denominador
 * <p>
 * Comparar fracciones
 * <p>
 * Suma fracciones: En primer lugar se reducen los denominadores a común denominador, y se suman o se restan los numeradores de las
 * fracciones equivalentes obtenidas
 * <p>
 * Multiplicación: La multiplicación de dos fracciones es otra fracción que tiene: Por numerador el producto de los numeradores. Por
 * denominador el producto de los denominadores.
 * <p>
 * La división de dos fracciones es otra fracción que tiene: Por numerador el producto de los extremos. Por denominador el producto de los
 * medios. Invertir fraccion
 *
 * @author jbernal
 */
public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public boolean isPropia() {
        return numerator < denominator;
    }

    public boolean isImpropia() {
        return !isPropia();
    }

    private int multiplyExtreme(Fraction fraction){
        return this.numerator * fraction.denominator;
    }

    private int multiplyMedium(Fraction fraction){
        return this.denominator * fraction.numerator;
    }

    public boolean isEquivalent(Fraction fraction) {
        return multiplyExtreme(fraction) == multiplyMedium(fraction);
    }

    public boolean isMajor(Fraction fraction) {
        return multiplyExtreme(fraction) > multiplyMedium(fraction);
    }

    public boolean isMinor(Fraction fraction) {
        return multiplyExtreme(fraction) < multiplyMedium(fraction);
    }

    public Fraction sum(Fraction fraction) {
        this.numerator = multiplyExtreme(fraction) + multiplyMedium(fraction);
        this.denominator = denominatorCommon(fraction);
        return this;
    }

    public Fraction sub(Fraction fraction) {
        this.numerator = multiplyExtreme(fraction) - multiplyMedium(fraction);
        this.denominator = denominatorCommon(fraction);
        return this;
    }

    public Fraction multiply(Fraction fraction) {
        this.numerator = this.numerator * fraction.numerator;
        this.denominator = this.denominator * fraction.denominator;
        return this;
    }

    public Fraction divide(Fraction fraction) {
        this.numerator = multiplyExtreme(fraction);
        this.denominator = multiplyMedium(fraction);
        return this;
    }

    public Fraction simplify(){
        int maximumCommonDivider = maximumCommonDivider();
        numerator = numerator / maximumCommonDivider;
        denominator = denominator / maximumCommonDivider;
        return this;
    }

    private int denominatorCommon(Fraction fraction){
        this.denominator = this.denominator * fraction.denominator;
        return this.denominator;
    }

    private int maximumCommonDivider(){
        Fraction fraction = new Fraction();
        int rest;
        fraction.numerator = Math.abs(numerator);
        fraction.denominator = Math.abs(denominator);
        while(fraction.denominator != 0){
           rest = fraction.numerator % fraction.denominator;
           fraction.numerator = fraction.denominator;
           fraction.denominator = rest;
        }
        return fraction.numerator;
    }


}
