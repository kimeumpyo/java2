package exam07;

public class Ex02 {
    public static void main(String[] args) {
        // Human[] animals = new Human[3];

        Animal[] animals = new Animal[3];

        animals[0] = new Human(); // Animal animals[0] = new Human();
        animals[1] = new Dog(); // Animal animals[1] = new Dog();
        animals[2] = new Bird(); // Animal animals[2] = new Bird();

        for (Animal animal : animals) {
            animal.move();

            if (animal instanceof Human) {
                Human human = (Human) animal;
                human.readBook();
            } else if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                dog.bark();
            }
        }
    }
}
