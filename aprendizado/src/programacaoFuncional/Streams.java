package aprendizado.src.programacaoFuncional;

import java.util.ArrayList;
import java.util.List;

class ProductStream{
    private String name;
    private Double price;

    ProductStream(String name, Double price){
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

// stream é uma sequência de elementos de dados que oferece suporte a operações agregadas (map, filter, reduce...)
public class Streams {
    public static void main(String[] args){
        List<ProductStream> products = new ArrayList<>();

        products.add(new ProductStream("Arroz", 32.67));
        products.add(new ProductStream("Carne", 72.99));
        products.add(new ProductStream("Verduras", 90.00));

        // filter: filtra elementos com base em uma condição
        System.out.println("Filter: " + products.stream().filter(product -> product.getPrice() > 80).map(product -> product.getName()).toList());

        // map: transforma um objeto em outro
        System.out.println("Map: " + products.stream().map(product -> product.getName()).toList());

        // reduce: acumula valores
        System.out.println("Reduce: " + products.stream().map(product -> product.getPrice()).reduce(0.0, (sum, price) -> sum + price));

        // findFirst: retorna o primeiro elemento encontrado
        System.out.println("findFirst: " + products.stream().filter(product -> product.getName().charAt(0) == 'A').map(product -> product.getName()).findFirst().orElse("Product not found"));
    }
}
