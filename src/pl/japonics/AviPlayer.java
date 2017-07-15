package pl.japonics;

/**
 * Created by Justyna on 14.07.2017.
 */
public class AviPlayer implements AdvancedMediaPlyer {
    @Override
    public void playAvi(String fileName) {
        System.out.println("Playing AVI file." + fileName);

    }

    @Override
    public void play3GP(String fileName) {


    }
}
