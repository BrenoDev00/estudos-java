import java.util.Scanner;

public class SwitchCase{
    public static void main(String[] args){
        // estrutura condicional Switch Case:

        // switch (expressão){
        // case valor1:
        //         comando1
        //         comando2
        //         break;
        // case valor2:
        //         comando3
        //         comando4
        //         break;
        // default:
        //         comando5
        //         comando6
        //         break;
        // }   
        example();     
    }

    public static void example(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Escolha um número de 1 a 3: ");
        int number = sc.nextInt();

        switch(number){
            case 1:
                System.out.println("você escolheu 1");
                break;
            case 2:
                System.out.println("você escolheu 2");
                break;
            case 3:
                System.out.println("você escolheu 3");
                break;
            default:
                System.out.println("informe um valor válido");
                break;
        }

        sc.close();
    }
}