package file;

public class FileExporterFactory {
    public FileExporter createFileExporter(FileExporterType type){
        switch (type){
            case PDF: return new PdfFileExporter();
            case EXCEL: return new ExcelFileExporter();
            default: throw new IllegalArgumentException("Invalid file exporter type");
        }
    }
}
