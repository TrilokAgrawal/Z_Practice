package com.tsys.concurrency;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * Implementation of AbstractCallable
 * @author trilok
 *
 */
public class FileCreator extends AbstractCallable<File> {
	
	/*
	 * File, which will get generated.
	 */
	private File file;
	
	/*
	 * pojo corresponding to the table
	 */
	private Table table;
	
	/*
	 * name for the file. Its good to add time stamp as post fix with the file name.
	 */
	private String fileName;
	
	/**
	 * Minimum constructor.
	 * @param table
	 */
	public FileCreator(Table table) {
		this.table = table;
	}
	
	/**
	 * Full Constructor
	 * @param table
	 * @param fileName
	 */
	public FileCreator(Table table, String fileName) {
		this(table);
		this.fileName = fileName;
	}

	@Override
	public File call() throws Exception {
		/*
		 * put null check for file name and the existence 
		 * of the file with the given name, add timestamp with the file name if required.
		 * If file not exist, create a new one or throw exception, 
		 * depends on your requirement. 
		 */
		file = new File(fileName);
		
		Object data = getData();
		
		/*
		 * write this data into file here. 
		 */
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		writer.write((String)data);
		
		/*
		 * finally return generated file. Cheers!
		 */
		return file;
	}

	@Override
	public Object getData() throws Exception {
		
		/*
		 * generate a service layer call from this method to get the data from table.
		 * 
		 */
		return new Object();
	}
	
	

}
