import java.util.Scanner;

public class CalculadoraDeMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int qtdAluno = teclado.nextInt();

        double[][] nota = new double[qtdAluno][3]; // Array bidimensional
        double maior = 0;
        double menor = 0;


        // Captura das notas
        for (int i = 0; i < qtdAluno; i++) { // Percorrendo os alunos
            System.out.println("Digite as 3 notas do aluno " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) { // Percorrendo as notas
                nota[i][j] = teclado.nextDouble(); // Lendo a nota como double
            }
        }

        // Cálculo e exibição da média
        for (int i = 0; i < qtdAluno; i++) {
            double soma = 0; // Variável para armazenar a soma das notas do aluno
            for (int j = 0; j < 3; j++) {
                soma += nota[i][j]; // Somando as notas do aluno
            }
            double media = soma / 3; // Calculando a média

            // inicializando maior e menor
            if (i == 0) {
                maior = media;
                menor = media;
            } else {
                // Atualizando maior
                if (media > maior) {
                    maior = media;
                }
                // atualizando menor
                if (media < menor) {
                    menor = media;
                }

            }
            System.out.println("media do aluno " + (i + 1) + ": " + media);
        }
        System.out.println("-------------");
        System.out.println("maior media : " + maior);
        System.out.println("menor media : " + menor);
        teclado.close();
    }
}

