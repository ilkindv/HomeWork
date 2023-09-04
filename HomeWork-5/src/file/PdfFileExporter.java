package file;

public class PdfFileExporter implements FileExporter{
    @Override
    public String fileGenerator(String message) {
        return "Pdf {" + message + "}" + ".pdf";

    }
}
