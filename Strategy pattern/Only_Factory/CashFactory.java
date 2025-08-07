<<<<<<< HEAD
package Only_Factory;

public class CashFactory {
    public static CashSuper createCashSuper(String type){
        CashSuper cs = null;
        switch (type){
            case "正常收费":
                cs = new CashNormal();
                break;
            case "满 300 返 100":
                CashReturn cr1 = new CashReturn("300", "100");
                cs = cr1;
                break;
            case "打8折":
                CashRebate cr2 = new CashRebate("0.8");
                cs = cr2;
                break;
        }
        return cs;
    }
}
=======
package Only_Factory;

public class CashFactory {
    public static CashSuper createCashSuper(String type){
        CashSuper cs = null;
        switch (type){
            case "正常收费":
                cs = new CashNormal();
                break;
            case "满 300 返 100":
                CashReturn cr1 = new CashReturn("300", "100");
                cs = cr1;
                break;
            case "打8折":
                CashRebate cr2 = new CashRebate("0.8");
                cs = cr2;
                break;
        }
        return cs;
    }
}
>>>>>>> 25dc640967a1a54d1d2a8d51851f53e932f13f94
