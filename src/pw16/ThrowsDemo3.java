package pw16;

public class ThrowsDemo3 {
    public void getKey() {
        String key = "";
        try {
            printDetails(key);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key == "") {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}
