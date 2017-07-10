
public class Address {
	 String address1;
	   String address2;
	   String city;
	   String state;
	   int zipCode;
	   Address(){
		   
	   }
	 /*  public boolean equals(Address a){
		   if(this.equals(a)){
			   return true;
		   }
		   else
			   return false;
	   } */
	   
	 public boolean aliequals(Address a) {
		    return this.address1.equals(a.address1) && this.address2.equals(a.address2)
		    		&& this.city.equals(a.city)&& this.state.equals(a.state)&& (this.zipCode==a.zipCode) ;
		} 
	   
	   
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

}
