// Nome: Tiago Falco França
// Matrícula: 1261942635

public class Main {

    public static int encontrarMaior(int[] numeros) {

        int maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {

            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        return maior;
    }

    public static void main(String[] args) {

        int[] array1 = {4, 7, 2, 9, 1};
        System.out.println("Maior valor: " + encontrarMaior(array1));

        int[] array2 = {100, 50, 75};
        System.out.println("Maior valor: " + encontrarMaior(array2));
    }
}