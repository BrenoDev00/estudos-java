package exercicios;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOne, numberTwo, numberThree;

        System.out.print("informe o número: ");
        numberOne = sc.nextInt();

        System.out.print("informe o número: ");
        numberTwo = sc.nextInt();

        System.out.print("informe o número: ");
        numberThree = sc.nextInt();

        verifyTheHighestNumber(numberOne, numberTwo, numberThree);

        sc.close();
    }

    public static void verifyTheHighestNumber(int numberOne, int numberTwo, int numberThree) {
        if (numberOne > numberTwo && numberOne > numberThree) {
            System.out.println("O maior é o número 1: " + numberOne);
        } else if (numberTwo > numberThree) {
            System.out.println("O maior é o número 2: " + numberTwo);
        } else {
            System.out.println("O maior é o número 3: " + numberThree);
        }

    }
}
