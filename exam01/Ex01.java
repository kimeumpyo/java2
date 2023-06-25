package exam01;

public class Ex01 {
    public static void main(String[] args) {
        // Student s1 스택 영역 메모리
        // new Student(); 힙 영역 메모리 int id(4), String name(4), String subject(4)
        Student s1 = new Student();
        // 참조형태의 지역변수 s1
        s1.id = 1000;
        s1.name = "학생1";
        s1.subject = "과목1";

        s1.study(); // 학생1이 과목1를 공부한다.

        System.out.println(s1); // exam01.Student@5f2050f6
        System.out.println(System.identityHashCode(s1)); // 객체에 접근할 수 있는 10진수 메모리 주소 1595953398
    }
}
