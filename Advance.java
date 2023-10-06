public class Advance {
    public static void main(String[] args) {

//        Inverted and rotated half pyramid star pattern :-->
//        for (int i=1;i<=5;i++){
//            for (int j=5;j>=i;j--){
//                System.out.print(" ");
//            }
//            for (int k=1;k<=i;k++){
//            System.out.print("*");
//        }
//            System.out.println("");}
        for (int i = 5; i >= 1; i--) {
            if (i == 5) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                if (i == 1) {
                    for (int j = 5; j >= i; j--) {
                        System.out.print("*");
                    }}
                else
                {
                    for (int k = 1; k <= i; k++) {
                        System.out.print("*  ");
                        System.out.print("  *");
                    }
                    System.out.println(" ");
                }

            }
        }
    }}