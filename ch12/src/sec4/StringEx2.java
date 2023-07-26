package sec4;

import java.util.StringTokenizer;

public class StringEx2 {
    public static void main(String[] args) {
        String mem1 = "이슬비/박나연/최상민/황교진/김이호";
        String[] m1 = mem1.split("/");
        for(String name:m1){
            System.out.println(name);
        }
        System.out.println("============================");
        String mem2 = "김슬비&박슬비,오슬비,윤슬비-최슬비";
        String[] m2 = mem2.split("&|,|-");
        for(String name:m2){
            System.out.println(name);
        }
        System.out.println("============================");
        String mem3 = "일슬비/이슬비/삼슬비/사슬비/오슬비";
        StringTokenizer em3 = new StringTokenizer(mem3, "/");
        int cnt = em3.countTokens();    //토큰에 의해 분리된 요소수
        for(int i=0; i<cnt; i++){
            String token = em3.nextToken();
            System.out.println(token);
        }

    }
}
