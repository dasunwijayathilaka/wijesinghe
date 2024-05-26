package lk.ijse.model;



public class payment {

    private String P_ID;
    private String P_Type;
    private double P_Amount;
    private int Transaction_Date;
    private int Transaction_Time;
    private String Card_Type;
    private String Billing_Address;

    // Default constructor
    public payment() {
    }

    // Parameterized constructor
    public payment(String p_ID, String p_Type, double p_Amount, int transaction_Date, int transaction_Time, String card_Type, String billing_Address) {
        P_ID = p_ID;
        P_Type = p_Type;
        P_Amount = p_Amount;
        Transaction_Date = transaction_Date;
        Transaction_Time = transaction_Time;
        Card_Type = card_Type;
        Billing_Address = billing_Address;
    }

    public String getP_ID() {
        return P_ID;
    }

    public void setP_ID(String p_ID) {
        P_ID = p_ID;
    }

    public String getP_Type() {
        return P_Type;
    }

    public void setP_Type(String p_Type) {
        P_Type = p_Type;
    }

    public double getP_Amount() {
        return P_Amount;
    }

    public void setP_Amount(double p_Amount) {
        P_Amount = p_Amount;
    }

    public int getTransaction_Date() {
        return Transaction_Date;
    }

    public void setTransaction_Date(int transaction_Date) {
        Transaction_Date = transaction_Date;
    }

    public int getTransaction_Time() {
        return Transaction_Time;
    }

    public void setTransaction_Time(int transaction_Time) {
        Transaction_Time = transaction_Time;
    }

    public String getCard_Type() {
        return Card_Type;
    }

    public void setCard_Type(String card_Type) {
        Card_Type = card_Type;
    }

    public String getBilling_Address() {
        return Billing_Address;
    }

    public void setBilling_Address(String billing_Address) {
        Billing_Address = billing_Address;
    }


    public String toString() {
        return "Payment{" +
                "P_ID='" + P_ID + '\'' +
                ", P_Type='" + P_Type + '\'' +
                ", P_Amount=" + P_Amount +
                ", Transaction_Date=" + Transaction_Date +
                ", Transaction_Time=" + Transaction_Time +
                ", Card_Type='" + Card_Type + '\'' +
                ", Billing_Address='" + Billing_Address + '\'' +
                '}';
    }
}
