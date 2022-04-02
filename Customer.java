package by.it_academy.popko.training;

public class Customer {

	private int id;
	private String fullName;
	private String adress;
	private int creditCardNumber;
	private int bankAccountNumber;

	public Customer() {
		id = 0;
		fullName = null;
		adress = null;
		creditCardNumber = 0;
		bankAccountNumber = 0;
	}

	public Customer(int id1, String fullName1, String adress1, int creditCardNumber1, int bankAccountNumber1) {
		if (id1 > 0 && id1 < 500) {
			this.id = id1;
		} else {
			throw new RuntimeException("invalid value");
		}
		this.fullName = fullName1;
		this.adress = adress1;
		if (creditCardNumber1 > 0 && creditCardNumber1 < 1000) {
			this.creditCardNumber = creditCardNumber1;
		} else {
			throw new RuntimeException("invalid value");
		}
		if (bankAccountNumber1 > 100 && bankAccountNumber1 < 1100) {
			this.bankAccountNumber = bankAccountNumber1;
		} else {
			throw new RuntimeException("invalid value");
		}
	}

	public int getId() {
		return id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public int getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", fullname=" + fullName + ", adress=" + adress + ", creditCardNumber="
				+ creditCardNumber + ", bankAccountNumber=" + bankAccountNumber + "]";
	}

}
