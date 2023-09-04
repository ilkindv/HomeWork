package fileutil;

public interface CustomFileWriter {
    void writeWithWriter(String filePath,String data);
    void writeWithOutputStream(String filePath,String data);
    void writeWithObject(String filePath);
}
