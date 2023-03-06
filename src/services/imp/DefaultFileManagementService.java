package services.imp;

import java.io.File;
import java.io.IOException;

import services.FileManagementService;

public class DefaultFileManagementService implements FileManagementService {
	
	private final String DATAFILEPATH = "..\\price records\\datafiles";
	private static DefaultFileManagementService instance;
	private File dataFile;
	private File dataFileDir;
	private boolean noData;
	
	{
		if (dataFileDir == null) {
			dataFileDir = new File(DATAFILEPATH);
			dataFileDir.mkdir();
		}
	}
	
	public static DefaultFileManagementService getInstance() {
		if (instance == null) {
			instance = new DefaultFileManagementService();
		}
		instance.createAccountDataFile();
		return instance;
	}
	
	private DefaultFileManagementService() {}
	
	@Override
	public void createUserGeneratedFile(String fileName, String filePath) {
		// TODO Auto-generated method stub
		
	}

	public File getDataFile() {
		return dataFile;
	}

	public boolean isNoData() {
		return noData;
	}

	@Override
	public void createAccountDataFile() {
		if (dataFile == null) {
			dataFile = new File(DATAFILEPATH + "\\USERDATA.txt");
		}
		try {
			noData = dataFile.createNewFile();
		}catch(IOException e) {
			System.out.println("IOException occurs: " + e.getMessage());
		}
		
	}


}
