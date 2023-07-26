package sec1;
@FunctionalInterface
interface MyLambda4 {
    String print(int a);
}
public class LambdaEx4 {
    public static void main(String[] args){

        MyLambda4 lam4 = (a) -> {
            return "나는"+a+"다!!!";
        };
        System.out.println(lam4.print(1004));
    }
}
