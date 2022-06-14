package ejercicios.E5;

import java.util.Random;

public class Encenddo implements IStteTelefono {
    @Override
    public void resourceManager(Telefono telefono) throws InterruptedException {
        System.out.println("INF-> ESTADO: Encendido - Resources: ");
        int currentValue1 = telefono.getCpu().getCapacityUtilizada();
        int cantPrograms = new Random().nextInt(10);
        telefono.getProgramasAbiertos().setProgramas(cantPrograms + " PROGRAMAS" );
        System.out.println(telefono.getProgramasAbiertos().getProgramas());
        int currentValue2 = telefono.getRam().getCapacityUtilizada();
        while(currentValue1 < 100){
            telefono.getCpu().showInfo();
            telefono.getRam().showInfo();
            telefono.getProgramasAbiertos().showInfo();
            Thread.sleep(5000);
            currentValue1 = currentValue1 + currentValue2 + cantPrograms * 5;
            telefono.getCpu().setCapacityUtilizada(currentValue1);
        }
        telefono.getCpu().setCapacityUtilizada(100);
        System.out.println("Estado de uso al 100% ");
    }
}
