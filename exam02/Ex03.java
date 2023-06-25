package exam02;

public class Ex03 {
    public static void main(String[] args){
        Schedule2 s1 = new Schedule2(2023,7,25);

        // s1.setYear(2023);
        // s1.setMonth(6);
        // s1.setDay(25);

        System.out.println(s1); // s1.toString();

        s1.printThis();

        // s1과 this는 같은 값을 가지고 있다. - 생성되어 있는 객체의 주소값

        Schedule2 s2 = new Schedule2();
        System.out.println(s2);
    }
}
