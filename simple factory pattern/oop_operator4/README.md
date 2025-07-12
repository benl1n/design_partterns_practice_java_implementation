# 一些小知识
## getNumberA 和 setNumberA
```
public class Operation {
    private double numberA = 0;

    public Double getNumberA(){
        return numberA;
    }
    public void setNumberA(Double value){
        this.numberA = value;
    }
}
```
## class OperationAdd extends Operation重写类方法
@override