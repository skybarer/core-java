class Pattern 
{
	
	public static void main(String[] args) 
	{
        int n =4;

		for(int i=1 ; i<=n ; i++){
		   
		   for(int j=i ; j<i+n ; j++){
              
			  if(j>n){
			     System.out.print(j-n + " ");
			  }else{
			    System.out.print(j + " ");
			  
			  }
			   
              
		   }
			 System.out.println();
		
		}
		
	}
}
