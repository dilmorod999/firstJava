import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
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
        Phones phones = new Phones(1, "Iphone11", 500, "Blue", 2021, true);
        Phones phones1 = new Phones(23, "Iphone12", 550, "Red", 2022, false);
        Phones phones2 = new Phones(3, "Iphone13", 600, "Black", 2023, false);
        Phones phones3 = new Phones(40, "Iphonee18", 2000, "White", 2026, true);
        ArrayList<Phones> phonesArrayList = new ArrayList<>();
        phonesArrayList.add(phones);
        phonesArrayList.add(phones1);
        phonesArrayList.add(phones2);
        phonesArrayList.add(phones3);
        PhonesRepositoryImple phonesRepositoryImple = new PhonesRepositoryImple(phonesArrayList);
//        List<Phones> findPhoneReverseID = phonesRepositoryImple.findPhonesReverseID();
//        System.out.println(findPhoneReverseID);
//        int findPhoneTotalId0 = phonesRepositoryImple.findPhonesAndTotaliDtheEnd0();
//        System.out.println(findPhoneTotalId0);
//        phonesRepositoryImple.findPhoneBuINFile();
//        phonesRepositoryImple.findPhoneAvgMaxMin();
        Phones findPhonesMax = phonesRepositoryImple.findPhoneModel();
        System.out.println(findPhonesMax);

    }
}
