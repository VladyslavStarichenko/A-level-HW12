package ua.com.alevel;

import java.io.*;


public class Demo {
    public static String read(String path) {
        StringBuilder stringBuilder;
        stringBuilder = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            String currentString;
            while ((currentString = reader.readLine()) != null) {
                stringBuilder.append(currentString);
                stringBuilder.append(" \n ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException " + e.getMessage());
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        File testFile = new File("C:\\test1.txt");
        // Once we have changed the name of ours file or  the directory we get the Exception.
        try {
            System.out.println(read("C:\\test1.txt"));
        } finally {
            if (testFile.exists()) {
                System.out.println("Program implements correctly, we have file to work with.");
            } else if (!testFile.exists()) {
                System.out.println("There is no file to work with.");
            }
        }
    }
}
