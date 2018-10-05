public class player {

    public char character;
    public int turn;
    public int points;

    public player(char c, int t)
    {
        character = c;
        turn = t;
        points = 0;

    }

    public void shift(boolean row, boolean upleft, int a, boardtwo b)
    {
        b.move(row, upleft, a);
    }

    public boolean attackSub(int r, int c, deck d, boardtwo k, int row, int col, player j)
    {
        k.board[col - c][row - r] = 'z';
        j.character = d.draw();
        points++;
        System.out.println("hit");
        return true;
    }

    public boolean attackAdd(int r, int c, deck d, boardtwo k, int row, int col, player j)
    {
        k.board[col + c][row + r] = 'z';
        j.character = d.draw();
        points++;
        System.out.println("hit");
        return true;
    }

    public boolean capture(int dir, boardtwo k, player a, player b, player c, deck d)
    {
        int row = 0;
        int col = 0;
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                if (k.board[i][j] == character)
                {
                    col = i;
                    row = j;
                }
            }
        }

        if(dir == 0)
        {
            if(row == 0)
            {
                System.out.println("error");
                return false;
            }

            if(k.board[col][row - 1] == a.character)
            {
                attackSub(1,0, d, k, row, col, a);
            }
            else if(k.board[col][row - 1] == b.character)
            {
                attackSub(1,0, d, k, row, col, b);
            }
            else if(k.board[col][row - 1] == c.character)
            {
                attackSub(1,0, d, k, row, col, c);
            }
            else
            {
                System.out.println("miss");
                return false;
            }
        }
        else if(dir == 1)
        {

            if(col == 0)
            {
                System.out.println("error");
                return false;
            }

            if(k.board[col - 1][row] == a.character)
            {
                return attackSub(0,1, d, k, row, col, a);
            }
            else if(k.board[col - 1][row] == b.character)
            {
                return attackSub(0,1, d, k, row, col, b);
            }
            else if(k.board[col - 1][row] == c.character)
            {
                return attackSub(0,1, d, k, row, col, c);
            }
            else
            {
                System.out.println("miss");
                return false;
            }
        }
        else if(dir == 2)
        {
            if(row == 4)
            {
                System.out.println("error");
                return false;
            }

            if(k.board[col][row + 1] == a.character)
            {
                return attackAdd(1,0, d, k, row, col, a);
            }
            else if(k.board[col][row + 1] == b.character)
            {
                return attackAdd(1,0, d, k, row, col, b);
            }
            else if(k.board[col][row + 1] == c.character)
            {
                return attackAdd(1,0, d, k, row, col, c);
            }
            else
            {
                System.out.println("miss");
                return false;
            }
        }
        else if(dir == 3)
        {
            if(col == 4)
            {
                System.out.println("error");
                return false;
            }

            if(k.board[col + 1][row] == a.character)
            {
                return attackAdd(0,1, d, k, row, col, a);
            }
            else if(k.board[col + 1][row] == b.character)
            {
                return attackAdd(0,1, d, k, row, col, b);
            }
            else if(k.board[col + 1][row] == c.character)
            {
                return attackAdd(0,1, d, k, row, col, c);
            }
            else
            {
                System.out.println("miss");
                return false;
            }
        }
        else return false;
        return false;
    }

    public void canvas(int dir, boardtwo k, player a, player b, player c, deck d)
    {
        int row = 0;
        int col = 0;
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                if (k.board[i][j] == character)
                {
                    col = i;
                    row = j;
                }
            }
        }

        if(dir == 0)
        {
            if(row == 0)
            {
                System.out.println("invalid canvas"  + System.lineSeparator());
                return;
            }
            row--;
        }
        else if(dir == 1)
        {
            if(col == 0)
            {
                System.out.println("invalid canvas"  + System.lineSeparator());
                return;
            }
            col--;
        }
        else if(dir == 2)
        {
            if(row == 4)
            {
                System.out.println("invalid canvas"  + System.lineSeparator());
                return;
            }
            row++;
        }
        else if(dir == 3)
        {
            if(col == 4)
            {
                System.out.println("invalid canvas"  + System.lineSeparator());
                return;
            }
            col++;
        }
        else if(dir == 4)
        {
            // :D
        }


        if(k.board[col][row] == a.character)
        {
            System.out.println("hit player" + a.turn  + System.lineSeparator());
        }
        if(k.board[col][row] == b.character)
        {
            System.out.println("hit player" + b.turn  + System.lineSeparator());
        }
        if(k.board[col][row] == c.character)
        {
            System.out.println("hit player" + c.turn  + System.lineSeparator());
        }

        //
        if(row != 0)
        {
            if(k.board[col][row - 1] == a.character)
            {
                System.out.println("hit player" + a.turn  + System.lineSeparator());
            }
            if(k.board[col][row - 1] == b.character)
            {
                System.out.println("hit player" + b.turn  + System.lineSeparator());
            }
            if(k.board[col][row - 1] == c.character)
            {
                System.out.println("hit player" + c.turn  + System.lineSeparator());
            }
        }
        //
        if(row !=4)
        {
            if(k.board[col][row + 1] == a.character)
            {
                System.out.println("hit player" + a.turn  + System.lineSeparator());
            }
            if(k.board[col][row + 1] == b.character)
            {
                System.out.println("hit player" + b.turn  + System.lineSeparator());
            }
            if(k.board[col][row + 1] == c.character)
            {
                System.out.println("hit player" + c.turn  + System.lineSeparator());
            }
        }
        //
        if(col != 4)
        {
            if(k.board[col + 1][row] == a.character)
            {
                System.out.println("hit player" + a.turn  + System.lineSeparator());
            }
            if(k.board[col + 1][row] == b.character)
            {
                System.out.println("hit player" + b.turn  + System.lineSeparator());
            }
            if(k.board[col + 1][row] == c.character)
            {
                System.out.println("hit player" + c.turn  + System.lineSeparator());
            }
        }
        //
        if(col != 0)
        {
            if(k.board[col - 1][row] == a.character)
            {
                System.out.println("hit player" + a.turn  + System.lineSeparator());
            }
            if(k.board[col - 1][row] == b.character)
            {
                System.out.println("hit player" + b.turn  + System.lineSeparator());
            }
            if(k.board[col - 1][row] == c.character)
            {
                System.out.println("hit player" + c.turn  + System.lineSeparator());
            }
        }
    }
}

