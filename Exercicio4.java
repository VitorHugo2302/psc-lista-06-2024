/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vitor Hugo
 */
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char[] caracteres = new char[10];
        int quantConsoantes = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o próximo caractere: ");
            caracteres[i] = entrada.next().charAt(0);
        }

        System.out.println("\nConsoantes: ");
        for (int i = 0; i < 10; i++) {
            
            char c = caracteres[i];
            
            if (!eVogal(c)) {
                quantConsoantes++;
                System.out.println(c);
            }
        }

        System.out.println("Total de consoantes lidas: " + quantConsoantes);

        entrada.close();
    }

    public static boolean eVogal(char c) {
        char[] vogais = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (char vogal : vogais) {
            if (c == vogal) {
                return true;
            }
        }
        return false;
    }
}
