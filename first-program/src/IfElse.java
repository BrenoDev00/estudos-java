import java.util.Scanner;

public class IfElse{
    public static void main(String[] args){
        // condicional if else
        // estrutura:

        int number = 3;

        if(number > 10){
            System.out.println("número é maior que 10");
        }else {
            System.out.println("número é menor que 10");
        }
        example();
        
    }

    public static void example(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe a hora: ");
        double time = sc.nextDouble();

        if(time < 13){
            System.out.println("Agora é dia");
        }else if(time < 19){
                System.out.println("Agora é tarde");
        }else {
                System.out.println("Agora é noite");
            }
        

        sc.close();
    }
}

