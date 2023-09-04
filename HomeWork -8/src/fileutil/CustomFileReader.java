package fileutil;

public interface CustomFileReader {
    void readWithReader(String filePath);
    void readWithInputStream(String filePath);
    byte[] readWithByte(String filePath);
    Employee[] readWithObject(String filePath);
}
