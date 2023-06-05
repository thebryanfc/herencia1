package x;

public class SchoolApp extends Person{
    public static void main(String[] args) {
        Student student1 = new Student("Bryan", "Figueroa", "ingbryanfigueroa@gmail.com", "Infonavit Iguala Gro.",20670348,"informatica",8.5);

        Teacher teacher1 = new Teacher( "javi", "Morales", "javi@gmail.com", "Ruffo Figueroa");

        System.out.println("El nombre del student1 = " + student1.getName() + " " + student1.getLastname());
         System.out.println("El nombre del teacher1 = " + teacher1. getName() + " " + teacher1.getLastname());

        student1.setControlNumber(123456);
        System.out.println("El número de control de " + student1.getName() + " " + student1.getControlNumber());


        //Probando la sobre carga de métodos
        System.out.println("Método toString() de x.Student: " + student1.toString());
        System.out.println("Método toString() de x.Teacher: " + teacher1  .toString());
        student1.soy();
        student1.toString();

        System.out.println("");

        teacher1.soy();
        teacher1.toString();

    }
}

