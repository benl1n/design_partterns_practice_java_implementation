import java.util.Scanner;

public class Operator2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入数字A: ");
            String strNumberA = sc.nextLine();

            Scanner op_in = new Scanner(System.in);
            System.out.println("请输入运算符号(+、-、*-/): ");
            String strOperator = op_in.nextLine();

            Scanner sc2 = new Scanner(System.in);
            System.out.println("请输入数字B: ");
            String strNumberB = sc2.nextLine();
            String strResult = "";
            switch (strOperator){
                case "+":
                    strResult = Double.toString(Double.parseDouble(strNumberA) + Double.parseDouble(strNumberB));
                    break;
                case "-":
                    strResult = Double.toString(Double.parseDouble(strNumberA) - Double.parseDouble(strNumberB));
                    break;
                case "*":
                    strResult = Double.toString(Double.parseDouble(strNumberA) * Double.parseDouble(strNumberB));
                    break;
                case "/":
                    if (strNumberB.equals("0"))
                        strResult = "除数不能为0";
                    else
                        strResult = Double.toString(Double.parseDouble(strNumberA) / Double.parseDouble(strNumberB));
                    break;
            }
            System.out.println("结果是: " + strResult);
            sc.nextLine();
        }
        catch(Exception e){
            System.out.println("您的输入有错" + e.getMessage());
        }
    }

}
