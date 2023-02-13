
import cuisine.Cuisine;
import java.util.Scanner;

public class actionCuisine {
    

    public void action(){
                          
        Scanner scanne = new Scanner(System.in);

        int choice = 0;

        Cuisine cuisine = new Cuisine();

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


                }
}
