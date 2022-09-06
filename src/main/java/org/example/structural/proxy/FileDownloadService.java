package org.example.structural.proxy;

public class FileDownloadService implements Service {
    private final String fileName;

    public FileDownloadService(String fileName) {
        this.fileName = fileName;
        loadFile(fileName);
    }

    @Override
    public void downloadFile() {
        System.out.println("File " + fileName + " is being downloaded;");
    }

    private void loadFile(String fileName) {
        System.out.println("Loading : " + fileName);
    }
}
