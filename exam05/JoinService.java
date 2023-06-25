package exam05;

public class JoinService {
    // 외부에서 사용 가능하게!
    // private static JoinService instance = new JoinService();
    private static JoinService instance;

    private JoinService() {
    }

    public static JoinService getInstance() {

        if(instance == null){
            instance = new JoinService();
        }

        return instance;
    }
}
