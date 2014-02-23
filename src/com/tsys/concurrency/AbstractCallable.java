package com.tsys.concurrency;

import java.util.concurrent.Callable;


/**
 * This class implements Callable<File> interface.
 * This class will call a service call which, 
 * eventually gets the data from the database and generate a text file.
 * 
 * Constructor of this class can take corresponding pojo	(or the list of) of 
 * the table from which data has to be retrieved, and a string which specifies the 
 * name of the generated file
 * Note: Replace  File with V to make it more generalize. For example,
 * Callable<V> instead of Callable<File> 
 * 
 * @author trilok
 * @param <V>
 *
 */
public abstract class AbstractCallable<V> implements Callable<V> {
	
	public abstract Object getData() throws Exception;

}
