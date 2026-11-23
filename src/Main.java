import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Clients clients = new Clients(1, "Dimasik", 2000, "car");
        Clients clients1 = new Clients(2, "Mixail", 1000, "sigan");
        Clients clients2 = new Clients(3, "Vadim", 9000, "meta");
        Clients clients3 = new Clients(4, "Sasha", 5000, "telegram");
        ArrayList<Clients> clientsArrayList = new ArrayList<>();
        clientsArrayList.add(clients);
        clientsArrayList.add(clients1);
        clientsArrayList.add(clients2);
        clientsArrayList.add(clients3);
        ClientsRepositoryImple clientsRepositoryImple = new ClientsRepositoryImple(clientsArrayList);

    }
}
