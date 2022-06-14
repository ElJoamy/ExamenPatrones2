package ejercicios.E5;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Telefono telefono = new Telefono();
        telefono.setState(new Encenddo());
        telefono.resourceManager();
        /*telefono.setState(new Apgdo());
        telefono.resourceManager();
        telefono.setState(new Reinico());
        telefono.resourceManager();*/
    }
}