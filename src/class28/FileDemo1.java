package class28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        right-click on your file and click copypathreference then click from content root  */

        String path= "Data/config.properties";//location of the file
        var fileInputStream=new FileInputStream(path);//it helps us navigate to the file
        var properties= new Properties();//that special software that helps us read the data from that file
        properties.load(fileInputStream);//loads all the data from the file inside(memory).
        System.out.println(properties.getProperty("URL"));
        System.out.println(properties.getProperty("password"));
        fileInputStream.close();//closing the file
    }
}
