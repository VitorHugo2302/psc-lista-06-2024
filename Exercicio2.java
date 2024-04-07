/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vitor Hugo
 */
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] numeros = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o próximo número: ");
            numeros[i] = entrada.nextDouble();
        }

        System.out.println("\nNúmeros na ordem inversa:");
        for (int i = 10 - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        entrada.close();
    }
}
