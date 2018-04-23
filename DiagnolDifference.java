import java.lang.Math;

class DiagnolDifference 
{
	public static void main(String[] args) 
	{
		int d[][] =  {{1 ,2 ,3, 4},{2 ,3, 4, 5},{6 ,7, 8 ,9},{2, 3, 4 ,6}};
		System.out.println(d.length);
		int size = d.length;
		int d1=0,d2=0;

		for (int i=0; i<size ; i++)
		{	
			for(int j=0 ; j<size; j++){

				if(i==j)
			    d1 += d[i][j];

				if((i+j) == size-1){
				d2 += d[i][j]; 
				}
				 
			}
		}

	

		System.out.println("diagonal differeeence " +d1 +  " and " +d2+ " is "  + Math.abs(d1 -d2));
	}
}
