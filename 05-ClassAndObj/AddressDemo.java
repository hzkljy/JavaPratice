class Address {
	private String country; // ����
	private String province; // ʡ
	private String city; // ����
	private String street; // �ֵ�
	private long postal; // �ʱ�
	
	public Address() {}
	
	public Address(String country, String province, String city, String street, long postal) {
		this.country = country;
		this.province = province;
		this.city = city;
		this.street = street;
		this.postal = postal;
	}
	public String getAddressInfo() {
		return "���ң�" + this.country + 
			   "��ʡ��" + this.province +
			   "�����У�" + this.city +
			   "���ֵ���" + this.street +
			   "���ʱࣺ" + this.postal;
	}
}
public class AddressDemo {
	public static void main(String[] args) {
		System.out.println("��5�� ���Ҳ�����Ŀ1 ��дһ�������ַ��Address��");
		
		Address address = new Address("�й�", "�㶫", "����", "����", 344500);
		System.out.println(address.getAddressInfo());
	}
}