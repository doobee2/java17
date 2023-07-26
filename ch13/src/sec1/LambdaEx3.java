package sec1;
//Supplier
@FunctionalInterface
interface MyLambda3 {   //추상체
    String print();
}
public class LambdaEx3 {
    public static void main(String[] args) {
        MyLambda3 lam3 = () -> {    //구현체
          return "이슬빙";
        };
        System.out.println(lam3.print());
    }
}
