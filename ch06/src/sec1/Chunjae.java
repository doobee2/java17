package sec1;

class Nayeon {
    private int seq;
    private int data;

    public Nayeon() {
        this(1);
    }
    public Nayeon(int seq){
        this(seq, 100);
    }
    public Nayeon(int seq, int data) {
        this.seq = seq;
        this.data = data;
    }
}
class Seulbee {
    private int num = 1;
    private String data = "이슬비";

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
public class Chunjae {
    //멤버 필드 = 변수, 상수
    private int no;
    protected int point;
    int partNo;
    public String name;
    public final static double PI = 3.141592;   //상수
    public void getValue(int no){   //private멤버는 클래스 내부에서만 this로 접근 가능
        this.no = no;
    }

}
