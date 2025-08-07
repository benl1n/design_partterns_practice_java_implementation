package Implementary_Strategy;

// 正常收费子类
class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
