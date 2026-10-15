package exer;

public abstract class Member {
	
	String name;
    Member(String name) {
        this.name = name;
    }
    void introduce() {
        System.out.println("회원 이름 : " + name);
    }
    
    abstract void useService();
}
