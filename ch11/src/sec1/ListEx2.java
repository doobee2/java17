package sec1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListEx2 {
    public static void main(String[] args) {
        List lst1 = new ArrayList();
        lst1 = new Vector();
        lst1 = new LinkedList();

        Vector lst2 = new Vector();

        method1(lst1);
        //method2(lst2);
    }
    public static void method1(List ls) { }
    public static void method2(ArrayList ls) { }
}
