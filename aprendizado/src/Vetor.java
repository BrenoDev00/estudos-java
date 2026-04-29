package aprendizado.src;

import java.util.Scanner;

public class Vetor {
    // vetor é uma estrutura que pode conter vários dados e também ser percorrida
    // vantagem: acesso imediato aos elementos pela sua posição
    // desvantagem: tamanho fixo; dificuldade para se realizar inserções e deleções

    //    Fazer um programa para ler um número inteiro N e a altura de N
    //    pessoas. Armazene as alturas em um vetor. Em seguida, mostrar a
    //    altura média dessas pessoas.

    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Número: ");
        int number = sc.nextInt();

        double[] vector = new double[number]; // estou criando um vetor com tamanho definido pela variável number.

        for (int i = 0; i < number; i++) {
            System.out.print("Altura " + i + ": ");
            vector[i] = sc.nextDouble();
        }

        double vectorSum = 0;

        for (int i = 0; i < vector.length; i++) {
            vectorSum += vector[i];
        }

        double average = vectorSum / number;
        System.out.println("Média: " + average);

        sc.close();
    }
}
