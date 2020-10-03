package com.scripts.actitime;



import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.actitime.BaseTest;
import com.pages.actitime.pomActitime;

public class TestActitime  extends BaseTest

{

	@ Test
	public void login() throws IOException
	
	{
		pomActitime login =new pomActitime(driver);
				login.enterdetails();
	}
}


