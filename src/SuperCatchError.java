import java.util.Random;
// the code will fail to compile
public class SuperCatchError {
    public static void main(String[] args) {
        int a, b, c;

        Random random = new Random();
        for(int i = 0; i < 100; i++){
            try {
                try {
                    a = random.nextInt();
                    b = random.nextInt();

                    c = 12345 / (a - b);
                }catch (Exception e){
                    System.out.println(e);
                    c = 0;
                }
//                catch (ArithmeticException e){
//                    System.out.println(e);
//                    c = 0;
//                }
            }catch (Exception e){
                System.out.println(e);
            }

        }
    }
}
