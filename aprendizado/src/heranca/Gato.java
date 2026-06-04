package aprendizado.src.heranca;

import aprendizado.src.heranca.Animal;
import aprendizado.src.heranca.AnimalGender;

public class Gato extends Animal {
    private String coatColor;

    public Gato(String name, AnimalGender gender, Integer age, String coatColor) {
        super(name, gender, age);
        this.coatColor = coatColor;
    }

    public void miar() {

        System.out.println("Miau");
    }

    @Override
    public void getAnimal() {
        super.getAnimal();
        System.out.println("Coat color: " + this.coatColor);
    }

}
