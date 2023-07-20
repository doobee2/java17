package sec2;

import java.util.List;
import java.util.Objects;

public class Multi4 {
    public void method1(List<?> list) {
        for(Object obj : list){
            System.out.println(obj+ "\t");
        }
    }

    public int method2(List<? extends Number> lst){ //목록 합계
        int hap = 0;
        for(Number i:lst){
            hap += i.doubleValue();
        }
        return hap;
    }

    public List<? super Integer> method3(List<? super Integer> lst){
        for(int i=0;i<5;i++){
            lst.add(i);
        }
        return lst;
    }
}
