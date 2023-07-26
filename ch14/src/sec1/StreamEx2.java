package sec1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//키보드로 문자를 입력받아 out2.txt로 저장하고,
//그 내용을 불러와 콘솔창에 다시 출력하는 프로그램
public class StreamEx2 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("out2.txt");
            byte[] k = indata();
            for(int i=0;i<k.length;i++) {
                fos.write(k[i]);
            }
            fos.close();
        } catch(IOException e){
            e.printStackTrace();
            System.out.println("출력파일이 존재하지 않거나 경로가 틀렸습니다.");
        }

        try {
            FileInputStream fis = new FileInputStream("out2.txt");
            int i;
            while((i = fis.read()) != -1){
                System.out.print((char) i);
            }
            fis.close();
        } catch(IOException e){
            e.printStackTrace();
            System.out.println("입력파일이 존재하지 않거나 경로가 틀렸습니다.");
        }
    }

    static byte[] indata(){
        Scanner sc = new Scanner(System.in);
        boolean job = true;
        byte[] c = new byte[1000];
        int i = 1;
        while(job) {
            System.out.println("문자 입력");
            c[i] = sc.nextByte();
            if (c[i] == 48) {
                job = false;
            }
            i++;
        }
        return c;
    }
}