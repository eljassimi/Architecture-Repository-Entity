package repositories;

import entities.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientRepository implements Repository<Client, String>{

    private List<Client> clients;

    public ClientRepository(){
        clients= new ArrayList<Client>();
    }


    @Override
    public void save(Client client) throws Exception {
        System.out.println("Client Saved Successfully");
    }

    @Override
    public Client findById(String id) {
        for (Client c :clients){
            if(c.getId().equals(id)){
                return c;
            }
        }
        return null;
    }

    @Override
    public List<Client> findAll() {
        return clients;
    }

    @Override
    public void deleteById(String id) {
        clients.removeIf(p->p.getId().equals(id));
    }
}
