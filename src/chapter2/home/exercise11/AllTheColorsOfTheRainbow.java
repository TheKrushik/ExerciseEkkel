package chapter2.home.exercise11;

public class AllTheColorsOfTheRainbow {

    int anIntegerRepresentingColors;

    void changeTheHueOfTheColor(int newHue){
        anIntegerRepresentingColors = newHue;
    }

    public static void main (String [] args){
        AllTheColorsOfTheRainbow allTheColorsOfTheRainbow = new AllTheColorsOfTheRainbow();
        allTheColorsOfTheRainbow.changeTheHueOfTheColor(111);
    }
}
