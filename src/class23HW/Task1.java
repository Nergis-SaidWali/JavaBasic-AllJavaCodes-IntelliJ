package class23HW;

public class Task1 {
    //Create a class File that will have the following behaviors: open, edit, close. Edit and close are implemented method while open is an abstract. Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour: Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc
}
    abstract class  File{
    abstract void open();
    void edit(){
        System.out.println("Editing the file");
    }
    void close(){
        System.out.println("Closing the file");
    }
}
class JavaFile extends File{

    @Override
    void open() {
        System.out.println("To open .java file we need notepad++ or sublime text");
    }
}
class WordFile extends File{

    @Override
    void open() {
        System.out.println("to open .doc file we need Microsoft word to be installed");
    }
}
class PdfFile extends File{

    @Override
    void open() {
        System.out.println("To open a PDF file we need to install Adobe Reader");
    }
}
