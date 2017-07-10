
public class Hospital {
	   String hospitalName;
	    Doctor doc = new Doctor();
	    Address hospitalAddress = new Address();
	    Hospital(){
	    	
	    }
	    
		public String getHospitalName() {
			return hospitalName;
		}
		public void setHospitalName(String hospitalName) {
			this.hospitalName = hospitalName;
		}
		public Doctor getDoctorDetails(){
			return doc;
		}
	

}
