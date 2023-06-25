package exam06;

public class Ex02 {
    public static void main(String[] args) {
        C c = new C(); // C(); 생성자 함수

        // 다형성
        A a = c;
        B b = c;

        A aa = new C(); // C객체를 aa에 담는다
    }
}
