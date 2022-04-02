package by.it_academy.popko.test_drive;

import by.it_academy.popko.training.Customer;

public class CustomerTestDrive {

	public static void main(String[] args) {

		Customer[] customer = new Customer[10];
		String[] fullName = { "Ivanov I.V.", "Fetrov V.V.", "Titov L.Z.", "Sidorov I.V.", "Popko I.V.", "Dubic I.I.",
				"Kasov P.K.", "Wanin K.M.", "Likon E.V.", "Avikov Q.V." };
		String[] adress = { "50 let BSSR", "Sovetskaya", "Domeyko", "Parkovaya", "Minina", "Lenina", "Gagarina",
				"Ujnaya", "Severniy", "Avia Gorodok" };

		initCustomer(customer, fullName, adress);
		printFullList(customer);
		printListInAlphabeticalOrder(customer);
		printListInNumberRange(customer, 60, 200);
	}

	public static void initCustomer(Customer[] customer1, String[] fullName1, String[] adress1) {
		for (int i = 0; i < customer1.length; i++) {
			customer1[i] = new Customer();
			customer1[i].setId((int) (Math.random() * 500 + 1));
			customer1[i].setCreditCardNumber((int) (Math.random() * 1000 + 1));
			customer1[i].setBankAccountNumber((int) (Math.random() * 1100 + 100));
			customer1[i].setFullName(fullName1[i]);
			customer1[i].setAdress(adress1[i]);
		}
	}

	public static void printFullList(Customer[] customer2) {
		for (int i = 0; i < customer2.length; i++) {
			System.out.println(customer2[i].toString());
		}
		System.out.println();
	}

	public static void printListInAlphabeticalOrder(Customer[] customer3) {
		int min;
		Customer temp;

		for (int i = 0; i < customer3.length; i++) {
			min = i;
			for (int j = i; j < customer3.length; j++) {
				if (customer3[min].getFullName().compareTo(customer3[j].getFullName()) > 0) {
					min = j;
				}
			}
			temp = customer3[i];
			customer3[i] = customer3[min];
			customer3[min] = temp;
		}
		printFullList(customer3);
	}

	public static void printListInNumberRange(Customer[] customer4, int a, int b) {
		for (int i = 0; i < customer4.length; i++) {
			if (customer4[i].getId() > a && customer4[i].getId() < b) {
				System.out.println(customer4[i].toString());
			}
		}
		System.out.println();
	}

}
