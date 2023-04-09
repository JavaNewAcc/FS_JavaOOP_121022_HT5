package hometask.one;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;

public class FileService {

	public static long copyFile(File fileIn, File fileOut) throws IOException {
		try (InputStream is = new FileInputStream(fileIn); OutputStream os = new FileOutputStream(fileOut)) {
			return is.transferTo(os);
		}
	}

	public static int copyFileToFolder(File folderFrom, File folderTo, String extension) throws IOException {
		int counter = 0;
		File[] fileArr = folderFrom.listFiles();
		for (int i = 0; i < fileArr.length; i++) {
			if (fileArr[i].getName().endsWith(extension)) {
				File file = new File(folderTo, fileArr[i].getName());
				copyFile(fileArr[i], file);
				counter++;
			}
		}
		return counter;
	}
}