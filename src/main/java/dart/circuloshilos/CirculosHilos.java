/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package dart.circuloshilos;

import javax.swing.JFrame;

/**
 *
 * @author Diego Ramos
 */
public class CirculosHilos {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de hilos usando circulos 2D");
        frame.add(new Circulos2D());
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
