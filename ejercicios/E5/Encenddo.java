package ejercicios.E5;

public class Encenddo implements IStteTelefono {
    @Override
    public void resourceManager(Telefono telefono) throws InterruptedException {
        System.out.println("INF-> ESTADO: Encendido - Resources: ");
        int currentValue1 = telefono.getCpu().getCapacityUtilizada();
        telefono.encender();
    }
}
