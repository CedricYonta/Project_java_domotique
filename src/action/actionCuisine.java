package action;

import cuisine.Cuisine;
import java.util.Scanner;
//import java.lang.Object.finalize;

// Classe pour les actions dans la cuisine
public class actionCuisine {
    

     // Méthode pour les actions dans la chambre 
    public void action(){
          
         // Création d'un objet Scanner pour la lecture des entrées utilisateur
        Scanner scanne = new Scanner(System.in);
         
         // Initialisation de la variable de choix de l'utilisateur
        int choice = 0;

        // Création d'un objet Cuisine pour manipuler les actions de la cuisine
        Cuisine cuisine = new Cuisine();

                     // Boucle jusqu'à ce que l'utilisateur sélectionne l'option 3 (Retourner au menu principal)
                    while (choice != 3) {             
                        System.out.println("Choisir l'action");
                        System.out.println("1- activer le chauffage");
                        System.out.println( "2- desactiver le chauffage" );
                        System.out.println( "3- Retourner au menu prncipal" );

                        // Récupération du choix de l'utilisateur
                        choice = scanne.nextInt();

                        // Switch sur le choix de l'utilisateur
                        switch (choice) {
                        case 1:    

                                     // Bloc try-catch pour gérer les exceptions
                                    try{
                                            cuisine.activer();// Appel de la méthode activer sur l'objet cuisine
                                            cuisine.toString();// Appel de la méthode toString sur l'objet cuisine pour afficher l'état actuel de la cuisine

                                    } catch (Exception e) {
                                    System.out.println(e.getMessage());// Affichage du message d'erreur si une exception est levée
                                    }
                                    finally
                                    {
                                        System.out.println("L'instruction a toujours été exécuté.");// Affichage d'un message indiquant que cette instruction a toujours été exécutée
                                        //cuisine.finalize();
                                    }
                            break;

                        case 2:    
                                    // Bloc try-catch pour gérer les exceptions
                                    try{
                                            cuisine.desactiver();// Appel de la méthode desactiver sur l'objet cuisine
                                            cuisine.toString();// Appel de la méthode toString sur l'objet cuisine pour afficher l'état actuel de la cuisine

                                    } catch (Exception e) {
                                                System.out.println(e.getMessage());// Affichage du message d'erreur si une exception est levée
                                    }
                                    finally
                                    {        
                                             // Affichage d'un message indiquant que cette instruction a toujours été exécutée
                                            System.out.println("L'instruction a toujours été exécuté.");
                                            //cuisine.finalize();
                                          
                                    }
                            break;
                        
                        default:
                                System.out.println( "Entrer le numero correspondant à l'action" );// Afficher un message d'erreur si le choix n'est pas valide
                            break;
                        }
                }


                }
}
