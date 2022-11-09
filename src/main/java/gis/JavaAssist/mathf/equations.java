package gis.JavaAssist.mathf;

/**
 * @author Zachary Nichelson
 * Created on 11/8/2022
 */
public class equations {

    /**
     *
     * @param x
     * @param y
     * @return Math.pow((x+y), 2)
     */
    public double sqsum(double x, double y){
        return Math.pow((x + y), 2);

    }

    /**
     *
     * @param x
     * @param y
     * @return Math.pow((x-y),2)
     */
    public double sqwhole(double x, double y){
        return Math.pow((x - y), 2);

    }

    /**
     *
     * @param x
     * @param y
     * @return Math.pow((x+y), 3)
     */
    public double cubesum(double x, double y){
        return Math.pow((x + y), 3);

    }

    /**
     *
     * @param x
     * @param y
     * @return Math.pow((x-y), 3)
     */
    public double cubewhole(double x, double y){
        return Math.pow((x - y),3);

    }

    /**
     *
     * @param x
     * @return Math.pow((x+1), 3)
     */
    public double expForm(double x){
        return Math.pow((x+1), 3);
    }


}
