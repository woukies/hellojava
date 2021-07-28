package todo;

import java.text.SimpleDateFormat;
import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<Customer>();

		//Customer orange = new Customer("주황");

		customers.add(new Customer("검정"));
		customers.add(new Customer("하양"));
		customers.add(new Customer("빨강"));
		customers.add(new Customer("주황"));
		//customers.add(orange);
		customers.add(new Customer("노랑"));
		customers.add(new Customer("초록"));
		customers.add(new Customer("파랑"));
		customers.add(new Customer("보라"));

		// customer.get(1).setPoint(100);

		for (Customer c : customers) {
			System.out.print(c.getName() + "(" + c.getJoinDate() + ") " + c.getPoint());
			System.out.println();
		}
		System.err.println(Customer.getNumberOfCustomers());

		//// /?/ 소멸자 실행 
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

	//// /?/ 불안정하다는 소멸자를... 써도 되는가?
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
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
		return dateFormat.format(joinDate.getTime());
	}

	public static int getNumberOfCustomers() {
		return numberOfCustomers;
	}
}