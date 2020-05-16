package reTEST;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class Input {

	public static void main(String[] args)  {
		InputStream fis;
		FileOutputStream fos;
		
		ArrayList arr = new ArrayList();
		try {
			
			fis = new FileInputStream("C:\\Users\\CHO LAB\\java test\\input.txt");			
			fos = new FileOutputStream("C:\\\\Users\\\\CHO LAB\\\\java test\\\\output.txt");

			InputStreamReader isr = new InputStreamReader (fis);
			BufferedReader br = new BufferedReader(isr);
			
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter (osw);

			String data = br.readLine();
			arr.add(data);
			while (data != null) {
				data = br.readLine();
				if(data == null)
					continue;
				arr.add(data);
				}
			Collections.reverse(arr);
						
			for(int i = 0; i < arr.size(); i++) {
				String temp = (String) arr.get(i);
				bw.write(temp);
				bw.write("\n");
			}

			br.close();isr.close();fis.close();
			bw.close();fos.close();osw.close();

		} 
		catch (IOException e) {e.printStackTrace();}
	}
}

