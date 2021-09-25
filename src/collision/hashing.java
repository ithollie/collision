package collision;

import java.util.ArrayList;

public class hashing {

	ArrayList<String> list;
	String [] arraylist; 
	int arraySize;
	int counter;
	
	public hashing(int size){
		counter = -1;
		if(checkPrime(size)) {
				arraylist = new String[size];
				list = new ArrayList<String>();
				arraySize = size;
				System.out.println(arraySize);
				
				
			}else{
				int primeCount = generatePrime(size);
				this.arraylist = new String[primeCount];
				arraySize = primeCount;
				System.out.println("hash size is prime");
			}
		
		
	}
	
	// print out function 
	public void printOut(String items){
		System.out.println(items);
		
	}
	// generate a prime number
	private int generatePrime(int numItems) {
		// TODO Auto-generated method stub
		for(int i = numItems; true; i++) {
			if(checkPrime(i)) {
				return i;
			}
		}

	}
	//check for prime number 
	private boolean checkPrime(int numItems) {
		//TODO Auto-generated method stub
		for(int i = 2; i*i <= numItems; i++) {
			if(numItems % i == 0) {
				return false;
			}
		}
		return true;
		}
	
	
	public int function1(String value){
		// string hash code function
		int val = value.hashCode();

		if (value.length() > 0) {

		val = val % arraySize;
		if(val < 0) {
		val += arraySize;
		}
		}
		return val;
		}
	// insert method 
	public  void insertData(ArrayList<String> items) {
		int hashcode = function1(items.get(1));
		if(arraylist[hashcode]  ==  null) {
			arraylist[hashcode] = items.get(0) +" "+ items.get(1);
			printOut("successful inserted -->" +  arraylist[hashcode]);
			printOut("index --->" + hashcode);
			
		}
		
				
	}
	
	//Retrieving data
	public void echoItems(String item) {
		int hashcode = function1(item);
		
		System.out.println( arraylist[hashcode]);
	}
	
	
}
