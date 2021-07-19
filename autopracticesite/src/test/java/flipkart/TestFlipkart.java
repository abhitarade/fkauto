package flipkart;

import auto.Methods.UseMethod;

public class TestFlipkart {

	public static void main(String[] args) throws InterruptedException 
	{
		
		//browser launching	
				Object [] bl =new Object[1];
				bl[0]="chrome";
				UseMethod.LaunchBrowser(bl);
				
		//get url
				Object [] geturl=new Object[1];
				geturl[0]="https://www.flipkart.com/";
				UseMethod.Geturl(geturl);
		
		// dismiss initial login window
				Object []dis =new Object[1];
				dis[0]="//button[contains(text(),'✕')]";
				UseMethod.Clickit(dis);
				
		// move to login button
				Object [] mtl=new Object[1];
				mtl[0]="//a[normalize-space()='Login']";
				UseMethod.MouseOn(mtl);
		
		// click on my profile
				Object [] mp =new Object[1];
				mp[0]="//div[normalize-space()='My Profile']";
				UseMethod.Clickit(mp);
		
		// send username and password
				Object [] in=new Object[4];
				in[0]="//input[@class='_2IX_2- VJZDxU']";
				in[1]="9922963325";
				in[2]="//input[@type='password']";
				in[3]="Abhi@123";
				UseMethod.Sendkey(in);
				
		// click login
				Object [] ln =new Object[1];
				ln[0]="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']";
				UseMethod.Clickit(ln);
				
		// click on manage address
				Object [] mad=new Object[1];
				mad[0]="//div[normalize-space()='Manage Addresses']";
				UseMethod.Clickit(mad);
				
		// move to edit
				Object [] mte=new Object[1];
				mte[0]="//div[@class='dpjmKp']//img";
				UseMethod.MouseOn(mte);
		
		// click on edit
				Object [] ce=new Object [1];
				ce[0]="(//div[@class='_16FXBY'])[1]";
				UseMethod.Clickit(ce);
	
		// fill address data		
				Object [] fad=new Object[14];
				fad[0]="//input[@name='name']";
				fad[1]="Abhimanu I Tarade";
				fad[2]="//input[@name='phone']";
				fad[3]="9922963325";
				fad[4]="//input[@name='pincode']";
				fad[5]="414105";
				fad[6]="//input[@name='addressLine2']";
				fad[7]="Rahuri";
				fad[8]="//textarea[@name='addressLine1']";
				fad[9]="At post Kendal bk.";
				fad[10]="//input[@name='city']";
				fad[11]="Ahmednagar";
				fad[12]="//input[@name='landmark']";
				fad[13]="Kendal";
				UseMethod.Sendkey(fad);
				
		// click home radio button
				Object [] ch=new Object[1];
				ch[0]="//label[@for='HOME']//div[@class='_1XFPmK']";
				UseMethod.Clickit(ch);
				
		// Click on save button
				Object [] sv=new Object[1];
				sv[0]="//button[normalize-space()='Save']";
				UseMethod.Clickit(sv);
						
		// close driver by waiting some time
				UseMethod.CloseDriver(20000);
	}

}
