interface I{
    void run();
    void print();
}

class B implements I{
    @Override
    public void run() {
        System.out.println("Running...");
    }

    @Override
    public void print() {
        System.out.println("Printing...");
    }
}
public class A{
    public static void main(String[] args) {
        B obj = new B();
        obj.print();
        obj.run();
    }
}
