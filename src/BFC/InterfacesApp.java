package BFC;

public class InterfacesApp {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante(
                "BRYAN",
                "FIGUEROA",
                21,
                "TEC",
                "Informatica",
                "6to"
        );

        Empleado empleado = new Empleado(
                "MARIA",
                "ARANDA",
                30,
                "Google",
                "Senior Programmer",
                "150000"
        );

        EstudianteTrabajador estudianteTrabajador = new EstudianteTrabajador(
                "JOSE",
                "HERNANDEZ",
                25,
                "UNLP",
                "Informatica",
                "9no",
                "Facebook",
                "Junior Programmer",
                "100000"
        );

        System.out.println(estudiante.toString());
        System.out.println(empleado.toString());
        System.out.println(estudianteTrabajador.toString());
    }
}
