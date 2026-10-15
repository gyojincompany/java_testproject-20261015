package exer;

public class GeneralMember extends Member implements PointUser{
	
	GeneralMember(String name) {
        super(name);
    }
    @Override
    void useService() {
        System.out.println(name + " : 일반 서비스를 이용합니다.");
    }
    @Override
    public void usePoint() {
        System.out.println(name + " : 포인트를 사용합니다.");
    }    
	
}
