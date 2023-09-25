import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList; // import the ArrayList class

class Main {
    public static void main(String[] args) {
        ArrayList<Record> ar= new ArrayList<Record>();
        double totalSaved=0.0;
        try{
            File myObj = new File("Savings.csv");
            Scanner myReader = new Scanner(myObj);
            myReader.nextLine();
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                String[] arr = data.split(",");
                Record r= new Record(arr[0],Double.parseDouble(arr[1]),Double.parseDouble(arr[2]));
                ar.add(r);
                totalSaved+=r.getAmountSaved();

            }
            myReader.close();

        }catch(FileNotFoundException e){
            System.out.println("An error has occured.");
            e.printStackTrace();
        }
        for(Record rec:ar){
            rec.print();
        }
        System.out.println("Total amount Saved $"+String.format("%.2f",totalSaved));
        System.out.println("Average monthly Saving was $"+averageMonthlySaving(totalSaved,ar.size()));

    }
    public static double averageMonthlySaving(double totalSaved, int arrSize){
        return totalSaved/arrSize;
    }
}