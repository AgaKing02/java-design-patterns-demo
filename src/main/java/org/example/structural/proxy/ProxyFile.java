package org.example.structural.proxy;

public class ProxyFile implements Service {
    private String fileName;
    private FileDownloadService service;

    public ProxyFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void downloadFile() {
        System.out.println("Checking the access to the resource");
        System.out.println("Access granted!!!");
        if (service == null) {
            service = new FileDownloadService(fileName);
        }
        service.downloadFile();
    }
}
