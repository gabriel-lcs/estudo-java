package application;

import java.io.File;
import java.util.Scanner;

public class Pasta {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String srtPath = scanner.nextLine();

        File path = new File(srtPath);

        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("FOLDERS: ");

        for (File folder : folders){
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);

        System.out.println("FILES: ");

        for (File file : files){
            System.out.println(file);
        }

        boolean success = new File(srtPath + "/subdir").mkdir();

        System.out.println("Directory created successfully : " + success);

        scanner.close();
    }
}
