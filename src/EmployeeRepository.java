import java.io.IOException;
import java.util.List;

public interface EmployeeRepository {
    //Метод который будет находить всех сотрудников у которых четное количество букв а в первой половине его имени и возвращать их
    List<Employee> findCountEmployeAfirstPart();

    //    Метод который будет находить общую сумму всех балансов сотрудников если баланс есть три нуля в любом месте
    int findTotalSalaryHaveThree0();

    //    Метод который будет находить общую сумму сохранять её файл а возвращайтесь методы среднюю сумму баланса
    void findTotalSalaryFileAvgBalance() throws IOException;

    //    Метод который будет находить всех сотрудников у которых четное количество нулей балансе и четное количество букв а его имени
    List<Employee> findEmployeeZeroBalanceAname();
//    Создать метод который будет искать всех сотрудников и сохранять их файл при условии что должность
//    этих сотрудников менеджеры и увеличивать им зарплату назначение передан через аргумент
    void findEmpFileMenagerSalary(int salary) throws IOException;
}