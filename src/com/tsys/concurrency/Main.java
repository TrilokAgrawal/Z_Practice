package com.tsys.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	
	public static void main(String[] args) {
		FileCreatorDelegate fileCreatorDelegate = new FileCreatorDelegate();
		fileCreatorDelegate.generate();
		
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		executorService.execute(new RunnableImpl(fileCreatorDelegate.getFutureFile1()));
		executorService.execute(new RunnableImpl(fileCreatorDelegate.getFutureFile2()));
		executorService.execute(new RunnableImpl(fileCreatorDelegate.getFutureFile3()));
		executorService.shutdown();
		
		
	}

}
