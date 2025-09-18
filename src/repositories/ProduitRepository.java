package repositories;

import java.util.ArrayList;
import java.util.List;

import entities.*;

public class ProduitRepository implements Repository<Produit, Integer> {
    private List<Produit> produits;

    public ProduitRepository(){
        produits = new ArrayList<>();
    }

    public void save(Produit p) throws Exception{
        if (p.getNom().isEmpty()){
            throw new Exception("Name is Empty");
        }else if(p.getPrix()<=0){
            throw new Exception("prix et null ou inferieur");
        }else if(p.getStock()<0){
            throw new Exception("stock entrer est négative");
        }else{
            produits.add(p);
        }
    }

    public Produit findById(Integer id){
        for (Produit p :produits){
            if(p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }

    public List<Produit> findAll(){
        return produits;
    }

    public void deleteById(Integer id ){
        produits.removeIf(p->p.getId().equals(id));
    }
}
