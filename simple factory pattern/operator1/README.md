# 字符串相关的内容
基本数据类型比较的是值，而引用数据类型比较的是地址
```
String a = "abs";
String b = new String("abs");
System.out.println(a.equals(b));
```
## 读入字符串
```
Scanner s1 = new Scanner(System.in);
```

## 字符串一些特殊的创建方式
```
 //利用字符数组创建一个字符串，应用场景是将“Abc”修改为“qbc”的情况
char[] shcs = {'a', 'b', 'v'};
String s4 = new String(shcs);
System.out.println(s4);
// 传递一个字节数组，更具字节数组的内容再创建一个新的字符串对象,
// 网络中传递的数据都是字节信息，需要把字节信息进行转换，转成字符串信息
byte[] bytes = {97, 98, 99, 100};
String s5 = new String(bytes);
System.out.println(s5);
```
## 字符串和其他数组类型相互转换
### 字符串和整数类型int相互转换
```
String -> int
1、Integer.parseInt(String)
2、Integer.valueOf(String)

int -> String
1、String.valueOf(int);
2、Integer.toString(int);
3、String s = "" + i;
```
### double与String互相转换
```
String -> Double
1、Double.parseDouble(String)
2、Double.valueof(Double)

double -> String
1、Double.toString(double)
2、String.valueOf(double)
```

