package org.uniquindio.edu.co.poo.app;

import org.uniquindio.edu.co.poo.model.Circulo;
import org.uniquindio.edu.co.poo.model.Cuadrado;
import org.uniquindio.edu.co.poo.model.Figura;
import org.uniquindio.edu.co.poo.model.TrianguloEquilatero;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();

        figuras.add(new Circulo(5));
        figuras.add(new Cuadrado(4));
        figuras.add(new TrianguloEquilatero(6));

        for (Figura figura : figuras) {
            System.out.println(figura);
            System.out.println("Área:" + figura.calcularArea());
            System.out.println("Perímetro:" + figura.calcularPerimetro());
        }
    }
}

