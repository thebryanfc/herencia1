package x;

public class Teacher extends Person{
    public Teacher() {
    }

    public Teacher(String name, String lastname, String email, String address) {
        super(name, lastname, email, address);
    }
    public void soy(){
        System.out.println("soy un maestro");
    }
    public String toString(){
        System.out.println("nombre:"+getName());
        System.out.println("apellido:"+getLastname());
        System.out.println("email: "+getEmail());
        System.out.println("direccion:"+getAddress());

        return null;
    }
}
