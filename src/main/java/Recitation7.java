/**
 * Recitation7 is a class for completing
 *  Reciation 7 in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class Recitation7
{
    // define your constants after this comment
    public static void main(String[] args) {

    }
    private static String repeatString(char aChar, int numOfRepetitions) {
        String str = "";
        for(int count = 0; count < numOfRepetitions; count++) {
            str += aChar;
        }
        return str;
    }


    public static String leftRightTriangle(int height)
    {
        String str = "";
        //add your code here
        for (int row = 0; row < height; row++) {
            for (int x = 0; x <= row; x++) {
                str += "*";
            }
            str += "\n";
        }
        return str;
    }

    public static String rightRightTriangle(int height)
    {
        String str = "";
        //add your code here
        for (int row = 0; row < height; row++) {
            for(int y = 0; y < height - row - 1; y++){
                str += " ";
            }
            for (int x = 0; x <= row; x++) {
                str += "*";
            }
            str += "\n";
        }
        return str;
    }


    public static String circle(int radius)
    {
        String str = "";
        for(int rad = radius; rad >= -(radius-1); rad--) {
            int x = (int) Math.sqrt(radius * radius - rad * rad);
            int y = (radius * 2 - (x * 2));
            if (y != radius * 2){
                str += " ".repeat(Math.max(0,y / 2));
                for(int z = x * 2; z * 2 > 0; z--) str += "*";
                str += "\n";
            }
        }
            return str;
    }
}
