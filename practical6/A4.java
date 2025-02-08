//Create a class named Bank_Account with data memebers accountNo, userName, email,
//accountType and accountBalance, Also create methods getAccountDetails() and
//displayAccountDetails().
package practical6;
class Bank_Account{
    int accountNo;
    String userName;
    String email;
    String accountType;
    int accountBalance;

    public Bank_Account(int accountNo, String userName, String email, String accountType, int accountBalance){
        this.accountNo = accountNo;
        this.userName = userName;
        this.email = email;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public void getAccountDetails(int accountNo, String userName, String email, String accountType, int accountBalance) {
        this.accountNo = accountNo;
        this.userName = userName;
        this.email = email;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public void displayAccountDetails(){
        System.out.println("AccountNo:"+accountNo+" is having "+accountBalance+" Rs in account ");
    }
}
public class A4 {
    public static void main(String[] args) {
        Bank_Account niraj = new Bank_Account(121,"niraj","fewfew","saving",1000);
        Bank_Account raj = new Bank_Account(111,"raj","dfewfwe","saving",2000);
        niraj.displayAccountDetails();
    }
}
