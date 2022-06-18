package gis.JavaAssist.conversion;

/**
 * @author Zachary Nichelson
 * Created on 6/14/2022
 */
public class conv {
    temp temp = new temp();

    public  conv(){

    }

    public double cvtTemp(double val1, boolean toF){
        if(toF){
            return temp.convertF(val1);
        }
        else{
            return temp.convertC(val1);
        }
    }

}
