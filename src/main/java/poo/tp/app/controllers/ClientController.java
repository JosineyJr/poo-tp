package poo.tp.app.controllers;

import poo.tp.app.dto.client.CreateClientDto;
import poo.tp.app.dto.client.UpdateClientDto;
import poo.tp.domain.model.users.Client;
import poo.tp.domain.service.users.ClientService;

public class ClientController implements IController<Client, CreateClientDto, UpdateClientDto> {
  private final ClientService clientService;

  public ClientController(ClientService clientService) {
    this.clientService = clientService;
  }

  @Override
  public void create(CreateClientDto object) {
    try {
      this.clientService.create(object);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  @Override
  public Client read(String ID) {
    try {
      return this.clientService.read(ID);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    return null;
  }

  @Override
  public void update(UpdateClientDto object) {
    try {
      this.clientService.update(object);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  @Override
  public void delete(String ID) {
    try {
      this.clientService.delete(ID);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  @Override
  public Iterable<Client> list() {
    try {
      return this.clientService.list();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    return null;
  }
}
