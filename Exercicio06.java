// Nome: Tiago Falco França
// Matrícula: 1261942635

import java.util.Scanner;

public class Main {

    public static void exibirNotas(double[] notas) {

        System.out.println("\n--- Notas da Turma ---");

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + notas[i]);
        }
    }

     public static double calcularMedia(double[] notas) {

        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        return soma / notas.length;
    }

    public static double encontrarMaiorNota(double[] notas) {

        double maior = notas[0];

        for (int i = 1; i < notas.length; i++) {

            if (notas[i] > maior) {
                maior = notas[i];
            }
        }

        return maior;
    }

    public static int contarAprovados(double[] notas) {

        int contador = 0;

        for (int i = 0; i < notas.length; i++) {

            if (notas[i] >= 6.0) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[5];

        System.out.println("=== Sistema de Notas ===");

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        exibirNotas(notas);

        double media = calcularMedia(notas);
        double maiorNota = encontrarMaiorNota(notas);
        int aprovados = contarAprovados(notas);

        System.out.printf("\nMédia da turma: %.2f%n", media);
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Alunos aprovados: " + aprovados);

        scanner.close();
    }
}
