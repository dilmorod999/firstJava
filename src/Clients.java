public class Clients {
    private Integer id;
    private String name;
    private int salary;
    private String company;
    Clients(Integer id, String name , int salary, String company){
        this.id=id;
        this.name= name;
        this.salary=salary;
        this.company=company;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Clients{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                '}';
    }
}
