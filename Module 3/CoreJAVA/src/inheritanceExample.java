class Animal{
    void makeSound(){

    }
}
class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}
public class inheritanceExample {
    public static void main(String[] args) {
     Animal a = new Animal();
     Dog d = new Dog();
     a.makeSound();
     d.makeSound();
    }
}
