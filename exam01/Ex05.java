package exam01; // 패키지명

public class Ex05 { // 클래스명
    public static void main(String[] args) {
        int result = add(10, 20); // 첫번째 add호출
        System.out.println(result); // 30

        int result2 = add(10, 20, 30); // 두번째 add호출
        System.out.println(result2); // 60
    }

    // 메서드 오버로드
    // int add 메서드 함수
    // int num1, int num2 매개변수
    static int add(int num1, int num2) {
        int result = num1 + num2;
        return result; // 반환값
    }

    static int add(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;
        return result;
    }
}
