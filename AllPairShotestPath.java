package ad;

public class AllPairShotestPath {
	
		 final static int inf =99999, v=4;
		 
		 void Floyd(int graph[][])
		 {
		   int dist= new int [v][v];
		   int i,j,k;
			 
		   for(i=0; i<v;i++)
		   {
			   for(j=0;j<0;j++)
			   {
				   dist[i][j] = graph[i][j];
			   }
		   }
		   
		   for (k=0; k<v;k++)
		   {
			   for(i=0; i<v; i++)
			   {
				   for(j=0; j<v;j++)
				   {
					  dist[i][j]= (dist)
				   }
			   }
		   }
		   printSolution(dist);
		 }

		void printSolution( int dist[][])
		{
			int i,j;
		 	for(i=0; i<v;++i)
		 	{
		 	  for(j=0; j<v;++j)
		 	  {
		 		  if(dist[i][j]==inf)
		 		  {
		 			  System.out.println("INFINITY");
		 		  }
		 		  else
		 		  {
		 			  System.out.print(dist[i][j]+" ");
		 		  }
		 		  System.out.println();
		 	  }
		 	
		 	}
		}
public static void main(String args [])
{
 int graph[][]= {{0,5,inf,10},
		 {inf,0,3,inf},
		 {inf,inf,0,1},
		 {inf,inf,inf,0}};
 
 AllPairShotestPath a = new  AllPairShotestPath();
 a.Floyd(graph);
}
}

