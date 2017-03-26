package nl.hu.iac.rest;

import com.sun.corba.se.impl.orb.ParserTable;
import nl.hu.iac.service.ServiceProvider;

import java.util.Arrays;

/**
 * Created by Daan on 25-3-2017.
 */
public class test {
    public static void main(String[] args) {
        String list;

        list = "1 2 2  4 43 2 2 3 3 436 6 34 36 twaalf";

        ServiceProvider.getTrackService().getStd(list);
        String[] array = list.split("\\s+",-1);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (isInteger(array[i])){
                System.out.println(Integer.parseInt(array[i]));
                sum += Integer.parseInt(array[i]);
            } else {
                System.out.println("Zorg ervoor dat er een lijst met nummers wordt gegeven die gesplitst zijn door spaties.");
            }
        }
        String mean = Double.toString(sum / array.length);
        System.out.println(mean);
    }
    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        } catch(NullPointerException e) {
            return false;
        }
        return true;
    }
}