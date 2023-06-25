package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Schedule s1 = new Schedule();
        /* private 
        s1.year = 2023; 
        s1.month = 2;
        s1.day = 31;
        */
        
        s1.setYear(2023);
        s1.setMonth(2);
        // 2월은 31일이 없기 때문에 통제해준다
        s1.setDay(31);

        // 값을 가져오기 위해서 메서드 부분 정의
        
        s1.getYear();
        s1.getMonth();
        s1.getDay();


        s1.showInfo();


    }
}
