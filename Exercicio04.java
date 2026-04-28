// Nome: Tiago Falco França
// Matrícula: 1261942635

public class Main {

    public static int contarPares(int[] numeros) {

        int contador = 0;

       
        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 == 0) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6};
        System.out.println("Quantidade de pares: " + contarPares(array1));

        int[] array2 = {10, 20, 30};
        System.out.println("Quantidade de pares: " + contarPares(array2));

        int[] array3 = {1, 3, 5, 7};
        System.out.println("Quantidade de pares: " + contarPares(array3));
    }
}
