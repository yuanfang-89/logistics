package bean;

public class Customer extends User{
	private String customerUserName;
	private String customerPassWord;
	private String customerName;
	private String customerPhone;
	private String customerAddress;

	public Customer(String username, String password,String customerName,String customerPhone,String customerAddress){
		super(username, password);
		this.customerUserName=username;
		this.customerPassWord=password;
		this.customerName=customerName;
		this.customerPhone=customerPhone;
		this.customerAddress=customerAddress;
	}
	public String getCustomerUserName(){
		return customerUserName;
	}
	public void setCustomerUserName(String username){
		this.customerUserName=username;
	}
	public String getCustomerPassWord(){
		return customerPassWord;
	}
	public void setCustomerPassWord(String password){
		this.customerPassWord=password;
	}
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}



	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}



	/*顾客的信息，姓名，电话，地址*/
	public void customerInfo(){
		
	}
	
	/*查询快递的物流*/
	public void examineExpressInfo(){
		
	}

}
