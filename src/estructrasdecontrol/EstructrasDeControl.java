/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructrasdecontrol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Yael Alejandro Núñez de los Santos
 */
public class EstructrasDeControl {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        System.out.println("Hola Mundo");
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingresar la cantidad de su salario");
        double salario = Double.parseDouble(leer.readLine());
    }
    
}
