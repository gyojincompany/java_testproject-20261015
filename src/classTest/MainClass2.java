package classTest;

public class MainClass2 {

	public static void main(String[] args) {
		
		//회원 1번
		String mid1 = "tiger";
		String mpw1 = "12345";
		String mname1 = "홍길동";
		int mage1 = 27;
		String memail1 = "hong@abc.com";
		
		//회원 2번
		String mid2 = "lion";
		String mpw2 = "54321";
		String mname2 = "이순신";
		int mage2 = 62;
		String memail2 = "lee@abc.com";
		
		//회원 1번은 생성자를 통해서 초기화
		Member member1 = new Member(mid1, mpw1, mname1, mage1, memail1);
		
		//회원 2번은 setter를 통해서 초기화
		Member member2 = new Member();
		member2.setMemberId(mid2);
		member2.setMemberPw(mpw2);
		member2.setMemberName(mname2);
		member2.setMemberEmail(memail2);
		member2.setMemberAge(mage2);
		
		String pmid1 = member1.getMemberId(); //tiger
		String pmname1 = member1.getMemberName(); //홍길동
		
		String pmid2 = member2.getMemberId(); //lion
		String pmname2 = member2.getMemberName(); //이순신
		
		System.out.println(pmid1);
		System.out.println(pmname1);
		
		System.out.println(pmid2);
		System.out.println(pmname2);

	}

}
