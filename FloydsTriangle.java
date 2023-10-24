public class FloydsTriangle {
    public static void floyds() {
       for (int i =0;i<=1;i++){
           for (int j =1+i;j<=11;j++){
               for (int k =1;k<=j;k++){
               System.out.print(k);

               }
           System.out.println("");
           }
       }
    }

    public static void main(String[] args) {
        floyds();

    }
}
