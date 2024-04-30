package poo.tp.app.mapper;

import java.util.ArrayList;
import java.util.List;

import poo.tp.app.dto.client.ClientDto;
import poo.tp.app.dto.client.CreateClientDto;
import poo.tp.domain.users.model.Client;

public class ClientMapper {
  public static Client mapCreateClientDtoToClientEntity(CreateClientDto client) {
    return new Client(client.getFirstName(), client.getLastName(), client.getCPF(), client.getMoviesPreferences());
  }

  public static Client mapClientDtoToClientEntity(ClientDto clientDto) {
    String[] names = clientDto.getName().split(" ");

    return new Client(clientDto.getID(), names[0], names[1], clientDto.getCPF(),
        new ArrayList<String>(List.of(clientDto.getMoviesPreferences().split(", "))));
  }

  public static ClientDto mapClientEntityToClientDto(Client client) {
    return new ClientDto(client.getID(), client.getFirstName() + " " + client.getLastName(), client.getCPF(),
        String.join(", ", client.getMoviesPreferences()));
  }

  public static Iterable<ClientDto> mapClientEntitiesToClientDtos(Iterable<Client> clients) {
    List<ClientDto> clientDtos = new ArrayList<ClientDto>();

    for (Client client : clients) {
      clientDtos.add(mapClientEntityToClientDto(client));
    }

    return clientDtos;
  }
}
