
public class Graph {
    public static void main(String[] args) {
        String map = "Mama mila ramy";
        System.out.println(inrevers(map));
        System.out.println(recurs(map));
    }
    public static String inrevers(String x) {
        String z = "";
        for (int i = x.length() -1; i >= 0; i--) {
            z += x.charAt(i);
        }
        return z;
    }

    public static String recurs(String z){
        if(z.length() == 1){
            return z;
        }
        else {
            return z.substring(z.length() -1) + recurs(z.substring(0, z.length() -1));
        }
    }
}
