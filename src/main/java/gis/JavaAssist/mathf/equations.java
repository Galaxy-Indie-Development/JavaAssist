package gis.JavaAssist.mathf;

public class equations {

    public double sqsum(double x, double y){
        return Math.pow((x + y), 2);

    }

    public double sqwhole(double x, double y){
        return Math.pow((x - y), 2);

    }

    public double cubesum(double x, double y){
        return Math.pow((x + y), 3);

    }

    public double cubewhole(double x, double y){
        return Math.pow((x - y),3);

    }

    public double expForm(double x){
        return Math.pow((x+1), 3);
    }


}
