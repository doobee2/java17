package sec1;

public class Example2 {
    public static void main(String[] args) {
        boolean a = true;   //논리형 변수  - 1byte
        byte b = 127;   //바이트 변수 : -128~127  - 1byte
        char c = 'k';   //문자 변수  -2byte
        short d = 32767;    //반정도 변수 : -32768~32767  - 2byte
        int e = 785367800;  //단정도정수 : 4byte
        long f = 785367800l; //배정도정수 : 4byte -> 8byte

        // 348678.2478 => + 10의 6승 X 3486702478

        float g = 3.141592f;    //단정도실수 -> 4byte
        double h = 3.141592;    //배정도실수 -> 8byte
        double i = 3.141592000000000000008d;

        //프리미티브타입 변수는 표현범위가 있으며, 표현범위를 벗어나면, 오류발생
        //반드시, 초기화 되어야 한다!
        //초기화 : 가장 처음에 데이터를 넣는 것을 의미


        System.out.println("a="+a);
        System.out.println("b="+b);


        ////표현범위 : -2의 n-1승 ~ 2의 n-1승의-1



    }
}
