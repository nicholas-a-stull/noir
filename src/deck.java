
public class deck {

    public static char[] cards;

    public deck(char hold)
    {
        cards = new char[25];

        for(int c = 0; c < 25; c++)
        {
            cards[c] = hold;
            hold++;
        }
    }

    public char draw()
    {
        int select;
        char out;
        select = (int)(Math.random() * ((24 - 0) + 1));
        while(cards[select] == 'z')
        {
            select = (int)(Math.random() * ((24 - 0) + 1));
        }
        out = cards[select];
        cards[select] = 'z';
        return out;
    }
}
