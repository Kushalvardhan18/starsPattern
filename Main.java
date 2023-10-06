public class Main {
    public static void main(String[] args){
//        Print the Star pattern:->>>
//        for (int i=1;i<=5;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

//        Inverted star pattern:---->>
//        for (int i=5;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

//        half pyramid pattern:--->
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//        System.out.println("");
//        }
        //Print character pattern:-->>>
//        String[] Arr = new String[]{"A","B","C","D","E"};
//        for (int i=0;i<5;i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print(Arr[j]);
//            }
//            System.out.println("");
//        }
////        System.out.println(ascii);
//        for(int i=65;i<=70;i++){
//            for(int j=65;j<=i;j++){
//                int ascii=j;
//                char ch = (char)ascii;
//                System.out.print(ch);
//            }
//            System.out.println("");
//        }
        char ch ='A';
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }

            System.out.println("");
        }
        for(char chh ='A';chh<='F';chh++){
            for(char jhh ='A';jhh<=chh;jhh++){
                System.out.print(jhh);
            }
            System.out.println("");
        }
    }
}