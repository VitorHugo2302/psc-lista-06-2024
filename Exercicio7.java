
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Vitor Hugo
 */
public class Exercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o próximo número inteiro: ");
            numeros[i] = entrada.nextInt();
        }

        System.out.print("Números digitados: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nSoma dos números: " + (numeros[0] + numeros[1] + numeros[2] + numeros[3] + numeros[4]));
        System.out.println("Multiplicaç?o dos números: " + (numeros[0] * numeros[1] * numeros[2] * numeros[3] * numeros[4]));

        entrada.close();
    }
}
