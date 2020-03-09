package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        String waving = "";
        String value = "";
        String newstring = str.toLowerCase();

        String[] array = newstring.split("");
        int f = 0;
        String[] result = null;
        Character d = null;


        while (f <= str.length()) {
            for (int k = 0; k < array.length; k++) {
                if (array[k].indexOf(k) == k) {
                    String h = array[k].toUpperCase();
                    waving += h;
                } else {
                    value += array[k];
                }


                waving += value + ",";
                f++;
            }

        }

            result= waving.split(",");




        return result;
    }
}
