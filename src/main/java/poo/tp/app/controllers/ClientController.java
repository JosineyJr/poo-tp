package poo.tp.app.controllers;

import java.util.ArrayList;

import poo.tp.app.dto.client.CreateClientDto;
import poo.tp.domain.users.service.ClientService;

public class ClientController {
  private final ClientService clientService;

  public ClientController(ClientService clientService) {
    this.clientService = clientService;
  }

  public void createClient(String firstName, String lastName, String CPF, ArrayList<String> moviesPreferences) {
    try {
      CreateClientDto createClientDto = new CreateClientDto(firstName, lastName, CPF, moviesPreferences);

      this.clientService.create(createClientDto);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
