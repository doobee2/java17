package sec2;

class Student {
    public String concept;
}
public class MultiEx1 {
    public static void main(String[] args) {
        Student st1 = new Student();
        Multi1 mull = new Multi1<Student, String>();
        mull.setValue("김기태");


    }
}
