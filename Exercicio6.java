/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vitor Hugo
 */
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numAlunos = 10;
        double[] medias = new double[numAlunos];
        int countAlunosAprovados = 0;

        for (int i = 0; i < numAlunos; i++) {
            System.out.println("Aluno " + (i + 1) + ":");
            double somaNotas = 0;
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite a " + (j + 1) + "° nota: ");
                double nota = entrada.nextDouble();
                somaNotas += nota;
            }
            medias[i] = somaNotas / 4;
        }

        for (int i = 0; i < numAlunos; i++) {
            if (medias[i] >= 7.0) {
                countAlunosAprovados++;
            }
        }

        System.out.println("\nNúmero de alunos com média maior ou igual a 7.0: " + countAlunosAprovados);

        entrada.close();
    }
}
