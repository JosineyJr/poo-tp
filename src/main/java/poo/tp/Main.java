package poo.tp;

import java.util.ArrayList;

import poo.tp.app.controllers.ClientController;
import poo.tp.domain.users.service.ClientService;
import poo.tp.infra.db.in_memory.InMemoryClientRepository;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> clientData = new ArrayList<>();
        clientData.add("action");  
        ClientController clientController = new ClientController(new ClientService(new InMemoryClientRepository()));

        clientController.createClient("John", "Doe", "12345678910", clientData);
    }
}