package action;

import garage.Garage;
import java.util.Scanner;

// Classe pour les actions dans le garage
public class actionGarage {
    
    // Méthode pour les actions dans le garage
    public void action(){
                       
                    // Création d'un objet Scanner pour la lecture des entrées utilisateur
                    Scanner scanne = new Scanner(System.in);

                    // Initialisation de la variable de choix de l'utilisateur
                    int choice = 0;

                    // Création d'un objet Garage pour manipuler les actions de le garage 
                    Garage garage = new Garage();
                    
                    //  Boucle jusqu'à ce que l'utilisateur sélectionne l'option 3 (Retourner au menu principal)
                    while (choice != 3) {             
                        System.out.println("Choisir l'action");
                        System.out.println( "1- ouvrir la porte" );
                        System.out.println( "2- fermer la porte" );
                        System.out.println( "3- Retourner au menu principal" );

                        // Récupération du choix de l'utilisateur
                        choice = scanne.nextInt();

                         // Switch sur le choix de l'utilisateur
                        switch (choice) {
                        case 1:    
                                     // Bloc try-catch pour gérer les exceptions
                                    try{
                                            garage.activer();// Appel de la méthode activer sur l'objet garage
                                            garage.toString();// Appel de la méthode toString sur l'objet garage pour afficher l'état actuel du garage

                                    } catch (Exception e) {
                                    System.out.println(e.getMessage());// Affichage du message d'erreur si une exception est levée
                                    }
                                    finally
                                    {
                                        System.out.println("L'instruction a toujours été exécuté.");// Affichage d'un message indiquant que cette instruction a toujours été exécutée
                                        //garage.finalize();
                                    }
                            break;

                        case 2:     // Bloc try-catch pour gérer les exceptions
                                    try{
                                            garage.desactiver();// Appel de la méthode desactiver sur l'objet chambre
                                            garage.toString();// Appel de la méthode toString sur l'objet chambre pour afficher l'état actuel de la chambre

                                    } catch (Exception e) {
                                                System.out.println(e.getMessage());// Affichage du message d'erreur si une exception est levée
                                    }
                                    finally
                                    {       
                                             // Affichage d'un message indiquant que cette instruction a toujours été exécutée
                                            System.out.println("L'instruction a toujours été exécuté.");
                                            //garage.finalize();
                                    }
                            break;
                        
                        default:
                                System.out.println( "Entrer le numero correspondant à l'action" );// Afficher un message d'erreur si le choix n'est pas valide
                            break;
                        }
                }


                }


}
