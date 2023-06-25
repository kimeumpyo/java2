package exam01;

public class Ex02 {
    public static void main(String[] args) {
        int result = func(3);
        System.out.println(result);
    }

    static int func(int x) { // x = 3
        int y = x * 2 + 1;

        return y; // 7
    }
}
