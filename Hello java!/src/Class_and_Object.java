
public class Class_and_Object {
	
	public class Book {
		
		boolean Borrowed;
		boolean Returned;
		
		Book(){Borrowed = false;
		 Returned = true;}
		Book(boolean state) {
			Borrowed = state;
			if(state == true) {
				Returned = false;
				Borrowed = true;
			}
			else {
				Returned = true;
				Borrowed = false;
			}						
		}
	}
	
	public class Library {
		
		Book[] arr = new Book[10];
		
		void borrowBook(int n) {
			if(arr[n].Borrowed == true) {
				System.out.println("error");
			}
			else {
				arr[n].Borrowed = true;
				arr[n].Returned = false;	
			}
		}
		void returnBook(int n) {
			if(arr[n].Returned == true) {
				System.out.println("error");
			}
			else {
				arr[n].Borrowed = false;
				arr[n].Returned = true;	
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
