// Nome: Tiago Falco França
// Matrícula: 1261942635

public class Main {

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
       
        int[] numeros = {10, 20, 30, 40, 50};

        imprimirArray(numeros);
    }

}