package assignment2;

//public class Enummonth {

	import java.util.EnumSet;

	
	public class Enummonth {

		enum month{
		Jan,Feb,Mar,Apr,May,June,July,Aug,Sep,Oct,Nov,Dec
		}
		public static void main(String[] args)
		{
		EnumSet<month> months = EnumSet.allOf(month.class);
		
		System.out.println(months);
		
		
		
		int month = 4;
		
	    String season;
	 
	    if(month == 3 || month == 4 || month == 5) { 
	      season = "It's a Summer month ";
	    }else { 
	    	
	      season = "It's not a Summer month ";
	    } 
	    
	    System.out.println(season);
			
		}

			
		}

		
		
		
	