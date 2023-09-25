import java.text.DecimalFormat;

public class Record{
    private String month;
    private double startingBalance;
    private double endingBalance;
    private double amountSaved;
    //Declare constructors
    public Record(){}


    public Record(String monthVar, double startingBalanceVar, double endingBalanceVar)
    {
        //ASSIGN PARAMETERS OF CONSTRUCTOR TO ATTRIBUTES OF THE CLASS
        this.month = monthVar;
        this.startingBalance = startingBalanceVar;
        this.endingBalance = endingBalanceVar;
        this.amountSaved = monthSaving(); //Amount saved is calculated
    }


    //Declare setters
    public void setMonth(String monthVar){
        this.month = monthVar;

    }
    public void setStartingBalance(double startingBalanceVar){
        this.startingBalance = startingBalanceVar;
    }
    public void setEndingBalance(double endingBalanceVar){
        this.endingBalance = endingBalanceVar;
    }
    public void setAmountSaved(){
        amountSaved = monthSaving();
    }

    //Declare Getters
    public String getMonth(){
        return this.month;
    }
    public double getStartingBalance(){
        return this.startingBalance;
    }
    public double getEndingBalance(){
        return this.endingBalance;
    }
    public double getAmountSaved(){
        return this.amountSaved;
    }
    //Declare class methods
    //Method that calculates how much money was saved
    public double monthSaving(){
        //CALCULATE THE AMOUNT OF MONEY SAVED FOR THE MONTH
        return this.endingBalance - startingBalance;
    }
    public void print(){
        System.out.println("Month:" + this.month + ", Starting bal.:$" + String.format("%.2f", this.startingBalance) + ", Ending bal.:$" +  String.format("%.2f",this.endingBalance) + ", Amt. Saved:$"+  String.format("%.2f",getAmountSaved()));

    }




}