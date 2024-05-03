package poo.tp;

import java.util.ArrayList;

import poo.tp.app.controllers.ClientController;
import poo.tp.app.dto.client.CreateClientDto;
import poo.tp.domain.service.users.ClientService;
import poo.tp.infra.db.in_memory.users.InMemoryClientRepository;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> clientData = new ArrayList<>();
    clientData.add("action");
    ClientController clientController = new ClientController(new ClientService(new InMemoryClientRepository()));

    clientController.create(new CreateClientDto("Jhon", "Doe", "12345678912", clientData));
  }
}