public class boardtwo
{
    public char[][] board;


    public boardtwo(char hold)
    {
        board = new char[5][5];

        for(int row = 0; row < 5; row++)
        {
            for(int column = 0; column < 5; column++)
            {
                board[row][column] = hold;
                hold++;
            }
        }

        System.out.println("setup complete");

    }

    public void print()
    {
        for(int row = 0; row < 5; row++)
        {
            for(int column = 0; column < 5; column++)
            {
                System.out.print(board[row][column]);
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        System.out.print("\n");
    }

    public void move(boolean row, boolean upleft, int a)
    {
        if(row ==  true)
        {
            if(upleft == true)
            {
                char temp = board[a][0];
                board[a][0] = board[a][1];
                board[a][1] = board[a][2];
                board[a][2] = board[a][3];
                board[a][3] = board[a][4];
                board[a][4] = temp;

            }
            else
            {
                char temp = board[a][4];
                board[a][4] = board[a][3];
                board[a][3] = board[a][2];
                board[a][2] = board[a][1];
                board[a][1] = board[a][0];
                board[a][0] = temp;

            }
        }
        else
        {
            if(upleft == true)
            {
                char temp = board[0][a];
                board[0][a] = board[1][a];
                board[1][a] = board[2][a];
                board[2][a] = board[3][a];
                board[3][a] = board[4][a];
                board[4][a] = temp;

            }
            else
            {
                char temp = board[4][a];
                board[4][a] = board[3][a];
                board[3][a] = board[2][a];
                board[2][a] = board[1][a];
                board[1][a] = board[0][a];
                board[0][a] = temp;

            }
        }

    }
	/*
	public static void main(String[] args)
	{
		setup();
		print();
		move(true, true, 0);
		print();
		move(true, false, 0);
		print();
		move(false, true, 3);
		print();
		move(false, false, 3);
		print();




	}
	*/
}
