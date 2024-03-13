package testng_Batch;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkinWithDataProvider {
@DataProvider(name="testdata")

public String[][] getData(){
	String [][] data=new String [2][5];
	data[0][0]="swetha";
	data[0][1]="kadigi";
	data[0][2]="abc123";
	data[0][3]="abc123";
	data[0][4]="swetha123@gmail.com";
	
	data[1][0]="swetha";
	data[1][1]="kotla";
	data[1][2]="abc123";
	data[1][3]="abc123";
	data[1][4]="sweth123@gmail.com";
	return data;
	
}
@Test(dataProvider = "testdata")
public void dataDemo(String fn,String ln,String pws,String cnpwd,String emal) {
	
	System.out.println(fn);
	System.out.println(ln);
	System.out.println(pws);
	System.out.println(cnpwd);
	System.out.println(emal);
	
}


}