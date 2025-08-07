<<<<<<< HEAD
import java.util.ArrayList;

public class Cilent {
    public static void main(String[] args) {
        Operation oper = OperationFactory.createOperation("/");
        oper.setNumberA(5);
        oper.setNumberB(0);

        double result = oper.getResult();
        System.out.println(result);


    }
}
=======
public class Cilent {
    public static void main(String[] args) {
        Operation oper = OperationFactory.createOperation("/");
        oper.setNumberA(5);
        oper.setNumberB(0);

        double result = oper.getResult();
        System.out.println(result);
    }
}
>>>>>>> 25dc640967a1a54d1d2a8d51851f53e932f13f94
