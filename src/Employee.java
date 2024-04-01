import org.w3c.dom.ls.LSOutput;

public class Employee {
    private String name;
    private String email = "не задан";
    private int tel;

    Employee(String name,String email) {
        this.name = name;
        this.email = email;
    }
    Employee(String name, int tel){
        this.name = name;
        this.tel = tel;
    }
    Employee(String name, String email, int tel) {
        this.name = name;
        this.email = email;
        this.tel = tel;
    }
    public void printInfo () {
        System.out.println("Имя:" + " " + name);
        System.out.println("E-mail:" + " " + email);
        System.out.println("Телефон:" + " " + ((tel > 0)? tel : "Нет тел."));
        System.out.println();
    }



}
