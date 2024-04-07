/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Vitor Hugo
 */
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {

            System.out.print("Digite o próximo número: ");
            numeros[i] = entrada.nextInt();

        }

        System.out.println("Números digitados: ");

        for (int i = 0; i < 5; i++) {

            System.out.println(numeros[i]);
        }

        entrada.close();
    }
}
