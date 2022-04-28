package TradeCom;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class tradeTransmissionMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		tradeFlow tf=new tradeFlow();
		Date todaysDate=Calendar.getInstance ().getTime ();
		SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
		
		
		
//		Adding Trade T1
		Date maturityDate=sd.parse("10/05/2020");
		Trade t1=new Trade("T1",1,"CP-1","B1",maturityDate, todaysDate, 'N');
		tf.addTrade(t1);
		
		//Adding Trade T2
		maturityDate=sd.parse("20/05/2022");
		Trade t2=new Trade("T2",2,"CP-2","B1",maturityDate, todaysDate, 'N');
		tf.addTrade(t2);
//		tf.printTrade();	
		
		
		//Changing Trade T2
		//Trade t4=new Trade("T2",1,"CP-3","B1",sd.parse("13/03/2015"), sd.parse("14/03/2015"), 'N');
		Trade t4=new Trade("T3",5,"CP-4","B1",maturityDate, todaysDate, 'N');
		tf.addTrade(t4);
		
		// if same version
		maturityDate=sd.parse("20/06/2022");
		Trade t8=new Trade("T2",2,"CP-3","B2",maturityDate, todaysDate, 'N');
		tf.addTrade(t8);
		
		//Display all Trade if version same  
		System.out.println("\n\n");
		System.out.println("Displaying total number of Trade in the list  (if version same)");
		tf.printTrade();
		System.out.println("\n\n");	
		
		
		//Adding Trade T3
		maturityDate=sd.parse("20/05/2022");
		Trade t3=new Trade("T4",5,"CP-3","B2",maturityDate, todaysDate, 'N');
		tf.addTrade(t3);
		
		
		
		
		
		//Display all Trade
		System.out.println("\n\n");
		System.out.println("Displaying total number of Trade in the list");
		tf.printTrade();
		System.out.println("\n\n");	
				
		//Checking for all Expired Flag  (maturity dates change to check automatically update the expire flag  )
		
	    maturityDate=sd.parse("20/06/2021");
		Trade t6=new Trade("T2",2,"CP-3","B1",maturityDate, todaysDate, 'N');
		tf.allTrade.replace("T2", t6);
		
		
	    maturityDate=sd.parse("20/05/2021");
		Trade t7=new Trade("T4",5,"CP-3","B2",maturityDate, todaysDate, 'N');
		tf.allTrade.replace("T4", t7);
		
		
		System.out.println("Checking for Expired Flag");
		tf.checkExpiredDates();
		tf.printTrade();
		
		

	}

}
