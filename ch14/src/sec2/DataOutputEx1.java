package sec2;

import java.io.*;

//파일 생성 클래스 File, Files(반드시 Path 써야함), FileOutputStream
//DataOutputStream : 한글과 같은 캐릭터셋을 지정하여 출력할 수 있음. => 기본셋 UTF-8
public class DataOutputEx1 {
    public static void main(String[] args) {
        try {
            File file = new File("out7.txt");

            if(!file.exists()){
                file.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            DataOutputStream dos = new DataOutputStream(bos);
            dos.writeUTF("이슬비 천재");
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
