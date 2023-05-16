abstract class accord implements Face{

    public static void main(String[] args) {
        accord obj = new accord() {
            @Override
            public void size(int x, int y) {
                System.out.println(x * y);
            }

            @Override
            public void area(float a, float b) {
                System.out.println(a * b);
            }
        };

        obj.area(10, 20);
        obj.size(15, 45);
    }
}
