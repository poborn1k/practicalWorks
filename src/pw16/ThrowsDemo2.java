package pw16;

import java.util.Scanner;

public class ThrowsDemo2 {
    public void getKey() throws Exception {
        //Scanner myScanner = new Scanner( System.in );
        //String key = myScanner.next();
        String key = "";
        try {
            printDetails(key);
        } catch (Exception e) {
            throw e;
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if(key == "") {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}
