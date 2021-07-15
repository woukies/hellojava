package todo;

import java.text.SimpleDateFormat;
import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<Customer>();

		//Customer orange = new Customer("��Ȳ");

		customers.add(new Customer("����"));
		customers.add(new Customer("�Ͼ�"));
		customers.add(new Customer("����"));
		customers.add(new Customer("��Ȳ"));
		//customers.add(orange);
		customers.add(new Customer("���"));
		customers.add(new Customer("�ʷ�"));
		customers.add(new Customer("�Ķ�"));
		customers.add(new Customer("����"));

		// customer.get(1).setPoint(100);

		for (Customer c : customers) {
			System.out.print(c.getName() + "(" + c.getJoinDate() + ") " + c.getPoint());
			System.out.println();
		}
		System.err.println(Customer.getNumberOfCustomers());

		//// /?/ �Ҹ��� ���� 
		try {
			customers.get(3).finalize();
			//orange.finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		customers.remove(3);
		//System.out.println(orange.getJoinDate());

		Iterator<Customer> i = customers.iterator();
		while (i.hasNext()) {
			Customer c = i.next();
			System.out.print(c.getName() + " ");
		}
		System.err.println(Customer.getNumberOfCustomers());

	}
}

class Customer {
	private static int numberOfCustomers = 0;
	private String name;
	private int point = 0;
	private Date joinDate;

	public Customer(String name) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR) - (int) (Math.random() * 10));
		calendar.set(Calendar.MONTH, (int) (Math.random() * 12));
		calendar.set(Calendar.DATE, (int) (Math.random() * 25) + 1);
		this.name = name;
		this.point = (int) (Math.random() * 10) + 1;
		this.joinDate = calendar.getTime();
		Customer.numberOfCustomers++;
	}

	//// /?/ �Ҿ����ϴٴ� �Ҹ��ڸ�... �ᵵ �Ǵ°�?
	@Override
	protected void finalize() throws Throwable {
		Customer.numberOfCustomers--;
		super.finalize();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point += point;
	}

	public String getJoinDate() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy�� MM�� dd��");
		return dateFormat.format(joinDate.getTime());
	}

	public static int getNumberOfCustomers() {
		return numberOfCustomers;
	}
}