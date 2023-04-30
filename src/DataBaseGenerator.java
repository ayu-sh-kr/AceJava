import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

class Inheritance extends Student{

    private String address;
    private UUID uid;
    public Inheritance(int id, String name, String address) {
        super(id, name);
        this.address = address;
        this.uid = UUID.randomUUID();
    }

    public UUID getUid() {
        return uid;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}

public class DataBaseGenerator{
    private List<Inheritance> lists = new ArrayList<>();
    
    public DataBaseGenerator(){
        lists.addAll(List.of(
            new Inheritance(2100, "Ayush", "Ghaziabad, UP 201206"),
        new Inheritance(2101, "Anurag", "Noida, Sector-4, UP"),
        new Inheritance(2102, "Udit", "Ghaziabad, UP 201201"),
        new Inheritance(2103, "Rajesh", "Meerut, UP 211103")
        )
        );
    }


    public void setLists(List<Inheritance> lists) {
        this.lists = lists;
    }

    public List<Inheritance> getLists() {
        return lists;
    }

    public static void main(String[] args) {
        DataBaseGenerator dbs = new DataBaseGenerator();
        for(Inheritance inh: dbs.getLists()){
            System.out.println(inh.getUid() + "\t" + inh.getName() + "\t" + inh.getAddress());
        }
    }
}
