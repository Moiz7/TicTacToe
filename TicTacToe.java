package javaapplication11;
/**
 *
 * @author Mohammed Moiz ul haq
 */
public class TicTacToe { //beginning of class tictactoe inside the same package
    public enum TTT{X,O,EMPTY}
    //private variables int of row and column
   private int row;
   private int column;
   
    private TTT grid[][]=new TTT[3][3]; //grid for the board from enum
    public TicTacToe(){ //constructor for initializing the grid elements to empty
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                grid[i][j]=TTT.EMPTY;
            }
        }
    }
        public void setrowscolumns(int r,int c){ //setter function rows and columns
            row=r;
            column=c;
        }
        public void displaygrid(){ //function to display the grid
            System.out.printf("\n");
            for (int c=0;c<3;c++){
                for (int d=0;d<3;d++){
                    System.out.printf("|\t%s\t",grid[c][d]); //displaying the grid row the row
                }
                System.out.printf("|\n");
            }
    }
        public boolean isDraw(){ //A boolean function to determing if it is a draw
		for( int i = 0; i < 3; i++ ){
			for(int j = 0; j < 3; j++ ){
				if( grid[i][j] == TTT.EMPTY ){//if there is an Empty square
					return false;
				}				
			}//end of the column array
		}//end of the row array
                System.out.println("The game is a draw");
		return true;//if there isn't an empty square
	}
        public int playerone(int r,int c){ //function for player1
            if (grid[r][c]==TTT.EMPTY){ //checking if the position is empty
                grid[r][c]=TTT.X; //if it is not empty, fill the value at the specified position inside the array
                return 1;
            }
            else {
                System.out.printf("\nAlready filled. Enter again"); //if already filled, asking the user to cenre the value
                return 2;
        }
        }
            public int playertwo(int r,int c){ //function for player2
            if (grid[r][c]==TTT.EMPTY){ //checking if the position is empty
                grid[r][c]=TTT.O; //if it is not empty, fill the value at the specified position inside the array
                return 1;
            }
            else {
                System.out.printf("\nAlready filled. Enter again"); //if already filled, asking the user to cenre the value
                return 2;
        }
            }
            public int playeronewinner(){ //function for determining the winner
                TTT a=TTT.X;
                
                if ( ( grid[row][0] == a && grid[row][1] == a &&	grid[row][2] == a )//checking 3-in-the-row horizontally	
			||  ( grid[0][column] == a && grid[1][column] == a && grid[2][column] == a )//checking 3-in-the-row vertically			
			||  ( grid[0][0] == a && grid[1][1] == a && grid[2][2] == a )//checking 3-in-the-row 1st diagonal			
			||  ( grid[0][2] == a && grid[1][1] == a && grid[2][0] == a )//checking 3-in-the-row 2nd diagonal
		){
                System.out.println("Player one wins");
                return 1; //return 1 if player1 wins
            }
              return 3;  //else returning 3
            }
            public int playertwowinner(){ //checking if playertwo is the winner
                TTT b=TTT.X;
                if ( ( grid[row][0] == b && grid[row][1] == b &&	grid[row][2] == b )//check 3-in-the-row horizontally	
			||  ( grid[0][column] == b && grid[1][column] == b && grid[2][column] == b )//check 3-in-the-row vertically			
			||  ( grid[0][0] == b && grid[1][1] == b && grid[2][2] == b )//check 3-in-the-row 1st diagonal			
			||  ( grid[0][2] == b && grid[1][1] == b && grid[2][0] == b )//check 3-in-the-row 2nd diagonal
		){
                System.out.println("Player two wins");
                return 2; //return 2 if player2 is the winner

            }
                else{
                return 4;
                }
            }
            

            public int thewinner(int count){
                int g;
               if (count%2==0){ //even value of count for player2
                   g=playeronewinner(); //calling the function for player2 if there is an even value of count
                   if (g==1){
                       return 1;
                   }
                   else {
                       return 4;
                   }
                   
               }
               else { //odd value for player1
                   g=playertwowinner(); 
                   if (g==2){
                       return 2;
                   }
                   else{
                       return 5;
                   }
               }
}
            
}


