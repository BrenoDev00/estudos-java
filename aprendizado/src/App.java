package aprendizado.src;

import java.text.DecimalFormat;

import aprendizado.src.Calculator;
import aprendizado.src.Sobrecarga;

public class App {
    public static void main(String[] args) {
        // exercício de print
        System.out.println("Products:");

        String computer = "Computer";
        double computerPrice = 2100.0;

        DecimalFormat decimalPriceFormat = new DecimalFormat("0.00");
        System.out.println(computer + ", which price is $ " + decimalPriceFormat.format(computerPrice));

        String officeDesk = "Office desk";
        double officeDeskPrice = 650.50;

        System.out.println(officeDesk + ", wich price is $ " + decimalPriceFormat.format(officeDeskPrice) + "\n");

        int age = 30;
        int code = 5290;
        char gender = 'F';

        System.out.println("Record: " + age + " years old, " + "code " + code + " and gender: " + gender + "\n");

        double measure = 53.234567;
        DecimalFormat measueDecimalFormat = new DecimalFormat("0.00000000");

        System.out.println("Measue with eight decimal places: " + measueDecimalFormat.format(measure));

        DecimalFormat roudedDecimalFormat = new DecimalFormat("0.000");
        System.out.println("Rouded (three decimal places): " + roudedDecimalFormat.format(measure));

        double usFormat = 53.235;

        System.out.println("US decimal point: " + usFormat);

        System.out.println("PI value: " + Calculator.getPI());

        var exemploSobrecarga = new Sobrecarga("arroz", 2, 67.89);
        System.out.println("nome produto " + exemploSobrecarga.getName());
        System.out.println("preço produto " + exemploSobrecarga.getPrice());
        System.out.println("quantidade produto " + exemploSobrecarga.getQuantity());
    }
}