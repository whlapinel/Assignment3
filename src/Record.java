
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