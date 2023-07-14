package sec1;

public class Board {
    private int no;
    private String title;
    private String content;
    private String resdate;
    private int viewcnt;

    public Board() { }

    public Board(int no) { this.no = no; }

    public Board(int no, String title) {
        this.no = no;
        this.title = title;
    }

    public Board(int no, String title, String content) {
        this.no = no;
        this.title = title;
        this.content = content;
    }

    public Board(int no, String title, String content, String resdate) {
        this.no = no;
        this.title = title;
        this.content = content;
        this.resdate = resdate;
    }

    public Board(int no, String title, String content, String resdate, int viewcnt) {
        this.no = no;
        this.title = title;
        this.content = content;
        this.resdate = resdate;
        this.viewcnt = viewcnt;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getResdate() {
        return resdate;
    }

    public void setResdate(String resdate) {
        this.resdate = resdate;
    }

    public int getViewcnt() {
        return viewcnt;
    }

    public void setViewcnt(int viewcnt) {
        this.viewcnt = viewcnt;
    }

    public final static void method1(){
        System.out.println("여기는 Board입니다.");
    }

    public void method2(){
        System.out.println("여기는 Board2입니다.");
    }

    public static void method3(){
        System.out.println("여기는 Board3입니다.");
    }
}
