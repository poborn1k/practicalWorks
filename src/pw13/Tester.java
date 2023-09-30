package pw13;

import java.io.*;
import java.util.Scanner;

public class Tester {
    private static final String path = "testFile";

    public static void main(String[] args) throws IOException {
        File file = createFile();
        filePrinter(file);

        rewriteFile(file);
        filePrinter(file);

        addText(file);
        filePrinter(file);
    }

    // Реализовать запись в файл введённой с клавиатуры информации
    private static File createFile() throws FileNotFoundException {
        Scanner textToFile = new Scanner(System.in);
        File file = new File(path);
        PrintWriter pw = new PrintWriter(file);
        String text = textToFile.nextLine();
        pw.println(text);
        pw.close();
        return file;
    }

    // Реализовать вывод информации из файла на экран
    private static void filePrinter(File file) throws FileNotFoundException {
        Scanner textFromFile = new Scanner(file);
        while (textFromFile.hasNextLine()) {
            System.out.println(textFromFile.nextLine());
        }
        textFromFile.close();
    }

    // Заменить информацию в файле на информацию, введённую с клавиатуры
    private static void rewriteFile(File file) throws FileNotFoundException {
        Scanner textToFile = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(file);
        String text = textToFile.nextLine();
        pw.println(text);
        pw.close();
    }

    // Добавить в конец исходного файла текст, введённый с клавиатуры
    private static void addText(File file) throws IOException {
        Scanner textToFile = new Scanner(System.in);
        FileWriter write = new FileWriter(file, true);
        String text = textToFile.nextLine();
        write.write(text);
        write.close();
    }
}
