package poo.tp.domain.service.users;

import poo.tp.app.dto.client.ClientDto;
import poo.tp.app.dto.client.CreateClientDto;
import poo.tp.app.dto.client.UpdateClientDto;
import poo.tp.app.mapper.ClientMapper;
import poo.tp.domain.exception.users.ClientAlreadyExistsException;
import poo.tp.domain.exception.users.ClientNotFoundException;
import poo.tp.domain.model.users.Client;
import poo.tp.domain.repository.users.IClientRepository;

public class ClientService {
  private final IClientRepository clientRepository;

  /**
   * Constructs a new instance of the ClientService class.
   * 
   * @param clientRepository The client repository implementation.
   */
  public ClientService(IClientRepository clientRepository) {
    this.clientRepository = clientRepository;
  }

  /**
   * Create a new client.
   * 
   * @param createClientDto The DTO object containing the client information.
   * @throws ClientAlreadyExistsException If a client with the same CPF already
   *                                      exists.
   */
  public void create(CreateClientDto createClientDto) throws ClientAlreadyExistsException {
    Client clientFound = clientRepository.findByCPF(createClientDto.getCPF());

    if (clientFound != null) {
      throw new ClientAlreadyExistsException("Client already exists.");
    }

    Client client = new Client(createClientDto.getFirstName(), createClientDto.getLastName(), createClientDto.getCPF(),
        createClientDto.getMoviesPreferences());

    clientRepository.create(client.getID(), client);
  }

  /**
   * Find a client by ID.
   * 
   * @param ID The ID of the client to find.
   * @return The Client object if found, or null if not found.
   */
  public Client read(String ID) {
    Client clientFound = clientRepository.read(ID);

    if (clientFound == null) {
      return null;
    }

    return clientFound;
  }

  /**
   * Update a client.
   * 
   * @param updateClientDto The DTO object containing the updated client
   *                        information.
   * @throws ClientNotFoundException If the client with the specified ID is not
   *                                 found.
   */
  public void update(UpdateClientDto updateClientDto) throws ClientNotFoundException {
    Client clientFound = clientRepository.read(updateClientDto.getID());

    if (clientFound == null) {
      throw new ClientNotFoundException("Client not found.");
    }

    clientFound.setFirstName(updateClientDto.getFirstName());
    clientFound.setLastName(updateClientDto.getLastName());
    clientFound.setMoviesPreferences(updateClientDto.getMoviesPreferences());

    clientRepository.update(clientFound.getID(), clientFound);
  }

  /**
   * Delete a client.
   * 
   * @param ID The ID of the client to delete.
   * @throws ClientNotFoundException If the client with the specified ID is not
   *                                 found.
   */
  public void delete(String ID) throws ClientNotFoundException {
    Client clientFound = clientRepository.read(ID);

    if (clientFound == null) {
      throw new ClientNotFoundException("Client not found.");
    }

    clientRepository.delete(clientFound.getID());
  }

  /**
   * Find a client by CPF.
   * 
   * @param CPF The CPF of the client to find.
   * @return The ClientDto object if found, or null if not found.
   */
  public ClientDto findByCPF(String CPF) {
    Client clientFound = clientRepository.findByCPF(CPF);

    if (clientFound == null) {
      return null;
    }

    return ClientMapper.mapClientEntityToClientDto(clientFound);
  }

  /**
   * Find all clients.
   * 
   * @return An Iterable of ClientDto objects representing all the clients.
   */
  public Iterable<Client> list() {
    Iterable<Client> clients = clientRepository.list();

    return clients;
  }
}
