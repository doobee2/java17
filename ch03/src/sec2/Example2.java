package sec2;

public class Example2 {
    public static void main(String[] args) {

        /*
        int 카운트 = 0;
        while(조건식) {
            증감식;
            반복실행할 문장;
            }
         */

        int i = 0;
        int tot = 0;
        while (i<=100){
            i++;
            tot+=i;
        }
        System.out.println("tot = "+tot);

        i = 0;
        tot = 0;
        //무한루프 : 끝없이 계속 반복 실행되는 문장
        while (i>=0){
            i++;
            tot+=i;
            if(i>=100) break; //무한루프 멈추게 할 때
        }
        System.out.println("tot = "+tot);
    }
}
