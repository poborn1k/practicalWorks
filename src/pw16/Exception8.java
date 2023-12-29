package pw16;

import java.util.Scanner;

public class Exception8 {
    public void getKey() {
        boolean inputValid = false;
        //Scanner myScanner = new Scanner(System.in);
        String key = "";

        while (!inputValid) {
            //System.out.print("Enter a key: ");
            //String key = myScanner.next();
            try {
                printDetails(key);
                inputValid = true;
            } catch (Exception e) {
                System.out.println("Caught Exception: " + e.getMessage());
                System.out.println("Please try again.");
            }
            key = "984382";
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to an empty string");
        }
        return "Data for " + key;
    }

    public static void main(String[] args) {
        Exception8 demo = new Exception8();
        demo.getKey();
    }
}
