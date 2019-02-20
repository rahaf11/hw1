package proj3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;



import org.junit.Test;


//@SuppressWarnings("deprecation")
public class TC {
	
	private static cart ob=new cart();
	
	
	/*
	private void setUpBeforeAll() {
		ob=new cart();
	}
	*/
	//ArrayList<cart> books=new ArrayList<cart>();
	
	@Test
	public void test1() {
		//cart ob=new cart();
		int expected= 0;
		int act =cart.getcount();
		assertTrue(act==expected);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void test2(){
		//cart ob2=new cart();
		//ob.count=1;
		//ob.price=127;
		shopbook b=new shopbook("java",127,1);
		cart.books.add(b);
		double expectedCount=1;
		double expectedPrice=127;
		double actualCount=cart.getcount();
		double actualPrice=cart.getPrice();
	    assertEquals(actualPrice,expectedPrice);
		assertEquals(actualCount,expectedCount);
	}
	
	
	
	
	
	@Test
	public void test3() {
		//cart ob3=new cart();
	    //ob3.count=1;
		//ob3.price=127;

		shopbook b1=new shopbook("java",127,1);
		shopbook b2=new shopbook("web design",100,1);
		cart.books.add(b1);
		cart.books.add(b2);
		double expectedCount=2;
		double expectedPrice=227;
		double actualCount=cart.getcount() ;
		double actualPrice=cart.getPrice();
		assertEquals( actualPrice,expectedPrice);
		assertEquals(actualCount,expectedCount);
		

	}

}
