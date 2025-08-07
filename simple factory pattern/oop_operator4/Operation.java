<<<<<<< HEAD
public class Operation {
    private double numberA = 0;
    private double numberB = 0;

    public Double getNumberA(){
        return numberA;
    }
    public void setNumberA(Double value){
        this.numberA = value;
    }

    public Double getNumberB(){
        return numberB;
    }
    public void setNumberB(Double value){
        this.numberB = value;
    }

    public double getResult(){
        double result = 0d;
        return  result;
    }
}

class OperationAdd extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = getNumberA() + getNumberB();
        return result;
    }
}

class OperationSub extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = getNumberA() - getNumberB();
        return result;
    }
}

class OperationMul extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = getNumberA() * getNumberB();
        return result;
    }
}

class OperationDiv extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        if (getNumberB() == 0)
            throw new ArithmeticException("Division by zero");
        result = getNumberA() / getNumberB();
        return result;
    }
}
=======
public class Operation {
    private double numberA = 0;
    private double numberB = 0;

    public Double getNumberA(){
        return numberA;
    }
    public void setNumberA(Double value){
        this.numberA = value;
    }

    public Double getNumberB(){
        return numberB;
    }
    public void setNumberB(Double value){
        this.numberB = value;
    }

    public double getResult(){
        double result = 0d;
        return  result;
    }
}

class OperationAdd extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = getNumberA() + getNumberB();
        return result;
    }
}

class OperationSub extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = getNumberA() - getNumberB();
        return result;
    }
}

class OperationMul extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = getNumberA() * getNumberB();
        return result;
    }
}

class OperationDiv extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        if (getNumberB() == 0)
            throw new ArithmeticException("Division by zero");
        result = getNumberA() / getNumberB();
        return result;
    }
}
>>>>>>> 25dc640967a1a54d1d2a8d51851f53e932f13f94
