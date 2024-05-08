package SimpleFile;

import java.util.Scanner;

public class FileDownloaderMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the file path which you need to download ");
        String fileURL = sc.nextLine();

        System.out.println(" Enter the System Path in which you have to download a file ");
        String filePath = sc.nextLine();

        FileDownload downloader = new FileDownload(fileURL, filePath);
        downloader.start();

        try {
            Thread.sleep(9000);
            downloader.stopDownload();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
