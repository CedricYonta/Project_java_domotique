import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
            
        Scanner scanne = new Scanner(System.in);

        int choice = 0;
        
        while (choice != 6) {
            System.out.println( "choisir la pièce" );
            System.out.println( "1- Chambre 1" );
            System.out.println( "2- Chambre 2" );
            System.out.println( "3- Chambre 3" );
            System.out.println( "4- Cuisine " );
            System.out.println( "5- Garage " );
            System.out.println( "6- Quitter le programme " );
  
            choice = scanne.nextInt();
  
            switch (choice) {
              case 1:
                      
                  break;
  
              case 2:
                       
                  break;
  
              case 3:
                       
                  break;
  
              case 4:
                      
                  break;

             case 5:
                      
                  break;
  
            
              default:
                 System.out.println( "Entrer le numero correspondant à la pièce" );
                  break;
            }
  
         }

        // activer désactiver doivent ils etre précis ?
    }
}
