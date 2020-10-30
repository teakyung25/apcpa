// import java.lang.Math;

public class Color {
    private int [] rgb = new int[3];
    private int [] hex = new int[3];
    
    public Color () {
        randomColor();
    }

    public Color (int red, int green, int blue) {
        rgb[0] = makeValid(red);
        rgb[1] = makeValid(green);
        rgb[2] = makeValid(blue);
    }
    
    public Color (String hex) {
        setRed(Integer.parseInt(hex.substring(1,3),16));
        setGreen(Integer.parseInt(hex.substring(3,5),16));
        setBlue(Integer.parseInt(hex.substring(5,7),16));
    }

    public void randomColor () {
        setRed(randNum());
        setGreen(randNum());
        setBlue(randNum());
    }

    public void darkenColor (double percent){
        setRed(makeValid((int)(rgb[0] - rgb[0]*(percent/100))));
        setGreen(makeValid((int)(rgb[1] - rgb[1]*(percent/100))));
        setBlue(makeValid((int)(rgb[2] - rgb[2]*(percent/100))));
    }

    public void ligtenColor (double percent){
        setRed(makeValid((int)(rgb[0] + rgb[0]*(percent/100))));
        setGreen(makeValid((int)(rgb[1] + rgb[1]*(percent/100))));
        setBlue(makeValid((int)(rgb[2] + rgb[2]*(percent/100))));
    }

    public int [] getSummary () {
        return rgb;
    }

    public void setRed (int red) {
        rgb[0] = red;
    }

    public void setGreen (int green) {
        rgb[1] = green;
    }

    public void setBlue (int blue) {
        rgb[2] = blue;
    }

    public int getRed () {
        return rgb[0];
    }

    public int getGreen () {
        return rgb[1];
    }

    public int getBlue () {
        return rgb[2];
    }


    private int randNum () {
        double rand = Math.random();
        // System.out.print(rand);
        return (int) (rand * ((255 - 0) + 0));
    } 
    
    private int makeValid(int num) {
        if(num > 255) {
            return 255;
        } else if(num < 0) {
            return 0;
        }
        return num;
    }
}