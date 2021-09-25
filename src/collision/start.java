package collision;

import java.util.ArrayList;

public class start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// hash object and items 
		hashing object  = new hashing(111);
		
		ArrayList<String> adam  = new ArrayList<String>();
		adam.add("Adam");adam.add("123-4567"); adam.add("1");
		object.insertData(adam);
		
		ArrayList<String> charles  = new ArrayList<String>();
		charles.add("Charles");
		charles.add("987-1122");
		charles.add("2");
		object.insertData(charles);
		
		ArrayList<String> patrick  = new ArrayList<String>();
		patrick.add("Patrick");
		patrick.add("757-4532");
		patrick.add("3");
		object.insertData(patrick);
		
		
		ArrayList<String> brenda  = new ArrayList<String>();
		brenda.add("Brenda");
		brenda.add("345-5352");
		brenda.add("4");
		object.insertData(brenda);
		
		ArrayList<String> jeremiah  = new ArrayList<String>();
		jeremiah.add("Jeremiah");
		jeremiah.add("789-4563");
		jeremiah.add("5");
		object.insertData(jeremiah);
		
		ArrayList<String> raymond  = new ArrayList<String>();
		raymond.add("Raymond");
		raymond.add("090-9383");
		raymond.add("6");
		object.insertData(raymond);
		
		ArrayList<String> katherine  = new ArrayList<String>();
		katherine.add("Katherine");
		katherine.add("823-1573");
		
		object.insertData(katherine);
		
		ArrayList<String> brendon  = new ArrayList<String>();
		brendon.add("Brendon");
		brendon.add("983-7373");
		object.insertData(brendon);
		
		ArrayList<String> thorsten  = new ArrayList<String>();
		thorsten.add("Thorsten");
		thorsten.add("929-6632");
		object.insertData(thorsten);
		
	
		String draw_line =  "<----- Insert Elements ------->()";
		System.out.println(draw_line);
		
		object.echoItems("123-4567");
		object.echoItems("987-1122");
		object.echoItems("757-4532");
		
		object.echoItems("345-5352");
		object.echoItems("789-4563");
		object.echoItems("090-9383");
		object.echoItems("823-1573");
		object.echoItems("983-7373");
		object.echoItems("929-6632");
		
		
		

	}

}
