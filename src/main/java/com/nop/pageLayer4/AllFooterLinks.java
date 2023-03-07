package com.nop.pageLayer4;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nop.utilities4.UtilClass4;

public class AllFooterLinks extends UtilClass4 {
	public ArrayList<Integer> links = new ArrayList<>();
public WebDriver driver;
public String urlTxt;
	public AllFooterLinks(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css = ".footer a")
	private List<WebElement> infoLinks;
	
	public ArrayList<Integer> getResponseCode() {
		int rc = 0 ;int i = 0;
		for(WebElement link : infoLinks) {
			
			 urlTxt= link.getAttribute("href");
			
			try {
				URL url  = new URL(urlTxt);
				URLConnection conn = url.openConnection();
				HttpURLConnection http = (HttpURLConnection) conn;
				http.setRequestMethod("GET");
				http.connect();
				rc = http.getResponseCode();
				System.out.println(i+" " +urlTxt +" has the response code ="+rc);
				i++;
				links.add(rc);
				
				
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		return links;
		
	}
	
	
	
	
	

}
