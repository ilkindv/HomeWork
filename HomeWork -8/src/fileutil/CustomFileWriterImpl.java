package fileutil;

import java.io.*;

public class CustomFileWriterImpl implements CustomFileWriter{
    @Override
    public void writeWithWriter(String filePath,String data) {
        File file = new File(filePath);
        try {
            if (!file.exists()){
                file.createNewFile();
                System.out.println("File is Created ... ");
            }
            FileWriter writer = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(data);
            bufferedWriter.close();
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }

    @Override
    public void writeWithOutputStream(String filePath, String data) {
            File file = new File(filePath);
            try(FileOutputStream fileOutputStream = new FileOutputStream(file);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);) {
                if (!file.exists()){
                    file.createNewFile();
                    System.out.println("File is Created ... ");
                }
                bufferedOutputStream.write(data.getBytes());
            }catch (IOException exception){
                exception.printStackTrace();
            }
    }

    @Override
    public void writeWithObject(String filePath) {
        File file = new File(filePath);
        try {
            if (!file.exists()){
                file.createNewFile();
                System.out.println("File is Created ... ");
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            Employee employee = new Employee("Ilkin","Abdullayev",99999.99);
            outputStream.writeObject(employee);
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
