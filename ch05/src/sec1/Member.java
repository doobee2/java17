package sec1;

public class Member {
    private String id;
    private String pw;
    private String name;
    private String email;
    private String tel;
    private String birth;
    private int point;

    public Member() { this("lee"); }
    public Member(String id){
        this(id, "1234");
    }
    public Member(String id, String pw){
        this(id, pw, "seulbee");
    }
    public Member(String id, String pw, String name){
        this(id, pw, name, "seulbee0224@gmail.com");
    }
    public Member(String id,  String pw, String name, String email){
        this(id, pw, name, email, "010-1234-5678");
    }

    public Member(String id, String pw, String name, String email, String tel) {
        this(id, pw, name, email, tel, "2001-09-17");
    }
    public Member(String id, String pw, String name, String email, String tel, String birth) {
        this(id, pw, name, email, tel, birth, 100);
    }

    public Member(String id, String pw, String name, String email, String tel, String birth, int point) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.email = email;
        this.tel = tel;
        this.birth = birth;
        this.point = point;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
