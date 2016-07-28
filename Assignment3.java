/**
 * 
 */
package sdh.java.session8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Sudhish
 * 
 */
public class Assignment3 extends Thread {

	/**
	 * @param args
	 */

	public void run() {
		System.out.println("Running thread name is:"
				+ Thread.currentThread().getName());
		System.out.println("Running thread priority is:"
				+ Thread.currentThread().getPriority());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment3 threadA = new Assignment3();
		Assignment3 threadB = new Assignment3();
		Assignment3 threadC = new Assignment3();
		threadA.setPriority(Thread.MIN_PRIORITY);
		threadB.setPriority(Thread.NORM_PRIORITY);
		threadC.setPriority(Thread.MAX_PRIORITY);
		threadA.start();
		threadB.start();
		threadC.start();
	}
}