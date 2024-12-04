package org.example;
import java.util.Scanner;

public class ConsoleMenu {

    private final Scanner scanner;

    private ZooManager zoo = new ZooManager();
    public ConsoleMenu() {
        this.scanner = new Scanner(System.in);
    }

    public void startMenu() {
        while (true) {
            afficheMenuBase();
            String choix = scanner.nextLine();

            switch (choix) {
                case "1" -> addAnimal();
                case "2" -> addEnclos();
                case "3" -> animalInEnclos();
                case "4" -> readInEnclos();
                case "0" -> {
                    System.out.println("Au revoir !!!");
                    return; // ou break; ou System.exit(0); (termine l'application)
                }
                default -> System.out.println("Choix invalide !!!!");
            }
        }
    }

    public void afficheMenuBase() {
        System.out.println("##### Menu Salarié #######");
        System.out.println("1) Création d'animaux");
        System.out.println("2) Création d'enclos");
        System.out.println("3) Ajouter des animaux à des enclos");
        System.out.println("4) Visualiser les animaux dans un enclos");
        System.out.println("0) Quitter");
        System.out.print("Faite votre choix : ");
    }

    public void addAnimal(){
        while (true) {
            System.out.println("##### Ajouter un employé #######");
            System.out.println("1) Ajouter un Lion");
            System.out.println("2) Ajouter Elephant");
            System.out.println("0) Retour");
            System.out.print("Faite votre choix : ");

            String choix = scanner.nextLine();

            switch (choix) {
                case "1" -> Animal(true);
                case "2" -> Animal(false);
                case "0" -> {
                    return;
                }
                default -> System.out.println("Choix invalide !!!!");
            }
        }
    }

    public void Animal(boolean isLion) {
        System.out.println("Nom animal :");
        String nom = scanner.nextLine();

        System.out.println("age de l'animal :");
        int age = scanner.nextInt();
        scanner.nextLine();

        if (!isLion) {
            System.out.println("Poids de l'animal : ");
            float poids = scanner.nextFloat();
            scanner.nextLine();

            zoo.creerElephant(nom, age, poids);
        } else {
            zoo.ajouterLion(nom, age);
        };
    }

    public void addEnclos(){
        while (true) {
            System.out.println("##### Ajouter un employé #######");
            System.out.println("1) Créer une enclos pour Lion");
            System.out.println("2) Créer une enclos pour Elephant");
            System.out.println("0) Retour");
            System.out.print("Faite votre choix : ");

            String choix = scanner.nextLine();

            switch (choix) {
                case "1" -> zoo.creerEnclosLion();
                case "2" -> zoo.creerEnclosElephant();
                case "0" -> startMenu();
                default -> System.out.println("Choix invalide !!!!");
            }
        }
    }

    public void animalInEnclos(){
        System.out.println("Index Enclos :");
        int indexEnclos = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Index Animal :");
        int indexAnimal = scanner.nextInt();
        scanner.nextLine();

        zoo.ajoutDansEnclos(indexEnclos, indexAnimal);
    }

    public void readInEnclos(){
        System.out.println("l'en de quel espèces ? :");
        System.out.println("1) Lion");
        System.out.println("2) Elephant");
        int groupe = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Quel enclos (0 à 4):");
        int enclos = scanner.nextInt();
        scanner.nextLine();
        zoo.visualiserEnclos(groupe, enclos);

    }
}
