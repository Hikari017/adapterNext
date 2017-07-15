package pl.japonics;

/**
 * Created by Justyna on 14.07.2017.
 */

    public class AdapterPatternDemo {
        public static void main(String[] args) {
          FilmPlayer filmPlayer = new FilmPlayer();

            filmPlayer.play("3gp", "beyond the horizon.avi");
            filmPlayer.play("mp4", "alone.mp4");
            filmPlayer.play("vlc", "far far away.vlc");
            filmPlayer.play("avi", "mind me.avi");
        }
    }

