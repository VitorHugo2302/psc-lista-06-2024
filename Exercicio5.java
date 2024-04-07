/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vitor Hugo
 */
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];
        int countPares = 0;
        int countImpares = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o próximo número inteiro: ");
            numeros[i] = entrada.nextInt();

            if (numeros[i] % 2 == 0) {
                pares[countPares] = numeros[i];
                countPares++;
            } else {
                impares[countImpares] = numeros[i];
                countImpares++;
            }
        }

        System.out.println("\nNúmeros lidos:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("Números pares:");
        for (int i = 0; i < countPares; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.println("\nNúmeros ímpares:");
        for (int i = 0; i < countImpares; i++) {
            System.out.print(impares[i] + " ");
        }

        entrada.close();
    }

}
