<<<<<<< HEAD
package Only_Factory;

// 打折收费子类
class CashRebate extends CashSuper {
    private double moneyRebate = 1d;
    public CashRebate(String moneyRebate) {
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
=======
package Only_Factory;

// 打折收费子类
class CashRebate extends CashSuper {
    private double moneyRebate = 1d;
    public CashRebate(String moneyRebate) {
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
>>>>>>> 25dc640967a1a54d1d2a8d51851f53e932f13f94
