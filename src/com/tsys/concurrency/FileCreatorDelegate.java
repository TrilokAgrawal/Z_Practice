package com.tsys.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.io.File;
/**
 * 
 * @author trilok
 *
 */
public class FileCreatorDelegate {

	private static final ExecutorService executors = Executors.newFixedThreadPool(3);
	/*
	 * specify according to the number of threads generating files.
	 */
	private Future<File> futureFile1;
	private Future<File> futureFile2;
	private Future<File> futureFile3;
	
	/**
	 * this method kicking off the the file generating threads in executor.
	 * Java concurrency executor framework gives us an opportunity to 
	 * create a latch for a thread.
	 */
	public void generate() {
		try {
			futureFile1 = executors.submit(new FileCreator(new Table1()));
			futureFile2 = executors.submit(new FileCreator(new Table2()));
			futureFile3 = executors.submit(new FileCreator(new Table3()));
			executors.shutdown();
		} catch (Exception e) {
			e.printStackTrace();
			/*
			 * in case of any exception, shutdown executor as well.
			 */
			executors.shutdown();
		}
	}

	public Future<File> getFutureFile1() {
		return futureFile1;
	}

	public Future<File> getFutureFile2() {
		return futureFile2;
	}

	public Future<File> getFutureFile3() {
		return futureFile3;
	}
	
}
