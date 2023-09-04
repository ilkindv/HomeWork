import fileutil.CustomFileReader;
import fileutil.CustomFileReaderImpl;
import fileutil.CustomFileWriter;
import fileutil.CustomFileWriterImpl;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Main {
    CustomFileReader fileReader;
    CustomFileWriter fileWriter;

    Main(){
        fileReader = new CustomFileReaderImpl();
        fileWriter = new CustomFileWriterImpl();
    }
    public static void main(String[] args) throws FileNotFoundException {
        Main main = new Main();
        main.fileWriter.writeWithWriter("file.txt","Test file!");
        main.fileWriter.writeWithOutputStream("file.txt","Test file!");
        main.fileReader.readWithReader("file.txt");
        main.fileReader.readWithInputStream("file.txt");
        byte[] bytes = main.fileReader.readWithByte("file.txt");
        for (byte file:bytes) {
            System.out.print(file);
        }
        PrintWriter printWriter = new PrintWriter("file.txt");
        printWriter.println("Test file!");

        PrintStream printStream = new PrintStream("file.txt");
        printStream.println(("Test file!"));

        main.fileReader.readWithObject("file.out");

    }
}