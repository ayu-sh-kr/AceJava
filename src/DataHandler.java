import java.util.ArrayList;
import java.util.Scanner;


class Student{
    private int id;
    private String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }


}
public class DataHandler{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<Student> list = new ArrayList<>();

        System.out.println("Enter Student id and name");
        String read;
        while(!(read = reader.nextLine()).equals("exit")){
            String[] data = read.split(" ");
            list.add(new Student(Integer.parseInt(data[0]), data[1]));
        }
        System.out.println("id" + "\t" + "name");
        for(Student std: list){
            System.out.println(std.getId() + "\t" + std.getName());
        }
        reader.close();
    }
}