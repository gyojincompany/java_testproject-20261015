package exer;

import java.util.ArrayList;

public class MainClass {
	
	public static void main(String[] args) {
	
		ArrayList<Member> members = new ArrayList<Member>();
		
		members.add(new GeneralMember("홍길동"));
		members.add(new GeneralMember("김철수"));
		
		for (Member member : members) {
		    member.introduce();
		    member.useService();
		}
	
	}

}
