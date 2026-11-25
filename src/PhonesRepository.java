import java.io.IOException;
import java.util.List;

public interface PhonesRepository {
//Создать метод который будет переворачивать все ID всех телефонах задом наперёд и возвращать их
    List<Phones> findPhonesReverseID();
//    Создать метод который будет находить все телефоны их общее сумму чей ID будут заканчиваться на ноль
    int findPhonesAndTotaliDtheEnd0();
//    Создать метод который будет находить среднее значение всех телефонов БУ возвращайте это среднее значение сохраните файл
    void findPhoneBuINFile() throws IOException;
//    Создать метод который будет находить среднее между самым дорогим и самым дешёвым телефоном и сохранял файл
    void findPhoneAvgMaxMin() throws IOException;
//    Создать метод который будет искать показания телефона в самом длинным показании модели и возвращать его название
    Phones findPhoneModel();
}
