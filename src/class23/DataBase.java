package class23;

public abstract class DataBase {
    abstract void opeDatabase();
    abstract void readData();
    abstract void writeData();
    abstract void closeDatabase();
}
class MicrosoftDataBase extends DataBase{

    @Override
    void opeDatabase() {
        System.out.println("Opening the Microsoft Database");
    }

    @Override
    void readData() {
        System.out.println("Reading the data from MSDatabase");
    }

    @Override
    void writeData() {
        System.out.println("Writing the data to MSDataBase");
    }

    @Override
    void closeDatabase() {
        System.out.println("Closing the MSDatabase");
    }
}
class Oracle extends DataBase{

    @Override
    void opeDatabase() {
        System.out.println("Opening the Oracle database");
    }

    @Override
    void readData() {
        System.out.println("Reading the data from Oracle database");
    }

    @Override
    void writeData() {
        System.out.println("Writing the data to Oracle Database");
    }

    @Override
    void closeDatabase() {
        System.out.println("Closing the Oracle database");
    }
}

