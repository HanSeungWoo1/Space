package interfacez;

public class Jetplain extends Plain implements Flyable, Soundable {
	@Override
	public void sound() {
		System.out.println("��Ʈ�� �Ҹ� : �����");
	}
	
	@Override
	public void fly() {
		System.out.println("��Ʈ�Ⱑ ���ư��ϴ�");
	}
}
