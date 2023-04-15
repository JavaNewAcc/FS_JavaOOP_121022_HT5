package hometask.one;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		File startFolder = new File(".");
		File endFolder = new File(".\\copy");
		endFolder.mkdirs();

		File fileToCompare1 = new File(".\\1.jpg");
		File fileToCompare2 = new File(".\\copy\\3.jpg");

		try {
			System.out.println(FileService.copyFileToFolder(startFolder, endFolder, "jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (FileComparator.compareFiles(fileToCompare1, fileToCompare2)) {
			System.out.println("Файли ідентичні");
		} else {
			System.out.println("Файли не ідентичні");
		}
		;
	}

}
