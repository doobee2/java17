package sec1;

public class Example1 {
    public static void main(String[] args) {

        //배열 기본 개념


        int[] a;    //선언1 - 타입[] 배열명; 메모리 할당 안한 상태로 선언한 것
        int b[];    //선언2 - 타입 배열명[];  (상동)

        int[] c = new int[3];   //선언과 할당
        int d;
        
        //a는 선언만 된 상태이며, 메모리 할당이 되지 않았기 떄문에 error
        //System.out.println("a[0]"+a[0]);
        System.out.println("a[0]="+c[0]);
        //d는 primitive 타입이므로 반드시 초기화가 필요함
        //System.out.println("d="+d); 에러뜸


    }
}
