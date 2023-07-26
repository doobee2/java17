package sec3;

public class SystemEx3 {
    public static void main(String[] args) {
        //성능 평가 기준
        //성능 측정 : 처리능력(Throughput), 반환시간(=응답시간)(Turn Around Time)
        //사용 가능도(Availability), 신뢰도(Reliability)
        long tot = 0;
        long start = System.nanoTime();    // currentTimeMillis : 1/1000초, nanoTime : 1/1000000000
        for(int i=0; i<100000; i++){
            System.out.println(i);
            tot+=i;
        }
        long end = System.nanoTime();
        System.out.println("누적 결과 : "+tot);
        System.out.println("걸린 시간 : "+(end - start)+"ns");
    }
}
