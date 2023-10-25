public class FloydsTriangle {
    public static void floyds(int n) {
        int counter =0;
     for(int i=1;i<=n;i++){
         for(int j =0;j<i;j++){
             counter = counter +1;
             System.out.print(counter +" ");
         }
         System.out.println("");
     }
    }

    public static void main(String[] args) {
        floyds(6);

    }
}
