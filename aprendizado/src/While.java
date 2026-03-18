package aprendizado.src;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        // estrutura de repetição que executa um bloco de comandos
        // enquanto uma condição for verdadeira.

        // quando usar: quando não se sabe previamente a quantidade de
        // repetições que será realizada.

        // while(*condição verdadeira){
        // bloco repetido
        // }


        exercicio();
    }

    public static void exercicio() {
        // problema: Fazer um programa que lê números
        //inteiros até que um zero seja lido. Ao
        //final mostra a soma dos números lidos.

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número: ");

        int number = sc.nextInt();
        int sum = 0;

        while (number != 0) {
            sum += number;

            System.out.print("Informe um número: ");
            number = sc.nextInt();
        }

        System.out.println("soma " + sum);
    }
}