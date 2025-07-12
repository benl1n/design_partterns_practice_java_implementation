import java.util.Scanner;

public class Service {
    public static void main(String[] args) {
        try{
            System.out.println("请输入数字 A: ");
            Scanner sc = new Scanner(System.in);
            String strNumberA = sc.nextLine();

            System.out.println("请输入运算符号 (+、-、*、/): ");
            Scanner sc2 = new Scanner(System.in);
            String strOperator = sc2.nextLine();

            Scanner sc3 = new Scanner(System.in);
            System.out.println("请输入数字 B: ");
            String strNumberB = sc3.nextLine();

            String strResult = "";
            strResult = Double.toString(Operation.GetRsult(Double.parseDouble(strNumberA), Double.parseDouble(strNumberB), strOperator));
            System.out.println(strResult);

        }
        catch(Exception e){
            System.out.println("您的输入有错" + e.getMessage());
        }
    }
}
