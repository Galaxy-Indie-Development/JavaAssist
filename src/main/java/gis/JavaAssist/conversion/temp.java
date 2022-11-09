package gis.JavaAssist.conversion;

/**
 * @author Zachary Nichelson
 * Created on  06/16/22\
 */
public class temp {

    /**
     *
     * @param f converts this value to celsius
     * @return returns f
     */
    public double convertF(double f){
        double c = (5*(f-32)) / 9;
        return c;
    }

    /**
     *
     * @param c converts this value to farenheit
     * @return returns c
     */
    public double convertC(double c){
        double f = ((c * 9)/5)+32;
        return f;
    }


}
