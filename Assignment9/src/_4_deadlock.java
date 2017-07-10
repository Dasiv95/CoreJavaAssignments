
public class _4_deadlock {

	public static void main(String[] args) {
		
		String A = "Ahamad Alisha";  
	    String B = "Sayed"; 
	    Thread t1 = new Thread() {  
	        public void run() {  
	            synchronized (A) {  
	             System.out.println("Thread 1: locked resource A");  
	    
	             try { Thread.sleep(100);} catch (Exception e) {}  
	            System.out.println("This is first thread waiting for second resource");
	             synchronized (B) {  
	              System.out.println("Thread 1: locked resource B");  
	             }  
	           }  
	        }  
	      };  
	      Thread t2 = new Thread() {  
	          public void run() {  
	            synchronized (B) {  
	              System.out.println("Thread 2: locked resource B");  
	      
	              try { Thread.sleep(100);} catch (Exception e) {}  
	      
	              System.out.println("This is second thread waiting for first resource");
	              synchronized (A) {  
	                System.out.println("Thread 2: locked resource A");  
	              }  
	            }  
	          }  
	        };  
	        
	        t1.start();
	        t2.start();
	        System.out.println("We can see that program is not terminating as the threads are waiting for the resources");

	}

}
