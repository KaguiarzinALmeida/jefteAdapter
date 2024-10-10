package com.lanchenlayer;


public class CirculoAdapter {
    private Quadrado quadrado;

    public CirculoAdapter(Quadrado quadrado) {
        this.quadrado = quadrado;
    }

    public Quadrado getQuadrado() {
        return quadrado;
    }

    public void setQuadrado(Quadrado quadrado) {
        this.quadrado = quadrado;
    }

    public double calcularArea() {

        double raio = quadrado.getLado() / 2;
        return Math.PI * Math.pow(raio, 2);
    }
}