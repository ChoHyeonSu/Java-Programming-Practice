//2019314901 Á¶Çö¼ö

import java.util.Scanner;
 
public class Number_System_Converter {
 public static void main(String[] args) {
	 
  int num,mem1,mem2;
  Scanner scn = new Scanner(System.in);
  num = scn.nextInt();
  scn.close();
  mem1 = num;
  mem2 = num;
  int []b = new int[16];
  int i = 0;
  
  System.out.print("b ");
  
  while(mem1 != 1)
  {
   b[i++] = mem1%2;
   mem1 = mem1/2;
  }
  b[i] = mem1;
   
  for(int j = i; j >= 0; --j)
  {
   System.out.print(b[j]);
  }
  System.out.println("");
  
  String octalString = Integer.toOctalString(mem2);
  String hexString = Integer.toHexString(num);
  
  System.out.print("o ");
  System.out.println(octalString);
  System.out.print("h ");
  System.out.println(hexString);
 }
}