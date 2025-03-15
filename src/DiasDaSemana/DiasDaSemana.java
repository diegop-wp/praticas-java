package DiasDaSemana;

import java.util.Scanner;



public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual é o dia da semana? (Digite um número de 1 a 7)");
        int dia = teclado.nextInt();

        String[] diaDaSemana = new String[7];

        diaDaSemana[0] = "Domingo";
        diaDaSemana[1] = "Segunda";
        diaDaSemana[2] = "Terça";
        diaDaSemana[3] = "Quarta";
        diaDaSemana[4] = "Quinta";
        diaDaSemana[5] = "Sexta";
        diaDaSemana[6] = "Sábado";
            int num = dia - 1; // Ajustando o número para o índice correto do array

        if (dia >= 1 && dia <= 7) {
            if (num == 0) {
                System.out.println("Hoje é um ótimo dia para começar a semana! (Domingo)");
            } else if (num == 6) {
                System.out.println("O final de semana chegou, aproveite! (Sábado)");
            } else {
                System.out.println("Dia produtivo! (" + diaDaSemana[num] + ")");
            }
        } else {
            System.out.println("Digite um número válido entre 1 e 7.");
        }
        teclado.close();
    }
}
