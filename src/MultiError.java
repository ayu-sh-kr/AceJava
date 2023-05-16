import java.security.SecureRandom;

public class MultiError {
    public static void main(String[] args) {
        int a = 0, b = 0, count = 0, invalid_idx_Count = 0;
        int[] c = new int[7];
        SecureRandom random = new SecureRandom();
        for(int i = 0; i < 100; i++){
            try {
                a = random.nextInt(1, 7);
                b = random.nextInt(1, 7);

                int d = 12345 / (a - b);
                c[b]++;
                if((a + b) > 6)
                    c[a + b]++;
            }catch (ArithmeticException e){
//                System.out.println(e);
                a = 0;
                count++;
            }catch (ArrayIndexOutOfBoundsException e){
//                System.out.println(e);
                count++;
                invalid_idx_Count++;
                System.out.println("The invalid index is: " + (a + b));
            }
        }

        for (int i = 1; i < 7; i++){
            System.out.println(i + ": " + c[i]);
        }
        System.out.println("Total error encountered: " + count);
        System.out.println("Invalid index count: " + invalid_idx_Count);
    }
}
