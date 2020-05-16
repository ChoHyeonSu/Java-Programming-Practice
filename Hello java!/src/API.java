import java.util.*;

public class API {

	public static void main(String[] args) {
	
		HashMap<String, String> map = new HashMap<>();
		Iterator<String> keys = map.keySet().iterator();
			
		while(true) {
			Scanner sc = new Scanner(System.in);
			String sw = sc.next();
			switch(sw) {
			case "show":
				for( String key : map.keySet() ){
		            System.out.println( String.format("%s %s", key, map.get(key)) );
		        }
				break;
			case "find":
				String key2 = sc.next();
				System.out.println(map.get(key2));
				break;
			case "add":
				
				String x = sc.nextLine();
				
				String[] mobNum = x.split(" ");		
				
				String ret0 = mobNum[0];
				String ret1 = mobNum[1];
				String ret2 = mobNum[2];
				
				
				if(map.containsKey(ret1) == true) {
					System.out.println("error");
					break;
				}
				
				if(ret2.equals("")) {
					System.out.println("Error");
					break;
				}
						
				map.put(ret1,ret2);
				break;
			case "delete":
				String k1 = sc.next();
				map.remove(k1);				
				break;		
			}
		
		}
	}

}
