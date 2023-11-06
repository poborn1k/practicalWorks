package pw19;

import java.io.*;
import java.util.ArrayList;

public class Directory {
    public static void main(String[] args) throws IOException {
        String path1 = "src\\pw19\\Files";
        String path2 = "src\\pw19\\NoFiles";

        File file = new File(path1);

        if (file.list().length != 0) {
            ArrayList<String> list = toList(file.list());

            int count = 0;
            for (String tmp : list) {
                if (count == 5) {
                    break;
                }
                System.out.println(tmp);
                ++count;
            }
        } else {
            System.out.println("There are no files in the directory");
        }
    }

    public static <T> ArrayList<T> toList(T[] array) {
        ArrayList<T> list = new ArrayList<>();

        for (T element : array) {
            list.add(element);
        }

        return list;
    }
}
