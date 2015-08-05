package test.tmp;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class TmpSuiteListener implements ISuiteListener {
	  public static boolean start = false;

	  public static boolean finish = false;



	  @Override

	  public void onFinish(ISuite suite) {

	    System.out.println("Finishing");

	  }



	  @Override

	  public void onStart(ISuite suite) {

	    System.out.println("Starting");

	  }



	}