package sec1;

public class ChunjaeEx2 {
    public static void main(String[] args) {
        Chunjae c1 = new Chunjae();

        //c1.no = 10; // - private이므로 같은 클래스내부에서만 접근 가능하므로 접근 불가
        c1.partNo =1234; // default이므로 같은 패키지에서만 접근 가능하므로 접근 가능
        c1.point = 200; //protected이므로 같은 패키지에 있거나 상속관계에 있을 때만 가능하므로 접근 가능
        c1.name = "이슬비"; //public 이므로 어느 패키지나 클래스에 관계없니 모두 접근가능하므로 접근 가능

        System.out.println(Chunjae.PI * 20 * 20);

        Sengwon s1 = new Sengwon(); //같은 패키지에 있는 클래스가 아니므로 사용 불가
        Nayeon ch1 = new Nayeon();

        int[] k = new int[100];

        Sengwon[] s = new Sengwon[10]; //객체 배열 s[0]. s[1] ~ s[9]
        //s[0].num ~ s[9].num

        for(int a=0;a<s.length;a++){
            s[a] = new Sengwon();
         //   s[a].setNum(a+1);
         //   s[a].setData("슬비"+(a+1));
        }

        for(int a=0; a<s.length; a++){
          //  System.out.println(s[a].getNum());
          //  System.out.println(s[a].getData());
            System.out.println("------------------------------------");
        }

    }
}
