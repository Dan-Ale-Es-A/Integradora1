package model;

import java.util.ArrayList;

public class PersonalData {

private static ArrayList<String>personal=new ArrayList<>();

    
	public static void addPersonalID() {
		personal.add("123456");
	}
	public static ArrayList<String>getData(){
		return personal;
	}
	public static boolean searchID(String id) {
		boolean flag=false;
		for(int i=0;i<personal.size()&&!flag;i++) {
			if(personal.get(i).equals(id)) {
				flag=true;
			}
		}
		return flag;
	}
	
}
