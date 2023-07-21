package sec2;

import java.util.*;
import java.util.Map.*;
//Map은 키!
public class MapEx1 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, String> map2 = new Hashtable<>();
        Map<String, Integer> map3 = new TreeMap<>();
        Properties map4 = new Properties();    //Properties은 제네릭 타입으로 X

        map1.put("no", 1);  //map.put - (속성이름, 값) =>no의 값은 1이다
        map1.put("kor", 100);
        map1.put("eng", 70);
        map1.put("mat", 90);
        System.out.println(map1);
        System.out.println("국어점수:"+map1.get("kor"));
        //값은 중복될 수 있으나 키는 중복되면 안됨.
        if(map1.containsKey("soc")){
            System.out.println("해당 키가 존재합니다.");
        } else {
            map1.put("soc",100);
        } 
        if(map1.containsValue(100)){
            System.out.println("만점 과목이 있습니다.");
        } else {
            System.out.println("만점 과목 없음");
        }

        //맵의 순회 ***아주 중요!!
        for(Entry<String, Integer> eSet : map1.entrySet()){
            System.out.println(eSet.getKey()+":"+eSet.getValue());
        }

        map2.put("name", "leeseulbee");
        map2.put("age", "20");
        map2.put("height", "165.6");
        map2.put("weight", "45.3");
        System.out.println(map2);

        if(map2.containsKey("weight")){
            map2.remove("weight");
        } else {
            System.out.println("해당 키가 존재하지 않음");
        }
        System.out.println("이름 :"+map2.get("name"));

        //해쉬 테이블(HashTable)의 순회
        for(Entry<String, String> eSet : map2.entrySet()){
            System.out.println(eSet.getKey()+":"+eSet.getValue());
    }
        map3.put("no", 1);
        map3.put("age", 20);
        map3.put("height", 165);
        map3.put("weight", 45);
        System.out.println(map3);

        if(map3.containsKey("weight")){
            map3.remove("weight");
        } else {
            System.out.println("해당 키가 존재하지 않음");
        }
        System.out.println("이름 :"+map3.get("no"));

        //해쉬 테이블(HashTable)의 순회
        for(Entry<String, Integer> eSet : map3.entrySet()){
            System.out.println(eSet.getKey()+":"+eSet.getValue());
        }

        //Property 무조건 문자입력, set과 달리 get은 key만 적어도 됨.
        map4.setProperty("margin", "40px");
        map4.setProperty("padding", "30px");
        map4.setProperty("width", "1200px");
        map4.setProperty("height", "50px");
        System.out.println("폭 : "+map4.getProperty("width"));

    }
}
