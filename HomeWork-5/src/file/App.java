package file;

public class App {
    public static void main(String[] args) {
        FileExporterFactory  exporterFactory = new FileExporterFactory();
        FileExporter exporter = exporterFactory.createFileExporter(FileExporterType.PDF);
        System.out.println(exporter.fileGenerator("new File"));
    }
}
