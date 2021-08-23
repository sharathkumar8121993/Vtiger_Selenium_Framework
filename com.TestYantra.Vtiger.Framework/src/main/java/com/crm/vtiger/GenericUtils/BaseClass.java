public class Flipkart{
	@Test
	public void flipkart() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xapth("//input[@type='text']")).SendKey("redmi",KEYS.Enter);

		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1])").click();
		cwh=driver.w;
		Iterator();
	}

	
}



