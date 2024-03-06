package org.example;

import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //ConexionMongo conexion = new ConexionMongo("esfot", "esfot2024", "mongodb+srv", "cluster0.xzffuex.mongodb.net");
        JFrame Ventana1 = new JFrame();
        Ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ventana1.setSize(300, 300);
        Ventana1.setContentPane(new ConeccionMBD().VentanaPrincipal);
        Ventana1.pack();
        Ventana1.setLocationRelativeTo(null); // Centra la ventana en la pantalla
        Ventana1.setVisible(true);

    }
}