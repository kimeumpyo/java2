package exam06;

public class C extends B {
    int numC;

    public C() {
        super(); // 기본적으로 모은 생성자 1번째 줄에 생성 // B()호출
        System.out.println("C 생성자!");
    }
}
