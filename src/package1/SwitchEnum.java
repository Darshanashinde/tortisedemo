package package1;

public class SwitchEnum {
	
	public enum month{Jan,Feb,Mar,Apr,May,June,July,Aug,Sep,Oct,Nov,Dec}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		month[]monthNow=month.values();
		
		
		
		for (month Now: monthNow)
		{
			switch(Now)
			{
			
			case Jan:
				
				System.out.println("Januray is a winter month in India");
				
				break;
				
			case Feb:
				
				System.out.println("Februry is summer month in India");
			
			break;
			
			case Mar:
				
				System.out.println("March is a summer month in India");
			
			break;
			
			case Apr:
				
				System.out.println("April is a summer month in India");
			
			break;
			
			
			case May:
				
				System.out.println("May is a summer month in India");
			
			break;
			
            case June:
				
				System.out.println("June is not a summer month in India");
			
			break;
			
			
           case July:
				
				System.out.println("July is not a summer month in India");
			
			break;
			
          case Aug:
	
	           System.out.println(" August is not a summer month in India");

           break;

			
			default:
				System.out.println(" sep,oct,nov and dec it's not a summer month");
				
				break;
				
			
			}
			
			
			
			
			
		}
		
		
	}

}
