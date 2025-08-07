package Implementary_Strategy;

import java.util.Scanner;

public class Cilent {
    double total = 0.0d;
    private void btnOK_click(Object sender, market1.MyEventArgs e){
        CashContext cc = null;
        Scanner sc = new Scanner(System.in);
        String type = String.valueOf(sc);

        switch (type){
            case "正常收费":
                cc = new CashContext(new CashNormal());
                break;
            case "满300返100":
                cc = new CashContext(new CashReturn("300", "100"));
                break;
            case "打8折":
                cc = new CashContext(new CashRebate("0.8"));
                break;
        }

        double totalPrice = 0d;
        // 前面结果 后面数量
        totalPrice = cc.GetResult(Double.parseDouble("1000") * Double.parseDouble("10"));
        total = totalPrice + totalPrice;
        System.out.println("Total price: " + totalPrice + "数量" + "10" + "合计" + String.valueOf(totalPrice));

    }
}
