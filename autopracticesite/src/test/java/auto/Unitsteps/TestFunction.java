package auto.Unitsteps;

import auto.Methods.UseMethod;

public class TestFunction 
{

	public static void main(String[] args)
	{
	
			
		//browser launching	
		Object [] bl =new Object[1];
		bl[0]="chrome";
		UseMethod.LaunchBrowser(bl);
		
		//get url
		Object [] geturl=new Object[1];
		geturl[0]="http://automationpractice.com/";
		UseMethod.Geturl(geturl);
		
		//click on sign in button
		Object [] click=new Object [1];
		click[0]="//a[normalize-space()='Sign in']";
		UseMethod.Clickit(click);
		
		// enter username
		Object [] un=new Object[2];
		un[0]="//input[@id='email']";
		un[1]="aitscsmcoe@gmail.com";
		UseMethod.Sendkey(un);
		
		// enter password
		Object [] pw=new Object[2];
		pw[0]="//input[@id='passwd']";
		pw[1]="Abhi@123";
		UseMethod.Sendkey(pw);
		
		// click on sign in
		Object [] sgin=new Object[1];
		sgin[0]="//span[normalize-space()='Sign in']";
		UseMethod.Clickit(sgin);
		
		// click on my address
		Object [] adr=new Object[1];
		adr[0] ="//span[normalize-space()='My addresses']";
		UseMethod.Clickit(adr);
		
		// click on add new address
		Object [] newadr=new Object[1];
		newadr[0]="//span[normalize-space()='Add a new address']";
		UseMethod.Clickit(newadr);
		
		// enter name
		Object [] name=new Object[2];
		name[0]="//input[@id='firstname']";
		name[1]="Abhi";
		UseMethod.Sendkey(name);
		
		// enter last name
		Object [] lname=new Object[2];
		lname[0]="//input[@id='lastname']";
		lname[1]="Tarade";
		UseMethod.Sendkey(lname);

		// enter company name 
		Object [] comp=new Object [2];
		comp[0]="//input[@id='company']";
		comp[1]="xyzaa";
		UseMethod.Sendkey(comp);
		
		// enter addres
		Object [] ad= new Object[2];
		ad[0]="//input[@id='address1']";
		ad[1]="Mumbai";
		UseMethod.Sendkey(ad);
		
		// enter city name
		Object [] city=new Object[2];
		city[0]="//input[@id='city']";
		city[1]="MaXO";
		UseMethod.Sendkey(city);
		
		// select state		
		Object [] state =new Object[2];
		state[0]="//select[@id='id_state']";
		state[1]="Florida";
		UseMethod.SelectValue(state);
		
		// enter zip code
		Object []zip=new Object[2];
		zip[1]="33040";
		zip[0]="//input[@id='postcode']";
		UseMethod.Sendkey(zip);
		
		// enter home no
		Object [] hn =new Object[2];
		hn[0]="//input[@id='phone']";
		hn[1]= "9922444444";
		UseMethod.Sendkey(hn);
		
		// enter mob no
		Object [] mn =new Object[2];
		mn[0]="//input[@id='phone_mobile']";
		mn[1]="9922224444";
		UseMethod.Sendkey(mn);
		
		// enter additional info
		Object []adinfo = new Object[2];
		adinfo[0]="//textarea[@id='other']";
		adinfo[1]="Good";
		UseMethod.Sendkey(adinfo);
		
		// enter address title
		Object [] at=new Object [2]	;
		at[0]="//input[@id='alias']";
		at[1]="Demo";
		UseMethod.Sendkey(at);
		
		// click on save
		Object [] sv=new Object[1];
		sv[0]="//span[normalize-space()='Save']";
		UseMethod.Clickit(sv);
		

	}
}
