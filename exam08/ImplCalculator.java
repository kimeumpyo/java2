package exam08;

public class ImplCalculator extends Calculator {

    // 구현체를 만들어서 사용 (객체)
    public int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    @Override
    public int minus(int num1, int num2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'minus'");
    }
}
