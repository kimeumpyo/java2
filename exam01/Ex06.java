package exam01;

public class Ex06 {
    public static void main(String[] args) {
        Student s1 = new Student(1000, "아이유1", "과목1");
        Student s2 = new Student(1001, "아이유2", "과목2");

        s1.showInfo(); // id=1000, name=아이유1, subject=과목1
        s2.showInfo(); // id=1001, name=아이유2, subject=과목2

        System.out.println("s1 : " + System.identityHashCode(s1)); // s1 : 1521118594 -> 주소값
        System.out.println("s2 : " + System.identityHashCode(s2)); // s2 : 1940030785 -> 주소값

        System.out.println(s1 == s2); // false

        Student s3 = s2; // s3은 s2의 주소값을 복사

        s3.name = "아이유3";
        s3.id = 1002;

        System.out.println("s3 : " + System.identityHashCode(s3)); // s2 : 1940030785 -> 주소값
        System.out.println(s2 == s3); // true

        // 주소값이 동일하기 때문에 같은 값이 나온다
        System.out.println("------s3------");
        s3.showInfo(); // id=1002, name=아이유3, subject=과목2

        System.out.println("------s2------");
        s2.showInfo(); // id=1002, name=아이유3, subject=과목2

        s1 = null; // null - 값이 없음 참조가 끊어지면 GC(Garbage Collection)-> 불필요한 메모리를 알아서 정리
    }
}
