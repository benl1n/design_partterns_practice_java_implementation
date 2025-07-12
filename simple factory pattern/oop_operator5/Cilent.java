public class Cilent {
    public static void main(String[] args) {
        Operation oper = OperationFactory.createOperation("/");
        oper.setNumberA(5);
        oper.setNumberB(0);

        double result = oper.getResult();
        System.out.println(result);
    }
}
