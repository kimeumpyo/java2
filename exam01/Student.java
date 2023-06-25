package exam01;

public class Student {
    int id; // 학번
    String name; // 이름
    String subject; // 전공과목
  
    public Student() {// 정의를 안해도 기본적으로 추가가 된다
        // 객체 생성 이후에 할 작업 ...
        // 주로 객체 생성이후 멤버 변수 초기화
        id = 1000; // 4byte
        name = "아이유"; // 4byte
        subject = "음악"; // 4byte
    }

    public Student(int _id, String _name, String _subject){
        // id 힙 , _id 스택
        id = _id;
        name = _name;
        subject = _subject;
    }
     

    void study() {
        System.out.println(name + "이 " + subject + "를 공부한다.");
    }

    void showInfo() {
        System.out.println("id=" + id + ", name=" + name + ", subject=" + subject);
    }
}
