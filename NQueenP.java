package ad;

public class NQueenP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		NQueenP a = new NQueenP();
		a. initialize();
				
	}

	private void initialize() {
	int [][] box = {{0,0,0,0},
			{0,0,0,0},
			{0,0,0,0},
			{0,0,0,0}
	};
		if(findsol(box,0)==false)System.out.println("NO SOLUTION");
		printBox(box);
	}

	private boolean findsol(int[][] box,int col) {
		if(col>=4)return true;
		for(int i =0; i<4;i++)
		{
			if(placeQueenOrNot(box,i,col)==true)
			{
				box[i][col]=1;
				if(findsol(box,col+1)==true)return true;
				box[i][col]=0;
			}
		}
		
		return false;
	}

	private boolean placeQueenOrNot(int[][] box, int row, int col) {
	 for(int i=0;i<col;i++)
	 {
		 if(box[row][i]==1)return false;
		 
	 }
		return false;
	}

	private void printBox(int[][] box) {
		for(int i =0;i<4;i++) {
			for(int j=0;j<4;j++)
			{
				if(box[i][j]==0) System.out.print("[] \t");
				else System.out.println("Q");
			}
			}
			}
		
		
	}


