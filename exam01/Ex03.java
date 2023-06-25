package exam01;

public class Ex03 {
    public static void main(String[] args) {
        int result = add(10, 20);
        System.out.println(result);
    }

    static int add(int num1, int num2) { // 호출이 되었을 때만 할당이 된다
        int result = num1 + num2;

        return result; // 30
    }
}
