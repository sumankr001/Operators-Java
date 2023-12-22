public class Q11 {
    public static void main(String[] args ){

        int x = 20, y = 30, z = 50; 
        x += y; // x = x + y 
        y -= x + z; // y = y - (x+z) 
        z *= x * y; 
        System.out.println("x = " +x );
    }
}
