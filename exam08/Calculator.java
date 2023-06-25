package exam08;

// class앞에 abstract추가 
// 완전하지 않은 클래스기때문에 객체가 될수가 없다
// 구현체가 없다
public abstract class Calculator {
    public abstract int add(int num1, int num2); // 추상 메서드임을 알림 abstract

    public abstract int minus(int num1, int num2);
}
