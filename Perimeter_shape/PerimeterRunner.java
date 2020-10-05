public class PerimeterRunner
{
    public double getperimeter(Shape s)
    {
        int TotalPerim = 0;
        
    }
    public void testPerimeter()
    {
        FileResource fr = new FileResource();
        Shape s= new Shape(fr);
        double length = getperimeter(s);
        System.out.println("Perimeter= "+length);
        
    }
    public static void main(String args[])
    {
        PerimeterRunner Pr= new PerimeterRunner();
        Pr.testPerimeter();
    }
    
    
}
