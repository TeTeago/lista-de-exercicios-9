// Nome: Tiago Falco França
// Matrícula: 1261942635

public class Main {

    public static int somarArray(int[] numeros) {
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        return soma;
    }

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        System.out.println("Soma: " + somarArray(array1));

        int[] array2 = {10, 20, 30};
        System.out.println("Soma: " + somarArray(array2));

    }

}