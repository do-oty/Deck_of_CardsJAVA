import java.util.Scanner;
public class Menu {
    private Deck deck;


    public Menu() {
      Deck deck = new Deck();
    }



    public void showMenu() {

        int choice = 0;
        Scanner scan = new Scanner(System.in);

        do{


            System.out.printf("\n\nWhat to do?:\n[1]\tCreate\n" +
                    "[2]\tShuffle\n" +
                    "[3]\tDeal\n" +
                    "[4]\tDisplay\n" +
                    "[5]\tExit!\n\n");

            choice = scan.nextInt();

            switch(choice){

                case 1:
                    deck = new Deck();
                    System.out.println("Deck created.\n");
                    break;
                case 2:
                if(deck != null){
                    deck.Shuffle();
                }else {
                    System.out.println("\n\nDeck not created yet!\n");
                }
                    break;
                case 3:
                    if(deck != null){
                        deck.Deal();
                    }else {
                        System.out.println("\n\nDeck not created yet!\n");
                    }   
                    break;

                case 4:

                    if(deck != null){
                        deck.Display();
                        System.out.println("\n\nAll cards displayed!\n");

                    }else {
                        System.out.println("\n\nDeck not created yet!\n");
                    }


                    break;

                case 5:

                    break;
                default:
                    System.out.printf("Invalid input!");
                    break;




            }







        }while(choice != 5);

    }






}
