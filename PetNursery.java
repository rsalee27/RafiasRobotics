import java.util.ArrayList;
import java.util.List;

abstract class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void printInfo();
}

class Puppy extends Animal {
    String breed;

    Puppy(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    void printInfo() {
        System.out.println("Puppy Name: " + name + ", Age: " + age + ", Breed: " + breed);
    }
}

class Kitten extends Animal {
    String color;

    Kitten(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    void printInfo() {
        System.out.println("Kitten Name: " + name + ", Age: " + age + ", Color: " + color);
    }
}

class PetNursery {
    List<Animal> pets = new ArrayList<>();

    void addPet(Animal pet) {
        pets.add(pet);
    }

    void printAllPetsInfo() {
        for (Animal pet : pets) {
            pet.printInfo();
        }
    }



    public static void main(String[] args) {
        PetNursery nursery = new PetNursery();

        System.out.println("Puppies:");
        System.out.println("Max, Age: 1, Breed: Labrador");
        System.out.println("Milo, Age: 2, Breed: Boston Terrier");
        System.out.println("Lily, Age: 7, Breed: Siberian Husky");
        System.out.println("Carl, Age: 2, Breed: Beagle");
        System.out.println("Sprinkles, Age: 4, Breed: Poodle");
        System.out.println("Troy, Age: 5, Breed: Boston Terrier");
        System.out.println("Polly, Age: 6, Breed: Golden Retriever");
        System.out.println("Eric, Age: 3, Breed: Chihuahua");
        System.out.println("Teresa, Age: 8, Breed: Labrador");
        System.out.println("Will, Age: 2, Breed: Siberian Husky");
        System.out.println("Robert, Age: 6, Breed: Labradoodle");
        System.out.println(" ");

        System.out.println("Kittens:");
        System.out.println("Whiskers, Age:2, Color: Cream");
        System.out.println("Sky, Age:3, Color: Fawn");
        System.out.println("Alvin, Age:3, Color: Cinnamon");
        System.out.println("Willow, Age:4, Color: Cream");
        System.out.println("Bamboo, Age:5, Color: Chocolate");
        System.out.println("Flora, Age:4, Color: Lilac");
        System.out.println("Gemma, Age:1, Color: Albino");
        System.out.println("Rossa, Age:7, Color: Tabby");
        System.out.println("Caramel, Age:6, Color: Cinnamon");
        System.out.println("Margot, Age:7, Color: Smoke");
        System.out.println("Joy, Age:1, Color: Chinchilla");
        System.out.println("Tulip, Age:3, Color: Albino");
        System.out.println("Seaweed, Age:8, Color: Blue");
        System.out.println("Marshmallow, Age:6, Color: Smoke");
        
        new PetNursery();
        
        nursery.printAllPetsInfo();
    }
}
