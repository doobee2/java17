package sec1;
@FunctionalInterface
interface MyLambda6<T, Q>{
    Q calc(T x, T y);
}
public class LambdaEx6 {
    //사칙연산 진행
    public static void main(String[] args) {
        MyLambda6<Integer, Integer> puls = (x, y) -> {
            return x+y;
        };
        MyLambda6<Integer, Integer> minus = (x, y) -> {
            return x-y;
        };
        MyLambda6<Integer, Long> mul = (x, y) -> {
            return (long) x*y;
        };
        MyLambda6<Integer, Double> div = (x, y) -> {
            return (double) x/y;
        };
        MyLambda6<Integer, Integer> mod = (x, y) -> {
            return x % y;
        };
        System.out.println("더하기 : " +puls.calc(10, 20));
        System.out.println("빼기 : " +minus.calc(10, 20));
        System.out.println("곱하기 : " +mul.calc(10, 20));
        System.out.println("나누기 : " +div.calc(10, 20));
        System.out.println("나머지 : " +mod.calc(10, 20));
    }
}