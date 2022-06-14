package ejercicios.E3;

public class Notify {
    private String videos;
    private String imagenes;
    private String type;

    public Notify(String videos, String imagenes, String type) {
        this.videos = videos;
        this.imagenes = imagenes;
        this.type = type;
    }

    public String getVideos() {
        return videos;
    }

    public void setVideos(String videos) {
        this.videos = videos;
    }
    
    public String getImagenes() {
        return imagenes;
    }

    public void setImagenes(String imagenes) {
        this.imagenes = imagenes;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void showInfo() {
        System.out.println("<---Notificaion Nueva--->");
        System.out.println("Videos: " + videos);
        System.out.println("Imagenes: " + imagenes);
        System.out.println();
    }
}
