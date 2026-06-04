package aprendizado.src.heranca;

import aprendizado.src.heranca.AnimalGender;


public class Animal {
    private String name;
    private AnimalGender gender;
    private Integer age;

    public Animal(String name, AnimalGender gender, Integer age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void getAnimal() {
        System.out.println("Name: " + this.name);
        System.out.println("Gender: " + this.gender);
        System.out.println("age: " + this.age);
    }

}
