public class Transactions {
    //class fields
    private String cardNumber;
    private String date;
    private String type;
    private double amount;
    private double balance;

    //default constructor

    public Transactions(String cardNumber, String date, String type, double amount) {
        this.cardNumber = cardNumber;
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.balance = 0;
    }

}
