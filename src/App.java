import java.util.Scanner;
import action.*;

public class App {
    public static void main(String[] args) throws Exception {

        // Création d'objets pour les différentes pièces
        actionChambre1 case1 = new actionChambre1();
        actionCuisine case2 = new actionCuisine();
        actionGarage case3 = new actionGarage();

        // Création d'un objet de type Scanner pour lire les entrées utilisateur
        Scanner scanne = new Scanner(System.in);

        int choice = 0;


        // Boucle qui permet de choisir une pièce jusqu'à ce que l'utilisateur choisisse d'arrêter
        while (choice != 4) {
            System.out.println("choisir la pièce");
            System.out.println("1- Chambre 1");
            System.out.println("2- Cuisine ");
            System.out.println("3- Garage ");
            System.out.println("4- Quitter le programme ");
            
            // Lire le choix de l'utilisateur
            choice = scanne.nextInt();


            // Exécuter une action en fonction du choix de l'utilisateur

            switch (choice) {

                case 1:     // Exécuter l'action correspondant à la chambre 1
                            case1.action();
                    break;

                case 2:    // Exécuter l'action correspondant à la cuisine
                            case2.action();

                    break;

                case 3: // Exécuter l'action correspondant au garage
                            case3.action();
                    break;

                default:
                     // Afficher un message d'erreur si le choix n'est pas valide
                    System.out.println("Entrer le numero correspondant à la pièce");
                    break;
            }

        }

        
    }
}
