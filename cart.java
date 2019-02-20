package proj3;

import java.util.ArrayList;

public class cart {
	
static int tcount =0;
static int tprice=0;
int i;
public static ArrayList<shopbook> books;

    public cart() {     //constructer
    	books=new ArrayList<shopbook>();

    }

	public static int getcount() {
		return books.size();
	}
	
	public static int getPrice() {
		for(int i= 0;i<books.size();i++) {
			tprice+=books.get(i).price;
		}
		return tprice;
	}
	
	
	

}
