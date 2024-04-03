package com.sunbeam.invoice;

public class Invoice {

	
		private String partNumber;
		private String partDiscription;
		private int quntity;
		private double price;
		public Invoice() {
			
		}
		public Invoice(String partNumber, String partDiscription, int quntity, double price) {
			super();
			this.partNumber = partNumber;
			this.partDiscription = partDiscription;
			this.quntity = quntity;
			this.price = price;
		}
		public String getPartNumber() {
			return partNumber;
		}
		public void setPartNumber(String partNumber) {
			this.partNumber = partNumber;
		}
		public String getPartDiscription() {
			return partDiscription;
		}
		public void setPartDiscription(String partDiscription) {
			this.partDiscription = partDiscription;
		}
		public int getQuntity() {
			return quntity;
		}
		public void setQuntity(int quntity) {
			this.quntity = quntity;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		 
	Double calculateInvoice()
	{
		return price*quntity;
		

	}
	public void setquntity(int quntity)
	{
		if(quntity<0)
		{
			quntity=0;
		}
		this.quntity=quntity;
}
	double calculateAmount()

{
		return price*quntity;
		}
}
