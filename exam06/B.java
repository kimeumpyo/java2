package exam06;

public class B extends A {
    int numB;

    public B() {
        super(); // 기본적으로 모은 생성자 1번째 줄에 생성 // A()호출
        System.out.println("B 생성자!");
    }
}
