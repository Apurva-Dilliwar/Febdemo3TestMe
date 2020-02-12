package hdc2demos;

import org.testng.annotations.Test;

public class dependsDemotestng {
  @Test (priority =2, dependsOnMethods="s" )
  public void flipkart() {
	  System.out.println("code for the login of the flipkart");
  }
  @Test
  public void s() {
	  int a=10;
	  int b=0;
	  int c= a/b;
	  System.out.println("c :"+c);
  }
  @Test(priority =1)
  public void flipkartreg() {
	  System.out.println("code for the registeration of the flipkart");
  }
}
