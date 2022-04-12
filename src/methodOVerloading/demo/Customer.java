package methodOVerloading.demo;

public class Customer {
	private void cusdet(String name, int age, char gender, String add, long pincode) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(add);
		System.out.println(pincode);
	}
	 private void cusdet(String s, int a) {
		System.out.println(s);
		System.out.println(a);
	}
	
	public static void main(String[] args)
	{
		Customer c = new Customer();
		c.cusdet("priya", 30, 'F', "chennai", 6000);
		c.cusdet("siva", 25);
	}

}

