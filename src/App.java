import java.util.Scanner;
import action.*;


public class App {
    public static void main(String[] args) throws Exception {
            
     /* 
       Chambre1 room1 = new Chambre1();
       Garage garage = new Garage();
       
        */
         actionChambre1 case1 = new actionChambre1();
         actionCuisine case2 = new actionCuisine();
         actionGarage case3 = new actionGarage();

         Scanner scanne = new Scanner(System.in);

         int choice = 0;
        
        while (choice != 4) {
            System.out.println( "choisir la pièce" );
            System.out.println( "1- Chambre 1" );
            System.out.println( "2- Cuisine " );
            System.out.println( "3- Garage " );
            System.out.println( "4- Quitter le programme " );
  
            choice = scanne.nextInt();
  
            switch (choice) {
  
              case 1:
                       
                  break;
  
             case 2:
                                case2.action();
                                
                  break;

             case 3:
                      
                  break;
  
            
              default:
                 System.out.println( "Entrer le numero correspondant à la pièce" );
                  break;
            }
  
         }

        // activer désactiver doivent ils etre précis ?
        // finalize()
    }
}
