package hometask.one;

import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileComparator {
	public static boolean compareFiles(File file1, File file2) {
		try (InputStream is1 = new FileInputStream(file1); InputStream is2 = new FileInputStream(file2)) {
			byte[] file1Bytes = is1.readAllBytes();
			byte[] file2Bytes = is2.readAllBytes();
			for (int i = 0; i < file1Bytes.length; i++) {
				if (file1Bytes[i] != file2Bytes[i]) {
					return false;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}
}
