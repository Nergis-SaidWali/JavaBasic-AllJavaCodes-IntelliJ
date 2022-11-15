package ConstructorsTasks;

public class Phone {
    private String make;
    private String model;
    private String color;
    private int storage;
    double size;

    public Phone(String newMake, String newModel, String newColor, int newStorage) {
        make=newMake;
        model=newModel;
        color=newColor;
        storage=newStorage;
    }

    public Phone() {

    }
        void printInfo() {
            System.out.println(make+" "+ model+" "+color+" "+storage);

    }


}
