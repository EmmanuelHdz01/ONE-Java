import com.audio.modelos.Audio;

public class Principal {
    public static void main(String[] args) {

        Audio audio = new Audio();
        audio.setNombre("Te quiero -  Hombres G");

        System.out.println(audio.getNombre());
    }
}