package services;

import java.io.File;
import java.util.ArrayList;
import entities.Item;

public interface FileManagementService {
	void createUserGeneratedFile(String fileName, String filePath);
	void createAccountDataFile();
}
