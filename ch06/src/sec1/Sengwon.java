package sec1;

public class Sengwon extends Chunjae {
    @Override
    public void getValue(int no) {
        super.getValue(no+100);
    }
}
