//2019314901 Á¶Çö¼ö


public class StringMethod {
 
	static String addString (String s1, int index, String s2) {
		
		String result, mem1, mem2;
		mem1 = s1.substring(0,index+1);
		mem2 = s1.substring(index+1,s1.length());
		result = mem1 + s2 + mem2;
		
		return result;
	}
	
	static String reverse(String s) {
		
		String result;
		char [] arr = new char[3];
		char [] arr2 = new char[3];
		s.getChars(0,s.length(),arr,0);
		for(int i = 0; i < 3; i++) {
			arr2[i] = arr[2-i];
		}
		result = String.valueOf(arr2);
		
		return result;
	}
	
	static String removeString (String s1, String s2) {
		String result;
		result = s1.replaceAll(s2,"");
		return result;
		
	}


	
	public static void main(String[] args) {
		System.out.println(addString("0123456",3,"-"));
		System.out.println(reverse("abc"));
		System.out.println(removeString("01001000","00"));

		
	}
}