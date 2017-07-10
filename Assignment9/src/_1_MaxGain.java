
public class _1_MaxGain {

	public static void main(String[] args) {
		int[] sPrices= {10,05,04,12,32,04,35};
		int min = sPrices[0];
		int minIndex = 0 ;
		for(int i=0;i<sPrices.length;i++){
			if(min>sPrices[i]){
				min = sPrices[i];
				minIndex = i;
			}
		}
		int max = sPrices[minIndex+1];
		int maxIndex = 0;
		for(int i=minIndex+1;i<sPrices.length;i++){
			if(max< sPrices[i]){
				max = sPrices[i];
				maxIndex = i;
			}
		}
		int dupminIndex = 0;
		for(int i = minIndex+1;i<sPrices.length;i++){
			if(min==sPrices[i]){
				if(maxIndex > i){
					dupminIndex = i;
				}
				
			}
		}
		System.out.println("If you buy on day "+minIndex+" and sell on day "+maxIndex+" you will get max gain of "+(max-min));
	    if(dupminIndex!=0)
	    	System.out.println("If you buy on day "+dupminIndex+" and sell on day "+maxIndex+" you will get max gain of "+(max-min)+" in less number of days");
		
	

	}

}
