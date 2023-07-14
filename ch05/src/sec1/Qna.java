package sec1;

public class Qna extends Board {
    public static final String DUMMY = "테스트글제목";

    private int level;
    private int parno;

    public Qna() { super(); }

    public Qna(int no) { super(1); }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getParno() {
        return parno;
    }

    public void setParno(int parno) {
        this.parno = parno;
    }

    @Override
    public void method2() {
        System.out.println("Qna 입니다.");
    }
}
