package exam07;

public class Ex01 {
    public static void main(String[] args) {
        // Animal 이라는 공통점이 있다!

        Human human = new Human(); // Human, Animal
        human.move();

        Dog dog = new Dog(); // Dog, Animal
        dog.move();

        Bird bird = new Bird(); // Bird, Animal
        bird.move();

        // test
        // Animal ss = new Human();
        // ss.move();
    }
}
