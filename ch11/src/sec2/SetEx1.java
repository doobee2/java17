package sec2;

import java.util.*;

public class SetEx1 {
    public static void main(String[] args) {
        Set set1 = new HashSet();
        set1 = new TreeSet();

        //set - 데이터 중복X 순서 유지X
        Set<String> set2 = new HashSet<>();
        set2.add("이은영");
        set2.add("최상민");
        set2.add("김이호");
        set2.add("이슬비");
        set2.add("김이호");
        set2.add("이은영");

        System.out.println("Set 결과");

        Iterator it = set2.iterator();  //iterator:분리자
        while (it.hasNext()){   //순서가 없어서 while 사용해야함.
            System.out.println(it.next());
        }
        
        
        //list - 데이터 중복O, 순서 유지O
        List<String> ls2 = new ArrayList<>();
        ls2.add("이은영");
        ls2.add("최상민");
        ls2.add("김이호");
        ls2.add("이슬비");
        ls2.add("김이호");
        ls2.add("이은영");

        System.out.println("List 결과");

        for(String d:ls2){
            System.out.println(d);
        }

    }
}
