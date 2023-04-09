package hometask.one;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		File startFolder = new File(".");
		File endFolder = new File(".\\copy");
		endFolder.mkdirs();

		try {
			System.out.println(FileService.copyFileToFolder(startFolder, endFolder, "jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
