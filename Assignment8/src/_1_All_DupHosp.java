/*
 * 1)Write a program to identify the eliminate the duplicate hospital,
 *  if I enter same hospitalName and hospitalAddress ?
 */

import org.apache.commons.lang3.ArrayUtils; 

import java.util.*;

public class _1_All_DupHosp {
	public static void main(String[] args){
		System.out.println("How many hospitals do you want to enter to the database");
		Scanner sc =new Scanner(System.in);
		int numHosp = sc.nextInt();
		Hospital[] hsp = new Hospital[numHosp];
		for(int i=0;i<numHosp;i++){
			hsp[i] = new Hospital();
			/*
			 * Take all the hospitals details in this for loop
			 */
			
			System.out.println("Please enter the name of Hospital number "+(i+1));
			String a = sc.next();
		    hsp[i].setHospitalName(a);
		    System.out.println("Please enter the doctor details in the given order");
		    System.out.println("Please enter the doctor id :");
		    hsp[i].doc.setDocId(sc.nextInt());
		    System.out.println("Please enter the doctor name :");
		    hsp[i].doc.setName(sc.next());
		    System.out.println("Please enter the doctor's specialization :");
		    hsp[i].doc.setSpecialization(sc.next());
		    System.out.println("Now start entering the hospital address details in the given order");
		    System.out.println("Please enter the street address line 1 : ");
		    hsp[i].hospitalAddress.setAddress1(sc.nextLine());
		    System.out.println("Please enter the street address line 2 :");
		    hsp[i].hospitalAddress.setAddress2(sc.nextLine());
		    System.out.println("Please enter the city name :");
		    hsp[i].hospitalAddress.setCity(sc.nextLine());
		    System.out.println("Please enter the state name :");
		    hsp[i].hospitalAddress.setState(sc.nextLine());
		    System.out.println("Please enter the zip code :");
		    hsp[i].hospitalAddress.setZipCode(sc.nextInt());
		    
		}
		int temp = numHosp;
		for(int i=0;i<temp;i++){
			for(int j=i+1;j<temp;j++){
				if(hsp[i].hospitalAddress.aliequals(hsp[j].hospitalAddress) && hsp[i].hospitalName.equals(hsp[j].hospitalName)){
					/*
					 * In this loop you have to remove all the duplicate elements
					 */
					hsp = ArrayUtils.removeElement(hsp,(Hospital) hsp[j]);
					--temp;
				}
			}
		}
		System.out.println();
		for(int i=0;i<hsp.length;i++){
			System.out.println("Hospital "+i+ " name :"+hsp[i].getHospitalName()+"\t"+"Doctor Name :"+hsp[i].doc.getName()+"\t"+"Zip COde :"+hsp[i].hospitalAddress.getZipCode());
		}
		
		/*
		 *  2nd question starts from here. We have the same details of the hospitals
		 *  entered before. Now we have to check zip codes.
		 */
		/*
		 * If user enters his zipcode, identify the hospital near by
		 * ( use logic by subtracting user zip code with hospital zip code, 
		 * for example: if user enter 20170 and your hosiptal zipcodes 
		 * 20186 and 20184 then 20184 is the near one.)
		 */
		
		System.out.println("Please enter your zipcode to find a hospital near by");
		int userZip = sc.nextInt();
		int []diff = new int[hsp.length];
		for(int i=0;i<hsp.length;i++){
			diff[i] = Math.abs((userZip - hsp[i].hospitalAddress.getZipCode()));
		}
		int nearZip = diff[0];
		int nearZipIndex = 0;
		for(int i=0;i<diff.length;i++){
			if(nearZip>diff[i]){
				nearZip = diff[i];
				nearZipIndex = i;
			}
		}
		System.out.println("The folowing are the details of nearest hospital to you : ");
		System.out.println("Hospital Name : "+hsp[nearZipIndex].getHospitalName()+" Address "+hsp[nearZipIndex].hospitalAddress.getAddress2());
		
		
		/*
		 * 3rd question starts here
		 */
		
		/*
		 * 3)If user enters his zipcode, and his illness,
		 *  identify the hospital near by which supports specialization.
		 */
		System.out.println("Now let us find a hospital according to your illness too");
		System.out.println("Please enter your illness");
		String illness = sc.next();
		System.out.println("Please enter you Zip code");
		int illZip = sc.nextInt();
		int m=0;
		for(int i=0;i<hsp.length;i++){
			if(illness.equals(hsp[i].doc.getSpecialization())){
				++m;
			}
		}
		int hZip[]= new int[m];
		int ll = 0;
		for(int i=0;i<hsp.length;i++){
			if(illness.equals(hsp[i].doc.getSpecialization())){
				hZip[ll]=i;
				++ll;
			}
		} 
		
		int []tempdiff = new int[hZip.length]; 
		for(int i=0;i<hZip.length;i++){
				tempdiff[i] = Math.abs((illZip - hsp[hZip[i]].hospitalAddress.getZipCode()));
		}
		
		int mindiff = tempdiff[0];
		int mindiffIndex =0;
		for(int i=0;i<tempdiff.length;i++){
			if(mindiff>tempdiff[i]){
				mindiff = tempdiff[i];
				mindiffIndex = i;
			}
		}
		
		System.out.println("The following are the details of the hospital that treats your illness and nearest to you");
		System.out.println("Hospital Name : "+hsp[hZip[mindiffIndex]].getHospitalName()+" \t Address : "+hsp[hZip[mindiffIndex]].hospitalAddress.getAddress2()+"\t Zipcode : "+hsp[hZip[mindiffIndex]].hospitalAddress.getZipCode());
		
		
		/*
		 * 4th question starts from here
		 */
		
		
		/*
		 * Store all hospitalDetails with key as hospitalName and value as
		 *  HospitalObject.
		 *  Same for Doctor and Address. If I enter hospital name then list out 
		 *  all the doctor details that are part of the hospital(you can have same
		 *   hospital name with different location. its like having branches.
		 *  Duplicate elimination is based on hospitalName and Address.)
		 */
		/*
		 * first you have to rename the hospital whose name already exists for
		 * another hospital. So I will rename the new hospital by adding numbers at
		 * the end.  
		 */
		
		for(int i=0;i<hsp.length;i++){
			for(int j=i+1;j<hsp.length;j++){
				if(hsp[i].hospitalName.equals(hsp[j].hospitalName)){
					/*
					 * In this loop you have to rename all the duplicate elements
					 */
					hsp[j].setHospitalName(hsp[i].hospitalName+""+hsp[j].hashCode());
				}
			}
		}
		
		Map<String,Hospital> map = new HashMap<String,Hospital>();
		for(int i=0;i<hsp.length;i++){
			map.put(hsp[i].hospitalName, hsp[i]);
		}
		Map<String,Doctor> dmap = new HashMap<String,Doctor>();
		for(int i=0;i<hsp.length;i++){
			dmap.put(hsp[i].doc.name, hsp[i].doc);
		}
		Map<String,Address> Amap = new HashMap<String,Address>();
		for(int i=0;i<hsp.length;i++){
			Amap.put(hsp[i].hospitalName, hsp[i].hospitalAddress);
		}
		System.out.println("Please enter the hospital name : ");
		String hName = sc.next();
		System.out.println("The following are the details of the doctor present in that hospital : ");
		Doctor dtemp = dmap.get(map.get(hName).doc.name);
		System.out.println("Doctor name : "+dtemp.name);
		System.out.println("Doctor Id : "+dtemp.docId);
		System.out.println("Doctor specialization : "+dtemp.specialization);
	
		
		/*
		 * 5th question starts from here
		 */
		
		/*
		 * 5)If user request specialization availability then list out
		 *  all hospital that have the doctor with those specialization.
		 */
	
		System.out.println("Please enter the specialization to check the availability : ");
		String spec = sc.next();
		System.out.println("The following hospitals have the availability of doctors with your requested specialization ::");
		for(int i=0;i<hsp.length;i++){
			if(hsp[i].doc.specialization.equals(spec)){
				System.out.println(hsp[i].hospitalName+" hospital at "+hsp[i].hospitalAddress.address2);
			}
		}
		
		System.out.println("The program ends here. Thank you for using this application");
		
	}

}
