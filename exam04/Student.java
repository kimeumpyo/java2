package exam04;

public class Student {

    static int id; // 학번 -> 데이터 영역 메모리

    String name; // 이름 -> 힙 영역 메모리
    String subject; // 전공과목 -> 힙 영역 메모리

    public Student(int id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    void study() {
        System.out.println(name + "이 " + subject + "를 공부한다.");
    }

    void showInfo() {
        // this.study();
        System.out.println("id=" + id + ", name=" + name + ", subject=" + subject);
        // staticMethod(); // 가능
        // id = 1000; // 가능
    }

    static void staticMethod() {
        System.out.println("정적 메서드!");
        // this.showInfo(); // 사용불가
        // this.name = 10; // 사용불가
        id = 1000; // 같은 정적자원이라 가능하다
    }
}
