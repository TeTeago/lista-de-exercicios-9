// Nome: Tiago Falco França
// Matrícula: 1261942635

public class Main {

    public static double calcularMedia(int[] numeros) {

        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        return (double) soma / numeros.length;
    }

    public static void main(String[] args) {

        int[] array1 = {5, 10, 15, 20};
        System.out.printf("Média: %.2f%n", calcularMedia(array1));

        int[] array2 = {1, 2, 3};
        System.out.printf("Média: %.2f%n", calcularMedia(array2));

        int[] array3 = {10, 7, 3};
        System.out.printf("Média: %.2f%n", calcularMedia(array3));
    }
}