public class Box {
    double width;
    double height;
     double depth;
       Box(double w,double h,double d)
      {
          width=w;
          height=h;
          depth=d;
      }
      double volume()
      {
          return width*height*depth;
      }
    public static void main(String args[])
    {
        MyClass m = new MyClass(20.0,10.0,10.0);
        System.out.println(m.volume());
    }
}
