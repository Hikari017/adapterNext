package pl.japonics;

/**
 * Created by Justyna on 14.07.2017.
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlyer advancedFilmPlyer;
    public MediaAdapter(String filmType){
        if (filmType.equalsIgnoreCase("avi")){
            advancedFilmPlyer = new AviPlayer();
        }else  if (filmType.equalsIgnoreCase("3GP")){
            advancedFilmPlyer = new threeGPplayer();
        }
    }
    @Override
    public void play(String filmType, String fileName) {
        if (filmType.equalsIgnoreCase("avi")){
            advancedFilmPlyer.playAvi(fileName);
        }else if (filmType.equalsIgnoreCase("3GP")){
            advancedFilmPlyer.play3GP(fileName);
        }

    }
}
