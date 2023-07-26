package sec1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ApiEx3 {
    public static void main(String[] args) {
        //Math.random() : 0~1의 실수
        //int su1 = (int) (Math.random()*44+1); //1~45까지 나오는 식이 됨.
        //System.out.println("임의의 수 : "+su1);
        //로또 추첨기

        int lotto[] = new int[6];

        for(int i=0; i<6; i++) {
            lotto[i] = (int)(Math.random()*44+1); //1~45 임의숫자 대입
            for(int j=0; j<i; j++) {              //중복제거
                if(lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
        }
        System.out.print("로또 번호 : ");

        for(int i=0; i<6; i++) {
            System.out.print(lotto[i] + " ");
        }


        System.out.println("\n==================================");


        //강사님버전
        Integer[] lotto2 = new Integer[6];

        for(int i=0; i<6; i++) {                //1~45 임의숫자 대입
            lotto2[i] = (int) (Math.random() * 44 + 1);
            System.out.println(lotto2[i]);
        }
        //중복성 해결을 위하여 배열을 Set으로 변환
        Set<Integer> gen = new HashSet<>(Arrays.asList(lotto2));

        //중복된 번호가 있으면, 개수가 6개 미만이므로 6개 미만인 경우
        //중복없이 요소가 6개가 될 때까지 반복
        while (gen.size()<6){
            gen.add((int) (Math.random()*44+1));
        }

        System.out.println("==================================");


        //Set을 Array(배열)로 변환
        lotto2 = gen.toArray(new Integer[6]);
        Arrays.sort(lotto2); //오름차순 정렬하기
        //Arrays.sort(lotto, Collections, reverseOrder()); //내림차순 정렬하기
        System.out.println(Arrays.toString(lotto2));
    }
}
