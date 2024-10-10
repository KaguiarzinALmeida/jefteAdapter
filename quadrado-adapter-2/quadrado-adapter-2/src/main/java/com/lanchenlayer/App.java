package com.lanchenlayer;

public class App 
{
    public static void main( String[] args )
    {
        Quadrado quadrado = new Quadrado(5);
        CirculoAdapter adapter = new CirculoAdapter(quadrado);
        System.out.println("Área do quadrado: " + quadrado.calcularArea());
        System.out.println("Área adaptada para círculo: " + adapter.calcularArea());
    }
}
