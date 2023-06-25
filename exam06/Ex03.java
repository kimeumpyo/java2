package exam06;

public class Ex03 {
    public static void main(String[] args) {
        A a = new C(); // C, B, A

        A ad = new D(); // D, A

        // instanceof 내용물을 확인!
        if (ad instanceof C) {
            C c1 = (C) ad; // 오류발생false
        }

    }
}
