package ejercicios.E2;

public class Client {
    public static void main(String[] args){
        ChatComunn  mediator = new ChatComunn();

        Estudiante estudiante = new Estudiante(mediator);
        estudiante
        estudiante.setNombre("Jorge");

        Administrativos administrativo = new Administrativos(mediator);
        administrativo.setNombre("Juan");
        administrativo.setCargo("Administrativo");
    }
}
