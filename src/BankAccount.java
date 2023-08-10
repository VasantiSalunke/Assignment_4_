public class BankAccount {
    private int accno;
    private String accname;
    private int balance;
    private Date openingdate;
   // private Date dob;

    public BankAccount(){

    }

    public BankAccount(int accno, String accname, int balance, int day, int month, int year){
        this.accno = accno;
        this.accname = accname;
        this.balance = balance;
        this.openingdate = new Date(day,month,year);
       // this.dob = new Date(day,month,year);
    }

    public void display() {
        System.out.println("Account No = " + accno);
        System.out.println("Account Name = " + accname);
        System.out.println("Balance = " + balance);
        System.out.println("Opening Date = " + openingdate.getDay() + "-" + openingdate.getMonth() + "-" + openingdate.getYear());

    }

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public String getAccname() {
        return accname;
    }

    public void setAccname(String accname) {
        this.accname = accname;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Date getOpeningdate() {
        return openingdate;
    }

    public void setOpeningdate(Date openingdate) {
        this.openingdate = openingdate;
    }


}
