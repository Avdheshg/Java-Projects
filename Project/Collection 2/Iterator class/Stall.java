import java.util.*;
public class Stall {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Account Type");
        System.out.println("1.Savings Account" + "\n"
                            "2.Current Account");

        int input = sc.nextInt();

        switch(input) {
            case 1:
                String given[] = takeInput();
        }
    }

    public static String[] takeInput() {
        String[] ip = new String[3];

    }
}

class Account {

   private String accName;
   private String accNo;
   private String bankName;

    public Account(String accName, String accNo, String bankName) {
        this.accName = accName;
        this.accNo = accNo;
        this.bankName = bankName;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void display() {
        System.out.println("Account Name:" + getAccName());
        System.out.println("Account Number:" + getAccNo());
        System.out.println("Bank Name:" + getBankName());
//        System.out.println("Organisation Name" + get);
    }
}

class CurrentAccount extends Account {

    private String tinNumber;

    public CurrentAccount(String accName, String accNo, String bankName, String tinNumber) {
        super(accName, accNo, bankName);
        this.tinNumber = tinNumber;
    }

    public String getTinNumber() {
        return tinNumber;
    }

    public void setTinNumber(String tinNumber) {
        this.tinNumber = tinNumber;
    }

    public void display() {
        super.display();
        System.out.println("TIN Number:" + getTinNumber());
    }
}

class SavingsAccount extends Account{

    private String orgName;

    public SavingsAccount(String accName, String accNo, String bankName, String orgName) {
        super(accName, accNo, bankName);
        this.orgName = orgName;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public void display() {
        super.display();
        System.out.println("Organisation Name:" + getOrgName());
    }

}
































































