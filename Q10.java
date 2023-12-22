public class Q10 {
    public static void main(String[] args) {
        int x = 1, y = 2, z = 5; 
        System.out.println("x: " +(!((x + 2) == (1 + 2)))); 
        System.out.println("y: " +(!(y == z))); 
        System.out.println("z>x: " +(!(z > x))); 
       
       // Note: if any of the opertion in AND is false then o/p will be false
       
        System.out.println((x > y) &&(y < 3 << z) && !((z - 3) == 1));

        //Note : if any of the opertion is true then the o/p will be the falls
        System.out.println((x == y) || ((y + 5) < z) || ((z - 3) == 1));
    }
}
