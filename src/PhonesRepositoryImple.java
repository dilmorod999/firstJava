import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PhonesRepositoryImple implements PhonesRepository {
    List<Phones> phones;

    PhonesRepositoryImple(List<Phones> phones) {
        this.phones = phones;
    }

    public List<Phones> phones() {
        return phones;
    }

    //Создать метод который будет переворачивать все ID всех телефонах задом наперёд и возвращать их
    @Override
    public List<Phones> findPhonesReverseID() {
        List<Phones> result = new ArrayList<>();
        for (int i = 0; i < phones.size(); i++) {
            String id = phones.get(i).getId() + "";
            String empty = "";
            for (int j = id.length() - 1; j >= 0; j--) {
                empty = empty + id.charAt(j);
            }
            phones.get(i).setId(Integer.parseInt(empty));
            result.add(phones.get(i));
        }
        return result;
    }

    //Создать метод который будет находить все телефоны их общее сумму чей ID будут заканчиваться на ноль
    @Override
    public int findPhonesAndTotaliDtheEnd0() {
        int total = 0;
        for (int i = 0; i < phones.size(); i++) {
            String id = phones.get(i).getId() + "";
            if (id.endsWith("0")) {
                total = total + phones.get(i).getPrice();
            }

        }
        return total;
    }

    //    Создать метод который будет находить среднее значение всех телефонов БУ возвращайте это среднее значение сохраните файл
    @Override
    public void findPhoneBuINFile() throws IOException {
        File file = new File("New");
        FileWriter fileWriter = new FileWriter(file);
        int total = 0;
        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i).getBu() == true) {
                total = total + phones.get(i).getPrice();
            }
        }
        fileWriter.write(total / phones.size() + "\n");
        fileWriter.flush();
        fileWriter.close();
    }
//    Создать метод который будет находить среднее между самым дорогим и самым дешёвым телефоном и сохранял файл

    @Override
    public void findPhoneAvgMaxMin() throws IOException {
        File file = new File("New");
        FileWriter fileWriter = new FileWriter(file);
        int total = 0;
        int max = 0;
        int min = phones.get(0).getPrice();
        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i).getPrice() > max) {
                max = phones.get(i).getPrice();
            }
            if (phones.get(i).getPrice() < min) {
                min = phones.get(i).getPrice();

            }
        }
        total = (max + min) / 2;
        fileWriter.write(total + "");
        fileWriter.flush();
        fileWriter.close();
    }
//    Создать метод который будет искать показания телефона в самом длинным показании модели и возвращать его название

    @Override
    public Phones findPhoneModel() {
        Phones found = null;
        int maxLen = 0;
        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i).getModel().length() > maxLen) {
                found = phones.get(i);
                maxLen = phones.get(i).model.length();
            }
        }
        return found;
    }

    @Override
    public int findTotalPricePhone() {
        int total = 0;
        for (int i = 0; i < phones.size(); i++) {
            total = total + phones.get(i).getPrice();
        }
        return total;
    }
}