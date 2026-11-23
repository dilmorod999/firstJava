import java.util.List;

public class ClientsRepositoryImple implements ClientsRepository {
    private List<Clients> clients;

    ClientsRepositoryImple(List<Clients> clients) {
        this.clients = clients;
    }

    public List<Clients> clients() {
        return clients;
    }
}
