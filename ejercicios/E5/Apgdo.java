package ejercicios.E5;

public class Apgdo implements IStteTelefono {
    @Override
    public void resourceManager(Telefono telefono) throws InterruptedException {
        System.out.println("INF-> ESTADO: Apagado - Resources: ");
        telefono.getCpu().setCapacityUtilizada(0);
        telefono.getRam().setCapacityUtilizada(0);
        telefono.getCpu().showInfo();
        telefono.getRam().showInfo();
        telefono.getProgramasAbiertos().showInfo();
    }
    
}
