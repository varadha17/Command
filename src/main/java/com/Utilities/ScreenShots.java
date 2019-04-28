package com.Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Base.Base;

public class ScreenShots extends Base{

	public ScreenShots() throws Exception {
		super();
		
	}
	
	public void ScreenShotTest(String MethodNameVerify) throws IOException {
		
		Date d1 = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MMM_yyyy");
		
		String str = sdf.format(d1);
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(f, new File("C:\\Users\\name\\eclipse-workspace\\Cucumber\\ScreenShot\\"+str+"\\"+MethodNameVerify+".jpg"));

		
	}

}
