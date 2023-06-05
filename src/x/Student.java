package x;

public class Student extends Person{
    private int ControlNumber;
    private String career;
    private double generalAverage;




    public Student() {
    }

    public Student(String name, String lastname, String email, String address, int controlNumber, String career, double generalAverage) {
        super(name, lastname, email, address);
        this.ControlNumber = controlNumber;
        this.career = career;
        this.generalAverage = generalAverage;
    }



    public int getControlNumber() {
        return ControlNumber;
    }

    public void setControlNumber(int controlNumber) {
        ControlNumber = controlNumber;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public double getGeneralAverage() {
        return generalAverage;
    }

    public void setGeneralAverage(double generalAverage) {
        this.generalAverage = generalAverage;
    }



    public void soy(){
        System.out.println("soy un estudiante");
    }

    public String toString() {
        System.out.println("nombre:" + getName());
        System.out.println("apellido:"+getLastname());
        System.out.println("dirccion: "+getAddress());
        System.out.println("email: "+getEmail());
        System.out.println("carrera:"+getCareer());
        System.out.println("numero de control:"+getControlNumber());
        System.out.println("semestre:"+getGeneralAverage());
        return null;
    }
}
