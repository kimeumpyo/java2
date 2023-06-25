package exam03;

import exam02.A; // exam02패키지의 A클래스를 가져온다
import exam02.*; // exam02패키지의 모든걸 가져온다

public class Ex01 {
    public static void main(String[]args){
        A a  = new A();
        a.num1 = 10;

        // a.num2 = 20; // public이 없기때문에 사용할 수 없다
    }
}
