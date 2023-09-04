package fileutil;

import java.io.*;

public class CustomFileReaderImpl implements CustomFileReader {
    @Override
    public void readWithReader(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("File does not exist!");
            return;
        }
        try {
            FileReader reader = new FileReader(filePath);
            long fileLong;
            String str = "";
            while ((fileLong = reader.read()) != -1) {
                str += (char) fileLong;
            }
            System.out.println(str);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void readWithInputStream(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("File does not exist!");
            return;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            long fileLong;
            String str = "";
            while ((fileLong = fileInputStream.read()) != -1) {
                str += (char) fileLong;
            }
            System.out.println(str);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public byte[] readWithByte(String filePath) {
        File file = new File(filePath);
        byte[] bytes = {};
        if (!file.exists()) {
            System.err.println("File does not exist!");
            return bytes;
        }
        try {
            InputStream inputStream = new FileInputStream(file);
            bytes = inputStream.readAllBytes();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return bytes;
    }

    @Override
    public Employee[] readWithObject(String filePath) {
        File file = new File(filePath);
        Employee[] employees = {};
        if (!file.exists()) {
            System.out.println("File does not exist!");
            return employees;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            employees = (Employee[]) objectInputStream.readObject();
            System.out.println(employees);
        } catch (IOException exception) {
            exception.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return employees;
    }
}