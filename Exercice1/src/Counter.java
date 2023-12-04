public class Counter {
    private int count;
    public Counter() {

    }
    public Counter(int count) {
        this.count = Math.max(count, 0);
    }
    public Counter(Counter source) {
        this.count = source.count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void incrementar() {
        this.count++;
    }
    public void decrementar() {
        if(this.count-- < 0) {
            this.count = 0;
        } else {
            this.count--;
        }
    }
}
