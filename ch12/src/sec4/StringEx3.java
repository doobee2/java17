package sec4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringEx3 {
    public static void main(String[] args) {
        String str1 = new String();
        str1+="술비";
        str1+="/";
        str1+="살비";
        str1+="/";
        str1+="즐비";
        str1+="/";
        str1+="설비";
        System.out.println(str1);

        StringBuffer str2 = new StringBuffer(); //StringBuffer : 요소로 생각해서 추가하는 것
        str2.append("루피");                     //요소로 넣었다 뺐다 할 수 있음
        str2.append("/");
        str2.append("에이스");
        str2.append("/");
        str2.append("샹크스");
        str2.append("/");
        str2.append("흰수염");
        System.out.println(str2);
        str2.replace(0,2,"쵸파");
        System.out.println(str2);
        System.out.println(str2.toString());

        StringBuilder str3 = new StringBuilder();   //StringBuilder : 빼내거나 끼워넣을 수 있음.
        str3.append("나루토");
        str3.append("-");
        str3.append("블리치");
        str3.append("-");
        str3.append("슬램덩크");
        str3.append("-");
        str3.append("귀칼");
        System.out.println(str3.toString());
        str3.insert(4,"동물의숲-");
        System.out.println(str3.toString());
        System.out.println(str3.substring(4,8));
        System.out.println(str3.reverse());
        String str = str3.toString();   //String으로 형 변환
        String[] str4 = str.split("-");
        System.out.println(Arrays.toString(str4));
    }
}
