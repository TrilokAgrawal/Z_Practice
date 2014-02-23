package com.tsys.concurrency;

import java.io.File;
import java.util.concurrent.Future;


/**
 * This runnable for uploading.
 * @author trilok
 *
 */
public class RunnableImpl implements Runnable {
	
	private Future<File> future;
	
	public RunnableImpl(Future<File> future) {
		this.future = future;
	}
	@Override
	public void run() {
		File file = null;
		try {
			file = future.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(file.getName() + " file is ready to upload.. ");
		
	}

}
