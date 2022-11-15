package class23;

public interface IDataBase {


    // variables inside interface are always "public static final"
    //methods are abstract by default
    void openDatabase();
    void readData();
    void WriteData();
}
class IBM implements IDataBase{

       @Override
    public void openDatabase() {
        System.out.println("Opening the IBM database");
    }

    @Override
    public void readData() {
        System.out.println("Reading the data from the IBM database");
    }

    @Override
    public void WriteData() {
        System.out.println("Writing the data from IBM database");
    }
}