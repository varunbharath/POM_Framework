package reusabile_methods;

import java.util.Locale;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import browser_setup.Browser_setup;

public class Reusable_class extends Browser_setup{
	
	Actions act=new Actions(driver);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	Random ran=new Random();
	//Locale loca=new Locale("youtube","google");
	

}
