package Strategy_factory;

import java.util.Scanner;

public class Cilent {
    double total = 0.0d;
    private void btnOK_click(Object sender, market1.MyEventArgs e){
        Scanner sc = new Scanner(System.in);
        String type = String.valueOf(sc);
        CashContext csuper = new CashContext(type);

        double totalPrice = 0d;
        // 前面结果 后面数量
        totalPrice = csuper.GetResult(Double.parseDouble("1000") * Double.parseDouble("10"));
        total = totalPrice + totalPrice;
        System.out.println("Total price: " + totalPrice + "数量" + "10" + "合计" + String.valueOf(totalPrice));

    }
}
