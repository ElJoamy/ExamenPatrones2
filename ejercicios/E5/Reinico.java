package ejercicios.E5;

public class Reinico implements IStteTelefono {
    @Override
    public void resourceManager(Telefono telefono) throws InterruptedException {
        System.out.println("INF-> ESTADO: Reinicio - Resources: ");
        telefono.getCpu().setCapacityUtilizada(0);
        telefono.getRam().setCapacityUtilizada(0);
        telefono.getProgramasAbiertos().setProgramas("CERRANDO LOS PROGRMAS");
        telefono.getCpu().showInfo();
        telefono.getRam().showInfo();
        telefono.getProgramasAbiertos().showInfo();
    }
    
}
