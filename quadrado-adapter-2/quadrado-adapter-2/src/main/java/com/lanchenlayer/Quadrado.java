package com.lanchenlayer;

public class Quadrado {
    private double lado;


    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Quadrado(double lado) {

        this.lado = lado;
    }

    public double calcularArea() {

        return lado * lado;
    }
}
