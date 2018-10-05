

public class noir
{

    public static void main(String[] args)
    {

        boardtwo playboard = new boardtwo('a');
        deck d1 = new deck('a');

        char p1card = d1.draw();
        player p1 = new player(p1card, 1);

        char p2card = d1.draw();
        player p2 = new player(p2card, 2);

        char p3card = d1.draw();
        player p3 = new player(p3card, 3);

        char p4card = d1.draw();
        player p4 = new player(p4card, 4);


        System.out.print(p1.character);
        System.out.print(" ");
        System.out.print(p2.character);
        System.out.print(" ");
        System.out.print(p3.character);
        System.out.print(" ");
        System.out.println(p4.character);
        System.out.println(" ");


        playboard.print();
        p1.shift(true, false, 2, playboard);
        playboard.print();
        p2.shift(false, false, 3, playboard);
        playboard.print();
        p3.shift(true, true, 4, playboard);
        playboard.print();
        p4.shift(true, true, 0, playboard);
        playboard.print();

        System.out.println("p1 canvases!" + System.lineSeparator());
        p1.canvas(4, playboard, p2, p3, p4, d1);
        System.out.println("p2 canvases!" + System.lineSeparator());
        p2.canvas(3, playboard, p1, p3, p4, d1);
        System.out.println("p3 canvases!" + System.lineSeparator());
        p3.canvas(2, playboard, p2, p1, p4, d1);
        System.out.println("p4 canvases!" + System.lineSeparator());
        p4.canvas(1, playboard, p2, p3, p1, d1);


        p1.capture(0, playboard, p2, p3, p4, d1);
        p2.capture(1, playboard, p1, p3, p4, d1);
        p3.capture(2, playboard, p2, p1, p4, d1);
        p4.capture(3, playboard, p2, p3, p1, d1);
//pizza pizza
        //pizza pizza
        //froggo
    }

}
