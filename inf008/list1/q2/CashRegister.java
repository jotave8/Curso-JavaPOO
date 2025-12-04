package q2;

public class CashRegister {

    private double currentBalance;
    private int transactionCount;
    private String registerId;
    private String description;

    public CashRegister (double currentBalance, int transactionCount){
        setCurrentBalance(currentBalance); 
        setTransactionCount(transactionCount);
    }

    public CashRegister (int transactionCount, String registerId){
        setTrasactionCount(transactionCount);
        setRegisterId(registerId);
    }

    public CashRegister (String registerId, double currentBalance){
        setRegisterId(registerId);
        setCurrentBalance(currentBalance);
    }


    public void setCurrentBalance(double currentBalance){
        this.currentBalance = currentBalance;
    }

    public void setRegisterId(String registerId){
        this.registerId = registerId;   
    }
    
    public void setTransactionCount(int transactionCount){
        this.transactionCount = transactionCount;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public String getRegisterId(){
        return registerId;
    }

    public int getTransactionCount(){
        return transactionCount;
    }

    public double getCurrentBalance(){
        return currentBalance;
    }

    public void processPayment(double amount){
        setCurrentBalance(getCurrentBalance() - amount);
        setTransactionCount(getTransactionCount() + 1);
    }

    public void processPayment(double amount, String description){
        setCurrentBalance(getCurrentBalance() - amount);
        setTransactionCount(getTransactionCount() + 1);
    }

    public void processPayment(int amount){
        setCurrentBalance(getCurrentBalance() - amount);
        setTransactionCount(getTransactionCount() + 1);
    }

    public void processRefund(double amount){
        setCurrentBalance(getCurrentBalance() + amount);
        setTransactionCount(getTransactionCount() + 1);
    }

    public String getDailyReport(){
        String report = "+++++++++++++++++++++++++++++++++++++++++++++++++++++++"
                + "\nCurrent Balance: " + getCurrentBalance()
                + "\nNumber of transactions: " + getTransactionCount()
                + "\nRegister ID: ";
        if (getRegisterId() == null){
            report += " ";
        }else{
            report += getRegisterId();
        } 
        return report;
    }
}