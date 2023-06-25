package exam07;

public class Human extends Animal {

    @Override // 형식을 체크해본다
    public void move() {
        System.out.println("두발로 직립보행!");
    }

    public void readBook() {
        System.out.println("독서를 한다!");
    }

}
