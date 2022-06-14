package ejercicios.E2;

public class Client {
    public static void main(String[] args){
        ChatComunn  mediator = new ChatComunn();

        Estudiante estudiante = new Estudiante(mediator);
        estudiante.setNumero(13579);
        estudiante.setMatricula("12345");
        estudiante.setNombre("Jorge");
        estudiante.setTipo("Estudiante");
        estudiante.setCi("123456789");

        Docentes docente = new Docentes(mediator);
        docente.setCi("1234445");
        docente.setNombre("Pedro");
        docente.setTipo("Docente");

        Administrativos administrativo = new Administrativos(mediator);
        administrativo.setNombre("Juan");
        administrativo.setCargo("Administrativo");
        administrativo.setTipo("Administrativos");

        mediator.addChat(estudiante);
        mediator.addChat(docente);
        mediator.addChat(administrativo);

        administrativo.send("Hola a todos");
    }
}
