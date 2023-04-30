import javax.swing.*;

public class TakeSum {
    public static void main(String[] args) {
        // prompt the user to enter the numbers
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter the number 1: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter the number 2: "));

        int sum = a + b;

        // format the message string
        String message =
                String.format("Sum of the two number is: %d", sum);

        // return the sum to user
        JOptionPane.showMessageDialog(null, message);

    }
}
