package sec1;
//Consumer
@FunctionalInterface
interface MyLambda2 {
    void print(int x);
}
public class LambdaEx2 {
    public static void main(String[] args) {
        MyLambda1 lam1 = () -> {
            System.out.println("오늘 가산역 사고");
        };
        lam1.print();

        MyLambda2 lam2 = (x) -> {
            System.out.println("제곱 결과 : "+(x*x));
        };
        lam2.print(1004);
    }
}
