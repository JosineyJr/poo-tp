package poo.tp.domain.service.users;

import poo.tp.app.dto.client.ClientDto;
import poo.tp.app.dto.client.CreateClientDto;
import poo.tp.app.dto.client.DeleteClientDto;
import poo.tp.app.dto.client.UpdateClientDto;
import poo.tp.app.mapper.ClientMapper;
import poo.tp.domain.exception.users.ClientAlreadyExistsException;
import poo.tp.domain.exception.users.ClientNotFoundException;
import poo.tp.domain.model.users.Client;
import poo.tp.domain.repository.users.IClientRepository;

public class ClientService {
  private final IClientRepository clientRepository;

  public ClientService(IClientRepository clientRepository) {
    this.clientRepository = clientRepository;
  }

  /**
   * Create a new client.
   * 
   * @param createClientDto
   * @throws ClientAlreadyExistsException 
   */
  public void create(CreateClientDto createClientDto) throws ClientAlreadyExistsException {
    Client clientFound = clientRepository.findByCPF(createClientDto.getCPF());

    if (clientFound != null) {
      throw new ClientAlreadyExistsException("Client already exists.");
    }

    Client client = new Client(createClientDto.getFirstName(), createClientDto.getLastName(), createClientDto.getCPF(), createClientDto.getMoviesPreferences());

    clientRepository.create(client.getID(), client);
  }

  /**
   * Update a client.
   * 
   * @param updateClientDto
   * @throws ClientNotFoundException 
   */
  public void update(UpdateClientDto updateClientDto) throws ClientNotFoundException {
    Client clientFound = clientRepository.read(updateClientDto.getID());

    if (clientFound == null) {
      throw new ClientNotFoundException("Client not found.");
    }

    clientFound.setFirstName(updateClientDto.getFirstName());
    clientFound.setLastName(updateClientDto.getLastName());
    clientFound.setMoviesPreferences(updateClientDto.getMoviesPreferences());

    clientRepository.update(clientFound.getID(),clientFound);
  }

  /**
   * Delete a client.
   * 
   * @param deleteClientDto
   * @throws ClientNotFoundException 
   */
  public void delete(DeleteClientDto deleteClientDto) throws ClientNotFoundException {
    Client clientFound = clientRepository.read(deleteClientDto.getID());

    if (clientFound == null) {
      throw new ClientNotFoundException("Client not found.");
    }

    clientRepository.delete(clientFound.getID());
  }

  /**
   * Find a client by ID.
   * 
   * @param ID
   * @return ClientDto
   */
  public ClientDto findByID(String ID) {
    Client clientFound = clientRepository.read(ID);

    if (clientFound == null) {
      return null;
    }

    return ClientMapper.mapClientEntityToClientDto(clientFound);
  }

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
   * @return Iterable<ClientDto>
   */
  public Iterable<ClientDto> findAll() {
    Iterable<Client> clients = clientRepository.list();

    return ClientMapper.mapClientEntitiesToClientDtos(clients);
  }
}
