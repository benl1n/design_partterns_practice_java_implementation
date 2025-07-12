import java.util.Scanner;
// 字符串的内容是不会改变的，它的值在创建后不能被更改
public class Operator {
    public static void main(String[] args){
        // 代码相关问题
        // String A,B,C 的命名不规范
        // 判断分支，每个条件都要做判断，等于做了三次无用功
        // 出现除数为0的情况或者是输入的是字符而不是数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字A: ");

        String A = sc.nextLine();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("请选择运算符号(+、-、*-/):");
        String B = sc1.nextLine();

        System.out.println("请输入数字B: ");
        Scanner sc2 = new Scanner(System.in);
        String C = sc2.nextLine();
        String D = "";

        if (B.equals("+"))
            D = String.valueOf(Double.parseDouble(A) + Double.parseDouble(C));
        if (B.equals("-"))
            D = String.valueOf(Double.parseDouble(A) - Double.parseDouble(C));
        if (B.equals("*"))
            D = String.valueOf(Double.parseDouble(A) * Double.parseDouble(C));
        if (B.equals("/"))
            D = String.valueOf(Double.parseDouble(A) / Double.parseDouble(C));
        System.out.println("结果是: " + D);
    }
}
