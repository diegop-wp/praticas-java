package ManipulacaoDeArrays;

import java.util.Scanner;

public class SomaDeNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite 10 numeros: ");

        int soma = 0;
        int maior = 0;
        int menor = 0;


        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = teclado.nextInt();
            soma += numeros[i];

            if (i == 0) {
                maior = numeros[i];
                menor = numeros[i];
            } else {
                if (numeros[i] > maior) {
                    maior = numeros[i];

                }
                if (numeros[i] < menor) {
                    menor = numeros[i];
                }
            }

        }
        for (int numero : numeros){
            if ( numero% 3 ==0){
                System.out.println("numeros q sao dividos por 3: "+numero );
            }
        }
        System.out.println("soma dos numeros "+soma);
        System.out.println("menor numero " + menor);
        System.out.println("maior numero "+maior);

    }

}



