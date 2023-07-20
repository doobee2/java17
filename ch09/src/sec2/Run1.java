package sec2;

class SBRunnable implements Runnable {
    @Override
    public void run() {
        String[] str = {"한선", "이소윤", "박나연", "최상민", "박진권", "김기태"};
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //퇴실체크 하기
        for(String name:str){
            System.out.println("출석 체크 : "+name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

class SCRunnable implements Runnable {
    @Override
    public void run() {
        String[] str = {"한선", "이소윤", "박나연", "최상민", "박진권", "김기태"};
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //퇴실체크 하기
        for(String name:str){
            System.out.println("퇴실 체크 : "+name);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

public class Run1{

    public static void main(String[] args) {

        Runnable sbRun1;
        sbRun1 = new SBRunnable();
        Thread t1 = new Thread(sbRun1);
        t1.start();

        sbRun1 = new SCRunnable();
        Thread t2 = new Thread(sbRun1);
        t2.start();
    }
}