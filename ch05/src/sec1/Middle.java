package sec1;

public class Middle extends Score {
    private int history;

    public Middle(){ super(); }

    public Middle(int history) {
        this.history = history;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public void prtPoint(){
        System.out.println("");
    }
}
