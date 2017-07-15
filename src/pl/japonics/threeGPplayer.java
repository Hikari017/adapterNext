package pl.japonics;

/**
 * Created by Justyna on 14.07.2017.
 */
public class threeGPplayer implements AdvancedMediaPlyer{
    @Override
    public void playAvi(String fileName) {

    }

    @Override
    public void play3GP(String fileName) {
        System.out.println("Playing 3GP file"+ fileName);

    }
}
