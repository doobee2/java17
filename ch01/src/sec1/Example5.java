package sec1;

public class Example5 {
    public static void main(String[] args) {
        byte b1 = 104;
        //byte b2 = -129;   해당 표현범위보다 작음 ubderflow
        //byte b3 = 128;    해당 표현범위보다 큼 overflow
        
        short s1 = 32767;
        //short s2 = -32769;  언더플로우
        //short s3 = 32768;   오버플로우
        
        int i1 = 214748367;
        //int i2 = -2147483649;   언더플로우
        //int i3 = 2147483648     오버플로우

        char c1 = 65535;
        //char c2 = -1;        언더플로우 - 2byte
        //char c3 = 65536;     오버플로우

    }
}
