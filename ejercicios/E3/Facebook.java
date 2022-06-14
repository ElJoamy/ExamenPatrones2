package ejercicios.E3;

import java.util.ArrayList;
import java.util.List;

public class Facebook implements IFacebook{
    private List<Notify> notifyL = new ArrayList<>();
    private List<IUser> userL = new ArrayList<>();

    public Facebook(){}

    public void notificacion(Notify notify){
        notifyL.add(notify);
        notifyObservers(notify);
    }

    @Override
    public void attach(IUser observer) {
        userL.add(observer);
    }

    @Override
    public void detach(IUser observer) {
        userL.remove(observer);
    }

    @Override
    public void notifyObservers(Notify notify) {
        for(IUser user : userL){
            if(user.getPreferNoti().equals(notify.getType())){
                user.actualizacion1("Hay nuevas notfiacones",notify);
            }else{
                user.actualizacion2("Nuevas notificaciones",notify);
            }
        }
    }


}
