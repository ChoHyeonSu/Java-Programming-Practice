package reTEST;
public class SimpleCalculator {
	
	class OutOfRangeException extends Exception{
		String message;
		public OutOfRangeException(String message) {
			this.message = message;
		}
		String getmessage(String message) {
			return message;
		}
		
	}
	class AddZeroException extends Exception{
		String message;
		public AddZeroException(String message) {
			this.message = message;
		}
		String getmessage(String message) {
			return message;
		}
	}
	class SubtractZeroException extends Exception{
		String message;
		public SubtractZeroException(String message) {
			this.message = message;
		}
		String getmessage(String message) {
			return message;
		}
	}
	
	int result;
	
	void add(int a, int b) throws AddZeroException {
		if(a == 0 || b == 0) 
			throw new AddZeroException("AddZeroException");		
		else
			result = a + b;
	}
	void subtract(int a, int b) throws SubtractZeroException{
		if(a == 0 || b == 0) 
			throw new SubtractZeroException("SubtractZeroException");		
		else
			result = a - b;
	}
	void print() throws OutOfRangeException {
		if(result > 1000 || result < 0)
			throw new OutOfRangeException("OutOfRangeException");
		else		
			System.out.println(result);
	}
	
	void reset() {
		result = 0;
	}
	int getResult() {
		return result;
	}
	void setResult(int a) {
		result = a;
	}
	
	public static void main(String[] args) {
	
		SimpleCalculator m = new SimpleCalculator();
		int a = 100;
		int b = 30;
		int c = 100;
		int d = 0;
		int g = 1000;
		int f = 1000;
		try {
			m.add(a,b);
			m.print();
			m.add(c,d);
			m.print();
		}catch(OutOfRangeException e) {
			System.out.println(e.getmessage("Error! OutOfRangeException"));
		}catch(AddZeroException e) {
			System.out.println(e.getmessage("Error! AddZeroException"));
		}
		
		try {
			m.subtract(a,b);
			m.print();
			m.subtract(c,d);
			m.print();
		}catch(OutOfRangeException e) {
			System.out.println(e.getmessage("Error! OutOfRangeException"));
		}catch(SubtractZeroException e) {
			System.out.println(e.getmessage("Error! SubtractZeroException"));
		}
		
		
		try {
			m.add(g,f);
			m.print();
		}catch(OutOfRangeException e) {
			System.out.println(e.getmessage("Error! OutOfRangeException"));
		}catch(AddZeroException e) {
			System.out.println(e.getmessage("Error! AddZeroException"));
		}
	}
}




		
	
	
