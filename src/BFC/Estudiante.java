package BFC;

public class Estudiante extends Persona implements Becable {
    private String university;
    private String career;
    private String year;

    public Estudiante(){}

    public Estudiante(String name, String lastName, int age, String university, String career, String year){
        super(name, lastName, age);
        this.university = university;
        this.career = career;
        this.year = year;
    }

    public Boolean becable(){
        return true;
    }

    public String getUniversity(){
        return university;
    }

    public void setUniversity(String university){
        this.university = university;
    }

    public String getCareer(){
        return career;
    }

    public void setCareer(String career){
        this.career = career;
    }

    public String getYear(){
        return year;
    }

    public void setYear(String year){
        this.year = year;
    }

    public String toString(){
        return "Nombre: " + getName() +
                "\nApellido: " + getLastName() +
                "\nEdad: " + getAge() +
                "\nUniversidad: " + getUniversity() +
                "\nCarrera: " + getCareer() +
                "\nAño: " + getYear() +
                "\nBecable: " + (becable() ? "Si" : "No");
    }
}
