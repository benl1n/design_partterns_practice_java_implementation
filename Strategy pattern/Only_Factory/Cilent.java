<<<<<<< HEAD
package Only_Factory;

public class Cilent {
    double total = 0.0d;
    private void btnOK_click(Object sender, market1.MyEventArgs e){
        CashSuper csuper = CashFactory.createCashSuper("打8折");
        double totalPrice = 0d;
        // 前面结果 后面数量
        totalPrice = csuper.acceptCash(Double.parseDouble("1000") * Double.parseDouble("10"));
        total = totalPrice + totalPrice;
        System.out.println("Total price: " + totalPrice + "数量" + "10" + "合计" + String.valueOf(totalPrice));

    }
}
=======
package Only_Factory;

public class Cilent {
    double total = 0.0d;
    private void btnOK_click(Object sender, market1.MyEventArgs e){
        CashSuper csuper = CashFactory.createCashSuper("打8折");
        double totalPrice = 0d;
        // 前面结果 后面数量
        totalPrice = csuper.acceptCash(Double.parseDouble("1000") * Double.parseDouble("10"));
        total = totalPrice + totalPrice;
        System.out.println("Total price: " + totalPrice + "数量" + "10" + "合计" + String.valueOf(totalPrice));

    }
}
>>>>>>> 25dc640967a1a54d1d2a8d51851f53e932f13f94
