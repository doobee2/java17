package sec2;

import sec1.Chunjae;

public class ChunjaeEx1 {
    public static void main(String[] args) {


    Chunjae c1 = new Chunjae();

    //c1.no = 10; -private이므로 같은 클래스 내부에서만 접근 가능하므로 접근 불가
    //1.partNO = 1234; //-default이므로 같은 패키지에서만 접근 가능하므로 접근 불가
    //c1.point = 200; //protected이므로 같은 패키지에 있거나 상속관계에 있을 때만 가능하므로 접근 가능
    c1.name = "김기태"; //public 이므로 어느 패키지나 클래스에 관계없니 모두 접근가능하므로 접근 가능


    }
}
