package OOP;

import java.io.*;
import java.util.Scanner;

public class FileOperations {

    public static void createFile() {
        try {
            File file = new File("mid-term-exam.txt");
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
    }

    public static void writeData() {
        try {
            FileWriter writer = new FileWriter("mid-term-exam.txt", true);
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter data to write (type 'exit' to stop):");
            String input;
            do {
                input = scanner.nextLine();
                if (!input.equalsIgnoreCase("exit")) {
                    writer.write(input + "\n");
                }
            } while (!input.equalsIgnoreCase("exit"));
            scanner.close();
            writer.close();
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing data: " + e.getMessage());
        }
    }

    public static void readData() {
        try {
            FileReader reader = new FileReader("mid-term-exam.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            int lines = 0;
            int words = 0;

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines++;
                words += line.split("\\s+").length;
            }

            reader.close();

            if (lines == 0) {
                System.out.println("File is empty.");
            } else {
                System.out.println("Total lines: " + lines);
                System.out.println("Total words: " + words);
            }
        } catch (IOException e) {
            System.out.println("Error reading data: " + e.getMessage());
        }
    }

    public static void deleteFile() {
        File file = new File("mid-term-exam.txt");
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("File does not exist.");
        }
    }

    public static long getFileSize() {
        File file = new File("mid-term-exam.txt");
        if (file.exists()) {
            long fileSizeInBytes = file.length();
            long fileSizeInKB = fileSizeInBytes / 1024;
            return fileSizeInKB;
        } else {
            return -1; // Return -1 if the file doesn't exist
        }
    }

    public static void main(String[] args) {
        createFile();
        writeData();
        readData();
        deleteFile();
        long fileSize = getFileSize();
        if (fileSize != -1) {
            System.out.println("File size: " + fileSize + " KB");
        } else {
            System.out.println("File does not exist.");
        }
    }
}
