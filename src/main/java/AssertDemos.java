import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemos {
  @Test(enabled=false)
  public void hardassert() {
	int a=10;
	int b=20;
	int c=10;
	Assert.assertEquals(a, c);//true
	  System.out.println("1st comparission done");
	  Assert.assertEquals(a, b); //false 
	  System.out.println("2nd cmprsn done");
  }
  @Test
  public void softassert() {
	  int a=10;
		int b=20;
		int c=10;
		SoftAssert star=new SoftAssert();
		star.assertEquals(a, c);//true
		  System.out.println("1st comparission done");
		  star.assertEquals(a, b); //false 
		  System.out.println("2nd cmprsn done");
  }
}
