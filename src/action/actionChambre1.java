package action;

import chambre1.Chambre1;
import java.util.Scanner;

// Classe pour les actions dans la chambre 
public class actionChambre1 {
    
     // Méthode pour les actions dans la chambre 
    public void action(){
          
        // Création d'un objet Scanner pour la lecture des entrées utilisateur
        Scanner scanne = new Scanner(System.in);
        
         // Initialisation de la variable de choix de l'utilisateur
        int choice = 0;
        
        // Création d'un objet Chambre1 pour manipuler les actions de la chambre 
        Chambre1 chambre = new Chambre1();

        // Boucle jusqu'à ce que l'utilisateur sélectionne l'option 3 (Retourner au menu principal)
        while (choice != 3) {             
            System.out.println("Choisir l'action");
            System.out.println( "1- allumer la lumière" );
            System.out.println( "2- éteindre la lumière" );
            System.out.println( "3- Retourner au menu principal" );

            // Récupération du choix de l'utilisateur
            choice = scanne.nextInt();

             // Switch sur le choix de l'utilisateur
            switch (choice) {
            case 1:    
                        // Bloc try-catch pour gérer les exceptions
                        try{
                                chambre.activer(); // Appel de la méthode activer sur l'objet chambre
                                chambre.toString();// Appel de la méthode toString sur l'objet chambre pour afficher l'état actuel de la chambre

                        } catch (Exception e) {
                        System.out.println(e.getMessage());// Affichage du message d'erreur si une exception est levée
                        }
                        finally
                        {
                            System.out.println("L'instruction a toujours été exécuté.");// Affichage d'un message indiquant que cette instruction a toujours été exécutée
                        }
                break;

            case 2:     
                        // Bloc try-catch pour gérer les exceptions
                        try{
                                chambre.desactiver();// Appel de la méthode desactiver sur l'objet chambre
                                chambre.toString();// Appel de la méthode toString sur l'objet chambre pour afficher l'état actuel de la chambre

                        } catch (Exception e) {
                                    System.out.println(e.getMessage());// Affichage du message d'erreur si une exception est levée
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
