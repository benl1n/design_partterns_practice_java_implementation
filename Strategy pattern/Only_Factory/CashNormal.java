package Only_Factory;

// 正常收费子类
class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
