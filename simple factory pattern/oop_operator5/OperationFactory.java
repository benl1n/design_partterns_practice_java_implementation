<<<<<<< HEAD

public class OperationFactory {
    public  static  Operation createOperation(String operation){
        Operation oper = null;
        switch (operation){
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
        }
        return oper;
    }
}
=======

public class OperationFactory {
    public  static  Operation createOperation(String operation){
        Operation oper = null;
        switch (operation){
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
        }
        return oper;
    }
}
>>>>>>> 25dc640967a1a54d1d2a8d51851f53e932f13f94
