package exam04;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student(1000, "아이유1", "미술");
        Student s2 = new Student(1001, "아이유2", "음악");
        Student s3 = new Student(1005, "아이유3", "체육");

        // id 부분은 static 이 붙어있기 때문에
        s1.showInfo(); // id=1005, name=아이유1, subject=미술
        s2.showInfo(); // id=1005, name=아이유2, subject=음악
        s3.showInfo(); // id=1005, name=아이유3, subject=체육

        s1.id = 1000;
        s2.id = 1001;
    }
}
