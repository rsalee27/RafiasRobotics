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

        // Add puppies
        nursery.addPet(new Puppy("Max", 1, "Labrador"));
        nursery.addPet(new Puppy("Milo", 2, "Boston Terrier"));
        nursery.addPet(new Puppy("Lily", 7, "Siberian Husky"));
        nursery.addPet(new Puppy("Carl", 2, "Beagle"));
        nursery.addPet(new Puppy("Sprinkles", 4, "Poodle"));
        nursery.addPet(new Puppy("Jessica", 3, "Golden Retriever"));
        nursery.addPet(new Puppy("Marc", 1, "Siberian Husky"));
        nursery.addPet(new Puppy("Marshmallow", 4, "Poodle"));
        nursery.addPet(new Puppy("Tulip", 5, "German Sheperd"));
        nursery.addPet(new Puppy("Yori", 2, "Beagle"));
        nursery.addPet(new Puppy("Phoebe", 6, "Yorkshire Terrier"));
        nursery.addPet(new Puppy("Terri", 1, "Labrador"));

        // Add kittens
        nursery.addPet(new Kitten("Whiskers", 2, "Cream"));
        nursery.addPet(new Kitten("Sky", 3, "Fawn"));
        nursery.addPet(new Kitten("Alvin", 3, "Cinnamon"));
        nursery.addPet(new Kitten("Willow", 4, "Cream"));
        nursery.addPet(new Kitten("Bamboo", 5, "Chocolate"));
        nursery.addPet(new Kitten("Twinkles", 2, "Cream"));
        nursery.addPet(new Kitten("Luna", 4, "Calico"));
        nursery.addPet(new Kitten("Gemma", 1, "Tabby"));
        nursery.addPet(new Kitten("Dandelion", 6, "Fawn"));
        nursery.addPet(new Kitten("Iris", 4, "Albino"));
        nursery.addPet(new Kitten("Saturn", 7, "Blue"));
        nursery.addPet(new Kitten("Venus", 3, "Lilac"));
        nursery.addPet(new Kitten("Sydney", 7, "Cream"));

        nursery.printAllPetsInfo();
    }
}
