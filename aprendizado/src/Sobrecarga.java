package aprendizado.src;

public class Sobrecarga {
    // exemplo de sobrecarga com 2 construtores
    private String name;
    private int quantity;
    private double price;

    public Sobrecarga(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.price = 25; // aqui já defino um valor inicial para price
    }

    public Sobrecarga(String name, int quantity, double price) {
        this.name = name;
        this.price = price;
        this.quantity = quantity; // aqui passo um valor recebido no parâmetro
    }

    public String getName() {
        return this.name;
    }

    public int getQuantity() {return this.quantity; }

    public double getPrice(){ return this.price; }

}
