package com.greatlearning.forkjoin;

import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
    	if(args.length < 1) {
    		System.out.println("provide url in arguments");
    		return;
    	}
        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
        UrlConnectionReader urlConnectionReader = new UrlConnectionReader(args);
        String result = forkJoinPool.invoke(urlConnectionReader);
        // printing the result received after the process of Task
        System.out.println("Result : "+ result);
    };
}
