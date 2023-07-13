package sec1;

public class Example4 {
    public static void main(String[] args) {
        //32 16 8 4 2 1
        // 0  1 0 1 0 0
        int a = 20;  //10100
        int b = 14;  //01110

        //비트연산
        System.out.println("a & b :"+(a&b));    //00100 => 4
        System.out.println("a | b :"+(a|b));    //11110 => 30
        System.out.println("~a :"+(~a));        //-21
        System.out.println("a ^ b :"+(a^b));    //11010

        System.out.println("a>>2 : "+(a>>2));
        System.out.println("a<<2 : "+(a<<2));
        System.out.println("a>>>2 : "+(a>>>2));
    }
}
