
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Vitor Hugo
 */
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        int nota1 = entrada.nextInt();

        System.out.print("Digite a segunda nota: ");
        int nota2 = entrada.nextInt();

        System.out.print("Digite a terceira nota: ");
        int nota3 = entrada.nextInt();

        System.out.print("Digite a quarta nota: ");
        int nota4 = entrada.nextInt();

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Nota 4: " + nota4);

        System.out.println("Média: " + ((nota1 + nota2 + nota3 + nota4) / 4));

        entrada.close();
    }
}
