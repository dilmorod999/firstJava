import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImple implements EmployeeRepository {
    List<Employee> employees;

    EmployeeRepositoryImple(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> employees() {
        return employees;
    }

    //Метод который будет находить всех сотрудников у которых четное количество букв а в первой половине его имени и возвращать их
    @Override
    public List<Employee> findCountEmployeAfirstPart() {
        List<Employee> result = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            int count = 0;
            String firstpart = employees.get(i).getName().substring(0, employees.get(i).getName().length() / 2);
            for (int j = 0; j < firstpart.length(); j++) {
                if (firstpart.charAt(j) == 'a') {
                    count++;
                }
            }
            if (count % 2 == 0 && count > 0) {
                result.add(employees.get(i));
            }
        }
        return result;
    }

    //Метод который будет находить общую сумму всех балансов сотрудников если баланс есть три нуля в любом месте
    @Override
    public int findTotalSalaryHaveThree0() {
        int total = 0;
        for (int i = 0; i < employees.size(); i++) {
            int count = 0;
            String salary = employees.get(i).getSalary() + "";
            for (int j = 0; j < salary.length(); j++) {
                if (salary.charAt(j) == '0') {
                    count++;
                }
            }
            if (count == 3) {
                total = total + employees.get(i).getSalary();
            }
        }
        return total;
    }

    //Метод который будет находить общую сумму сохранять её файл а возвращайтесь методы среднюю сумму баланса
    @Override
    public void findTotalSalaryFileAvgBalance() throws IOException {
        File file = new File("Employee.txt");
        FileWriter fileWriter = new FileWriter(file);
        int total = 0;
        for (int i = 0; i < employees.size(); i++) {
            total = total + employees.get(i).getSalary();
        }
        fileWriter.write(total / employees.size() + "\n");
        fileWriter.flush();
        fileWriter.close();
    }

    //Метод который будет находить всех сотрудников у которых четное количество нулей балансе и четное количество букв а его имени
    @Override
    public List<Employee> findEmployeeZeroBalanceAname() {
        List<Employee> result = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            String salary = employees.get(i).getSalary() + "";
            String name = employees.get(i).getName();
            int countS = 0;
            int countN = 0;
            for (int j = 0; j < salary.length(); j++) {
                if (salary.charAt(j) == '0') {
                    countS++;
                }
            }
            for (int j = 0; j < name.length(); j++) {
                if (name.charAt(j) == 'a') {
                    countN++;
                }
            }
            if (countS % 2 == 0 && countN % 2 == 0) {
                result.add(employees.get(i));
            }
        }
        return result;
    }

    //    Создать метод который будет искать всех сотрудников и сохранять их файл при условии что должность
//    этих сотрудников менеджеры и увеличивать им зарплату назначение передан через аргумент
    @Override
    public void findEmpFileMenagerSalary(int salary) throws IOException {
        File file = new File("Employee.txt");
        FileWriter fileWriter = new FileWriter(file);
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getPosition().equals("menager")) {
                employees.get(i).setSalary(employees.get(i).getSalary() * salary);
                fileWriter.write(employees.get(i) + "\n");
            }
        }
        fileWriter.flush();
        fileWriter.close();
    }
}