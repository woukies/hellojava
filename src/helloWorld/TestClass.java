package helloWorld;

public class TestClass {

	public static void main(String[] args) {
		Order myOrder = new Order();
		myOrder.setOrderNumber(2021063001);

		System.out.println(myOrder.getOrderNumber());
	}

}

class Order {
	private long orderNumber;
	private String id;
	private String name;
	private String productNum;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProductNum() {
		return productNum;
	}

	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}

	public long getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(long n) {
		orderNumber = n;
	}
}
