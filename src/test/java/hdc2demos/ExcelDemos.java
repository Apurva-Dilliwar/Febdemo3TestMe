package hdc2demos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ExcelDemos {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  File myfl =new File("C:\\Users\\H2_9_19_User8\\Desktop\\ExcelDemosheet.xlsx");
	  FileInputStream fls=new FileInputStream(myfl);
	  XSSFWorkbook wb= new XSSFWorkbook(fls);
	  XSSFSheet sh=wb.getSheetAt(0);
	  int rws= sh.getLastRowNum();
	  for(int i=1;i<=rws;i++)
	  {
		  String u_name =sh.getRow(i).getCell(0).getStringCellValue();
		  String psswrd =sh.getRow(i).getCell(1).getStringCellValue();
		  System.out.println("username :"+u_name);
		  System.out.println("password :"+psswrd);
		 // String A_txt=driver.findElement(By.xpath("")).getTitle();
		  //String E_txt="Home";
		   //Assert.assertEquals(A_txt,E_txt);
		  sh.getRow(i).createCell(2).setCellValue("Login Success");
		  FileOutputStream fout= new FileOutputStream(new File("C:\\\\Users\\\\H2_9_19_User8\\\\Desktop\\\\ExcelDemosheet.xlsx"));
		  wb.write(fout);
	  }
	  wb.close();
  }
}
