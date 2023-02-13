import java.util.Scanner;

import chambre1.Chambre1;
import chambre2.Chambre2;
import chambre3.Chambre3;
import cuisine.Cuisine;
import garage.Garage;

public class App {
    public static void main(String[] args) throws Exception {
            

       Chambre1 room1 = new Chambre1();
       Chambre2 room2 = new Chambre2();
       Chambre3 room3 = new Chambre3();
       Cuisine cuisine = new Cuisine();
       Garage garage = new Garage();



        
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
                                while (choice != 3) {             
                                    System.out.println("Choisir l'action");
                                    System.out.println( "1- activer le chauffage" );
                                    System.out.println( "2- desactiver le chauffage" );
                                    System.out.println( "3- Retourner au menu prncipal" );
                                    choice = scanne.nextInt();

                                    switch (choice) {
                                    case 1:    
                                                try{
                                                        cuisine.activer();
                                                        cuisine.toString();

                                                } catch (Exception e) {
                                                System.out.println(e.getMessage());
                                                }
                                                finally
                                                {
                                                    System.out.println("L'instruction a toujours été exécuté.");
                                                }
                                        break;

                                    case 2:
                                                try{
                                                        cuisine.desactiver();
                                                        cuisine.toString();

                                                } catch (Exception e) {
                                                         System.out.println(e.getMessage());
                                                }
                                                finally
                                                {
                                                        System.out.println("L'instruction a toujours été exécuté.");
                                                }
                                        break;
                                    
                                    default:
                                            System.out.println( "Entrer le numero correspondant à l'action" );
                                        break;
                                    }
                            }
                  break;

             case 5:
                      
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
