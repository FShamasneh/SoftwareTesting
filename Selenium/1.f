 String tagName = "";
        
        driver.get(baseUrl);
//        WebElement myElement = driver.findElement(By.id("email"));
//        myElement.sendKeys("06702183673");
//        WebElement myElement_2 = driver.findElement(By.id("pass"));
//        myElement_2.sendKeys("ferassfuu1`");
        
//        WebElement myElement_3 = driver.findElement(By.id("vfb-6-1"));
//        for (int i=0;i<2;i++) {
//        	myElement_3.click();
//        	System.out.println(myElement_3.isSelected());
//        }
 
        Select drpCountry = new Select(driver.findElement(By.name("country")));
        drpCountry.selectByVisibleText("ANTARCTICA");
        System.out.println(" --> "+drpCountry.getAllSelectedOptions().toString());
        
        
//        WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
//        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
//        radio1.click();
//        radio2.click();
        
//        driver.findElement(By.id("loginbutton")).click();
//        
//        WebElement myElement_3 = driver.findElement(By.id("placeholder-6b8tk"));
//        myElement_3.sendKeys("This is a test");
        
//        tagName = driver.findElement(By.linkText("Surname")).getTagName();
//        System.out.println(tagName);
        driver.close();
        System.exit(0);