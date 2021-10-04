package com.Helperreader.com;

public class FileReaderManager {	
	private FileReaderManager() {}	
	
	public static FileReaderManager getInstanceFR() {
		FileReaderManager fr = new FileReaderManager();
		return fr;	}	
	public Config_Reader getInstanceCR() throws Throwable {
		Config_Reader cr = new Config_Reader();
		return cr;	}

}
