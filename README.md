# Live Coding : Architecture Repository-Entity

**Durée : 40 minutes**  
Mission : Vous devez créer un système de gestion de produits en Java utilisant une architecture en couches avec le pattern Repository. L'accent est mis sur la séparation des responsabilités.

---

## Architecture à Implémenter

### Étape 1 : Entity Produit
Créer une classe Produit avec :
- Attributs : id (Long), nom (String), prix (Double), stock (Integer)  
- Constructeur par défaut et avec paramètres  
- Getters/Setters complets  
- toString() pour l'affichage  

### Étape 2 : ProduitRepository
Créer une classe ProduitRepository qui :
- Utilise une `List<Produit>` comme stockage en mémoire  
- Contient les méthodes suivantes :  
  - `save(Produit p)` : ajoute un produit après validation  
    - nom non null et non vide  
    - prix > 0  
    - stock ≥ 0  
  - `findById(Long id)` : retourne le produit par son ID  
  - `findAll()` : retourne la liste de tous les produits  
  - `deleteById(Long id)` : supprime un produit par son ID  

### Étape 5 : Démonstration
Créer une classe `DemoGestionProduit` avec une méthode `main()` qui :
- Crée un `ProduitRepository`  
- Ajoute 3 produits de test :  
  - Laptop, 8000DH, stock 5  
  - Souris, 50DH, stock 10  
  - Écran, 1200DH, stock 0  
- Affiche tous les produits  
- Affiche un produit par son ID  
- Supprime un produit et réaffiche la liste  

---

## Question
Comment peut-on ajouter une entité Client à notre architecture actuelle tout en respectant le principe **Open/Closed Principle** ?
