package aprendizado.src.heranca;

import aprendizado.src.heranca.Gato;
import aprendizado.src.heranca.AnimalGender;

public class Main {
    public static void main(String[] args) {
        var gato1 = new Gato("Mat", AnimalGender.MALE, 2, "Marrom");
        gato1.miar();
        gato1.getAnimal();

        var cachorro = new Animal("Luck", AnimalGender.MALE, 12);
        cachorro.getAnimal();
    }
}
