import java.util.Scanner;

public class App{
    public static double calculateTotal(int minutesUsed){
        double defaultPrice = 50.00;
        double rateValue = 2.00;
        double totalToPay;

        if(minutesUsed > 100){
            totalToPay = defaultPrice + ((minutesUsed - 100) * rateValue);
        } else {
            totalToPay = defaultPrice;
        }

        return totalToPay;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a quantidade de minutos consumidos: ");
        int minutesUsed = sc.nextInt();

        double totalToPay = calculateTotal(minutesUsed);

        System.out.printf("Valor a pagar: R$ %.2f%n", totalToPay);

        sc.close();
    }
}
