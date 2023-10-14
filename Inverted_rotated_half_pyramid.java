public class Inverted_rotated_half_pyramid {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
//
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                for(int k=5;k>=j;k--) {
                    System.out.print(" ");
                }
            System.out.println("*");
            }
            System.out.println("*");
        }
    }
}
