package AdminTests;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Helper.Base;
import POM.AddNewCatagoryPage;
import Utility.utility;

public class AddNewCatagoryTests extends Base{
	public String sheetname = "sheetname";
	
  @Test
  public void verifyAddNewCatagory() throws IOException, InterruptedException {
	  
	  utility util = new utility();
	  util.adminLogin((this.getData(this.getProperty(this.sheetname), 1, 0)), (this.getData(this.getProperty(this.sheetname), 1, 1)));
      

      AddNewCatagoryPage addNewCatagoryPage = PageFactory.initElements(driver, AddNewCatagoryPage.class);

	  addNewCatagoryPage.clickCatalogIcon();
      addNewCatagoryPage.clickCategoriesOption();
      addNewCatagoryPage.clickAddNewButton();
      
      addNewCatagoryPage.fillProductName("Apple Iphone 15 Pro Max");
    
      addNewCatagoryPage.switchToFullDescriptionFrame();
      
      addNewCatagoryPage.fillFullDescription("The iPhone 15 Pro Max epitomizes Apple's smartphone prowess, boasting a sleek design housing a larger OLED display with potential enhancements in resolution and refresh rate."
    		  + " Anticipate a revamped camera system delivering superior low-light performance, improved zoom capabilities, and sharper imaging, supported by Apple's latest chipset promising unparalleled speed and efficiency. "
    		  + "Battery life might see upgrades, complementing faster 5G connectivity and advanced Wi-Fi technology. Running on the latest iOS, the phone could introduce new features while refining security and productivity, "
    		  + "potentially integrating further advancements in augmented reality (AR) capabilities.");
      addNewCatagoryPage.switchToDefaultContent();
      
      addNewCatagoryPage.clickCategoryElement();
      addNewCatagoryPage.clickAddElement();

      
      String filePath = "C:\\Users\\Thavasi\\eclipse-workspace\\Nop-Commerce_Automation_Project\\src\\main\\resources\\TestData\\iphn 15 Pro Max.jpg";
      addNewCatagoryPage.uploadFile(filePath);
      
  }

}

