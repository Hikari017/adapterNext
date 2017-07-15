package pl.japonics;

/**
 * Created by Justyna on 14.07.2017.
 */
public class FilmPlayer implements  MediaPlayer {
MediaAdapter mediaAdapter;
    @Override
    public void play(String filmType, String fileName) {

        if(filmType.equalsIgnoreCase("avi")){
            System.out.println("Playing avi file. Name: " + fileName);
        }
        else if(filmType.equalsIgnoreCase("vlc") || filmType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(filmType);
            mediaAdapter.play(filmType, fileName);
        }else{
            System.out.println("Invalid file" + filmType+"format not suppoerted");
        }

    }
}
