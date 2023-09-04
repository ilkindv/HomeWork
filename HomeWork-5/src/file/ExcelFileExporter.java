package file;

public class ExcelFileExporter implements FileExporter {
    @Override
    public String fileGenerator(String message) {
        return "Excel {" + message + "}" + ".xlsx";
    }
}
