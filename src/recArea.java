public class recArea {
    private int len;
    private int breadth;

    public recArea(int a, int b){
        this.len = a;
        this.breadth = b;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void calculate(){
        System.out.println(this.len * this.breadth);
    }
    public static void main(String[] args) {
        recArea rec = new recArea(10, 20);
        rec.calculate();
    }
}
