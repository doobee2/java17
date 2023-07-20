package sec1;
//Type, Element(속성,필드), Key, Number, Value, Result, Question, Query, Generic ...
//첫 번째 글자만 약어로 만들어 인자를 사용하는 것이 관례이다.
//public class 클래스명<인자> { {
public class Gen2<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
