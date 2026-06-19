package aprendizado.src.programacaoFuncional;
import java.util.ArrayList;
import java.util.List;

class Product{
    private String name;
    private Double price;

    Product(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public Double getPrice(){
        return this.price;
    }
}

// lambdas são funções anônimas
public class Lambdas {
    public static void main(String[] args){

        List<Product> products = new ArrayList<>();

        products.add(new Product("Arroz", 34.90));
        products.add(new Product("Verduras", 78.90));
        products.add(new Product("Carne", 23.67));

        // ordenando produtos pelo nome com lambda
        products.sort((productOne, productTwo) -> productOne.getName().compareTo(productTwo.getName()));

        // listando produtos com lambda
        products.forEach((product) -> System.out.println("- Name: " + product.getName() + " - Price: " + product.getPrice()));
    }
}
