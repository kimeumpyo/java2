package exam06;

public class Ex04 {
    public static void main(String[] args) {
        A ac = new C();

        System.out.println(ac instanceof A); // 본인 클래스
        System.out.println(ac instanceof B); // B로부터 유래된 객체인지?
        System.out.println(ac instanceof C); // C로부터 유래된 객체인지?

    }
}
