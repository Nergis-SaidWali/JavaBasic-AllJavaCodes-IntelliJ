package class23;

public class DataBaseTester {
    public static void main(String[] args) {
        DataBase database = new Oracle();
        database.opeDatabase();
        database.readData();
        database.writeData();
        database.closeDatabase();
    }
}



