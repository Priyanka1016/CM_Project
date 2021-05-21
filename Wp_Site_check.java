

String baseUrl = ";
		driver.manage().window().maximize();
		driver.get(baseUrl);
		String stored = driver.getPageSource();
		System.out.println("Homepage");
		System.out.println("----------------------------------");
		String meta = "<meta name=\"generator\" content=\"WordPress 5.4.1\" />";
		String rel_link = "<link rel=\"EditURI\" type=\"application/rsd+xml\" title=\"RSD\" href=\"https://primeanswers.co/xmlrpc.php?rsd\" />";
		String rel_link1 = "<link rel=\"wlwmanifest\" type=\"application/wlwmanifest+xml\" href=\"https://s34121.pcdn.co/wp-includes/wlwmanifest.xml\" />";
		String  contactus_id= "id=\"contact-form-7-css\"";

		String[] Notincode = {meta,rel_link,rel_link1,contactus_id};

		for(String check:Notincode)
		{
		boolean Present = stored.contains(check);

		if(Present == true)
		{
		System.out.println(check+ " --- Text is present in the code");
		}
		}
		String url = driver.getCurrentUrl();
		String newurl = url+"content/contact-us/";
		System.out.println(" ");
		System.out.println("Contact Us Page");
		System.out.println("----------------------------------");
		System.out.println("New_url" +newurl);
		driver.get(newurl);
		String stored2 = driver.getPageSource();
		System.out.println("stored2");
		String[] incode = {contactus_id};

		for(String check:incode)
		{
		boolean Present = stored2.contains(check);

		if(Present == false)
		{
		System.out.println(check+ " --- Text is not present on contact us page");
		}
		}
		String currentURL = null;

		driver.findElement(By.className("wpcf7-form-control wpcf7-submit")).click();
		driver.findElement(By.xpath("//*[@id=\"wpcf7-f381-p1376-o1\"]/form/p[5]/input")).click();
		WebDriverWait wait = new WebDriverWait(driver,90);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type=\"submit\"]")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("//input[@value='Send']")).click();
		currentURL = driver.getCurrentUrl();
		System.out.println("Current Url - " +currentURL);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		String url1 = baseUrl;
		String newurl1 = url1+"/yourname.txt";
		driver.get(newurl1);

		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(2));
		String url2 = baseUrl;
		String newurl2 = url2+"/feed";
		driver.get(newurl2);

		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(3));
		driver.get("https://developers.google.com/speed/pagespeed/insights/");
		WebElement enter = driver.findElement(By.xpath("//*[@id=\"page-speed-insights\"]/div[1]/form/div/input"));
		enter.sendKeys(baseUrl);
		driver.findElement(By.xpath("//*[@id=\"page-speed-insights\"]/div[1]/form/div/div/div")).click();
		System.out.println(" ");
		System.out.println("Pagespeed");
		System.out.println("----------------------------------");
		Thread.sleep(60000);
		String speed = driver.findElement(By.xpath("//*[@id=\"page-speed-insights\"]/div[2]/div[3]/div[2]/div[1]/div[1]/div/div[1]/a/div[2]")).getText();
		System.out.println("Mobile: "+speed);
		driver.findElement(By.xpath("//*[@id=\":8\"]/div/div")).click();
		String speed1 = driver.findElement(By.xpath("//*[@id=\"page-speed-insights\"]/div[2]/div[3]/div[2]/div[2]/div[1]/div/div[1]/a/div[2]")).getText();
		System.out.println("Desktop: "+speed1);
		System.out.println(" ");

		driver.get("https://www.cdnplanet.com/tools/cdnfinder/");
		WebElement myelement  = driver.findElement(By.xpath("//*[@id=\"tool-form-main\"]"));
		myelement.sendKeys(baseUrl);
		driver.findElement(By.xpath("//*[@id=\"tool-form\"]/button")).click();

		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs3.get(4));
		driver.get("http://www.advancesimple.com/clever-diy-curtain-swaps-to-save-money/");
		Thread.sleep(3000);
		System.out.println("Article Page");
		System.out.println("--------------------");
		if(driver.getCurrentUrl().startsWith("https"))
		System.out.println("SUCCESS---URl has secure HTTPS connection.");
		else
		System.out.println("Failure---no secure connection");

		System.out.println("");

		LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
		for (LogEntry entry : logEntries) {
		System.out.println(entry);

		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs4 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs4.get(5));
		driver.get(baseUrl);
		String url3 = driver.getCurrentUrl();
		String newurl3 = url3+"wp-content/uploads/";
		driver.get(newurl3);
		String status = driver.findElement(By.xpath("/html/body/h1")).getText();
		System.out.println("wp-content/uploads Status: "+status);

		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs5 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs5.get(6));
		driver.get(baseUrl);
		String url4 = driver.getCurrentUrl();
		String newurl4 = url4+"/wp-includes/";
		driver.get(newurl4);
		String status1 = driver.findElement(By.xpath("/html/body/h1")).getText();
		System.out.println("wp-includes Status: "+status1);

		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs6 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs6.get(7));
		driver.get(baseUrl);
		String url5 = driver.getCurrentUrl();
		String newurl5 = url5+"/xmlrpc.php";
		driver.get(newurl5);
		String status2 = driver.findElement(By.xpath("/html/body/h1")).getText();
		System.out.println("/xmlrpc.php Status: "+status2);




		}}