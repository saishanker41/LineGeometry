public class LineComparisonComputaion {
   public static void main(String[] args) {

      System.out.println("Welcome to Line Comparison Program on Master Branch");

      int x1,x2,y1,y2;
      double distance;
      x1=1; y1=1; x2=4; y2=4;
      distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
            System.out.println("distance between" + "("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+distance);


   }
}
