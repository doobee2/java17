package sec1;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        //키보드로 학번과 세 과목 점수를 입력받아
        //총점, 평균, 학점, 판정, 등급 등을 계산하여 출력하도록 하시오.
        //tot(총점), avg(평균), hak(학점), pan(판정), grd(등급)
        //총점 = 전산 + PG + OA
        //평균은 세 과목 점수의 총점을 3으로 나눈 실수
        //학점은 평균이 96이상 A+, 93이상, A0, 90이상 A-
        //86이상 B+, 83이상 B0, 80이상 B-
        //76이상 C+, 73이상 C0, 70이상 C-
        //66이상 D+, 63이상 D0, 60이상 D-
        //나머지는 F
        //판정은 평균이 80이상이면서, 세 과목 모두 70이상이면, "합격", 아니면 "불합격"
        //등급은 평균을 20으로 나눈 값으로 하되, 5이면 5등급, 4이면 4등급, 3이면 3등급,
        //2이면 2등급, 1이면 1등급
        //출력형식
        //학번  전산  PG  OA  총점  평균  학점  판정  등급
        //XXX  XXX  XXX XXX XXX  XX.XX  XX   XX  X등급

        Scanner sc = new Scanner(System.in);
        System.out.println("학번 : ");
        int cn = sc.nextInt();
        System.out.println("과목1 점수 : ");
        int sub01 = sc.nextInt();
        System.out.println("과목2 점수 : ");
        int sub02 = sc.nextInt();
        System.out.println("과목3 점수 : ");
        int sub03 = sc.nextInt();

        //총점
        float tot = (sub01 + sub02 + sub03);

        //평균
        float avg = (sub01 + sub02 + sub03) / 3.0f;

        //학점
        String hak = "";
        if(avg>=96) {
            hak = "A+";
        } else if(avg>=93) {
            hak = "A0";
        } else if(avg>=90) {
            hak = "A-";
        } else if(avg>=86) {
            hak = "B+";
        } else if(avg>=83) {
            hak = "B0";
        } else if(avg>=80) {
            hak = "B-";
        } else if(avg>=76) {
            hak = "C+";
        } else if(avg>=73) {
            hak = "C0";
        } else if(avg>=70) {
            hak = "C-";
        } else if(avg>=66) {
            hak = "D+";
        } else if(avg>=63) {
            hak = "D0";
        } else if(avg>=60) {
            hak = "D-";
        } else {
            hak = "F";
        }


        //판정 (fan) 평균 80이상 + ㅅㅔ과목 모두 70이상 합격 /

        String pan = "";
        if(avg>=80 && sub01 >=90 && sub02 >=90 && sub03 >=90){
            pan = "합격";
        } else {
            pan = "탈락";
        }

        //등급 평균을 20으로 나눈 값으로 하되, 5이면 5등급, 4이면 4등급, 3이면 3등급,
        //2이면 2등급, 1이면 1등급

        int pt = (int) avg / 20;
        String grade = "";

        switch (pt){
            case 1:
                grade = "5등급";
            case 2:
                grade = "4등급";
            case 3:
                grade = "3등급";
            case 4:
                grade = "2등급";
            case 5:
                grade = "1등급";
                break;
                default:
                grade = "판정불가";



    }

        System.out.println("총점 : " + tot);
        System.out.println("평균 : " + avg);
        System.out.println("학점 : " + hak);
        System.out.println("판정 : " + pan);
        System.out.println("등급 : " + grade);

        System.out.println("학번");
    }}

