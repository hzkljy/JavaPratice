class Address {
	private String country; // 国家
	private String province; // 省
	private String city; // 城市
	private String street; // 街道
	private long postal; // 邮编
	
	public Address() {}
	
	public Address(String country, String province, String city, String street, long postal) {
		this.country = country;
		this.province = province;
		this.city = city;
		this.street = street;
		this.postal = postal;
	}
	public String getAddressInfo() {
		return "国家：" + this.country + 
			   "、省：" + this.province +
			   "、城市：" + this.city +
			   "、街道：" + this.street +
			   "、邮编：" + this.postal;
	}
}
public class AddressDemo {
	public static void main(String[] args) {
		System.out.println("第5章 自我测试题目1 编写一个代码地址的Address类");
		
		Address address = new Address("中国", "广东", "深圳", "西乡", 344500);
		System.out.println(address.getAddressInfo());
	}
}