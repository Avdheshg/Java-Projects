import java.util.*;

public class Main {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Choose Account Type");
        System.out.println("1.Savings Account" + "\n" + "2.Current Account");

        int input = sc.nextInt();

        if (input == 1) {
            System.out.println(
                    "Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)");

            String ipArr[] = takeInput();

            SavingsAccount sa = new SavingsAccount(ipArr[0], ipArr[1], ipArr[2], ipArr[3]);
            sa.display();
        } else {
            System.out.println(
                    "Enter Account details in comma separated(Account Name,Account Number,Bank Name,TIN Number)");

            String ipArr[] = takeInput();
            CurrentAccount ca = new CurrentAccount(ipArr[0], ipArr[1], ipArr[2], ipArr[3]);
            ca.display();
        }
    }

    public static String[] takeInput() {
        sc.nextLine();
        String ip = sc.nextLine();
        String[] ipArr = ip.split(",");
        // System.out.println(ipArr);

        return ipArr;
    }

}
