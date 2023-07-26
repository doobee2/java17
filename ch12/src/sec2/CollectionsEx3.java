package sec2;

import java.util.Calendar;

public class CollectionsEx3 {
    public static void main(String[] args) {

        int year = 2023;    //Integer.parseInt("2023");
        int month = 7;  //Integer.parseInt("args[1]);
        int START_DAY_OF_WEEK = 0; //1일의 요일
        int END_DAY = 0;

        Calendar sDay = Calendar.getInstance(); //시작일
        Calendar eDay = Calendar.getInstance(); //끝일

        //월의 경우 0부터 11까지의 값을 가져서 1을 빼줘야함.
        sDay.set(year, 6, 1); //2023.07.01
        eDay.set(year, 7, 1); //2023.08.01

        //7월의 마지막 날을 알기 위해 eDay에서 하루 빼기.
        eDay.add(Calendar.DATE, -1); //2023.07.31
        START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
        END_DAY = eDay.get(Calendar.DATE);
        System.out.println("\t\t\t\t\t"+year+"년"+month+"월");
        System.out.println("일\t월\t화\t수\t목\t금\t토");

        //반복문 사용하기
        System.out.print("\t\t\t\t\t\t");
        for(int i=1, n=7; i <= 31; i++, n++){
            System.out.print((i < 10)? i+"\t" : i+"\t");
            if(n%7==0) System.out.println();
        }
    }
}