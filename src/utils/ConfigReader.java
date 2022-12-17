package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties read (String path) {

        FileInputStream fileInputStream=null;
        Properties properties=null;
        try {
            fileInputStream = new FileInputStream(path); //it helps us Navigate to the file
            properties = new Properties(); // that special software which helps us read data from that file
            properties.load(fileInputStream); //loads all the data from the file inside(Memory)
        }catch(IOException e){
            e.printStackTrace();
        }
        return properties;


    }
}
