import entities.Produit;
import repositories.ClientRepository;
import repositories.ProduitRepository;
import repositories.Repository;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static Repository pr = new ProduitRepository();
    private static Repository ct = new ClientRepository();
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice = 0;
        do {
            System.out.println("1 - Create new produit : ");
            System.out.println("2 - Display produit by id : ");
            System.out.println("3 - Display all products : ");
            System.out.println("4 - Delete product : ");
            choice  = sc.nextInt();
            switch (choice){
                case 1 :
                    CreateProduct();
                    break;
                case 2 :
                    DisplayProductById();
                    break;
                case 3 :
                    DisplayAllProduct();
                    break;
                case 4 :
                    DeleteProduct();
                    break;

            }

        }while(choice != 0);
    }

    public static void CreateProduct(){
        Produit p = new Produit();
        sc.nextLine();
        System.out.println("Entrer le nom du produit : ");
        p.setNom(sc.nextLine());
        System.out.println("Entrer le prix du produit");
        p.setPrix(sc.nextDouble());
        System.out.println("Entrer la Qnt du stock");
        p.setStock(sc.nextInt());
        try{
            pr.save(p);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void DisplayAllProduct(){
        List products = pr.findAll();
        if (products.isEmpty()){
            System.out.println("La liste est vide ! ");
        }else{
            System.out.println(products);
        }
    }

    public static void DisplayProductById(){
        System.out.println("Entrer Id du Produit : ");
        System.out.println(pr.findById(sc.nextInt()));
    }

    public static void DeleteProduct(){
        System.out.println("Entrer Id du Produit : ");
        int id = sc.nextInt();
        if(pr.findById(id)==null){
            System.out.println("Il ya aucun produit de ce ID");
        }else{
        pr.deleteById(id);
        }
    }

}