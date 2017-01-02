package XpathAdvancedLocators;

public class AbsoluteAndRelativeDemo {

	public static void main(String[] args) {
		/*
		 * Difference between single '/' or double '//'
		 * Single slash '/' anywhere in xpath signifies to look for the element immediately inside the parent element
		 * Double slash '//' signifies to look for any child or nested-child element inside the parent element
		 * 
		 * Syntax: //tag[@attribute='value']
		 * Effective Xpath: //a[@href='/sign_in']
		 * 
		 * Syntax: //tab[@attribute='value']//path[text()='specific text']
		 * Text of the element to build xpath: //div[@class='homepage-hero']//a[text()='Enroll now']
		 * 
		 * Syntax: //tag[contains(attribute,'value')]
		 * Xpath using Contains: //div[@id='navbar']//a[contains(text(),'Login')]  --- //div[@id='navbar']//a[contains(@class,'navbar-link') and contains(@href,'sign_in')]
		 * 
		 * Syntax: //tag[starts-with(attribute,'value')]
		 * Using Start-With to find the elements: //div[@id='navbar']//a[starts-with(@class,'navbar-link')]
		 * 
		 * Syntax: xpath-to-some-element//parent::<tag>
		 * Parent
		 * 
		 * Syntax: xpath-to-some-element//preceding-sibling::<tag>
		 * Preceding Sibling
		 * 
		 * Syntax: xpath-to-some-element//following-sibling::<tag>
		 * Following Sibling
		 */

	}

}
