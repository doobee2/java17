package sec2;

import java.io.*;

//PrintWriter : 출력을 버퍼, 한 줄, 한 글자, 문자열 등의 모든 단위의 파일에 쓰기 작업

public class PrinterWriterEx1 {
    public static void main(String[] args) {
        try {
            File file = new File("out4.txt");   //노트
            if (!file.exists()) {       //파일 있는지 없는지 확인 참/거짓
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);   //연필
            PrintWriter writer = new PrintWriter(fw); //필기 잘하는 사람!

            //연필로 노트에 쓰기
            writer.write("점심시간 10분전");
            writer.println("배고파 죽겠다!");
            writer.print("밥");
            writer.print("\n배가 찢어지겠어..");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
