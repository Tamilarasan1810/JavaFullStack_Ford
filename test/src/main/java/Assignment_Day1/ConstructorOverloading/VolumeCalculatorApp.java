package Assignment_Day1.ConstructorOverloading;

class ThreeDimenssionalShapes
{
    double width,height,depth;
    public ThreeDimenssionalShapes()
    {

    }
    public ThreeDimenssionalShapes(double width,double height,double depth)
    {
        this.depth=depth;
        this.height=height;
        this.width=width;
    }
    public ThreeDimenssionalShapes(double dim)
    {
        this.width=dim;
        this.height=dim;
        this.depth=dim;
    }
    public double calculateVolume()
    {
        return depth*height*width;
    }


}

public class VolumeCalculatorApp {
    public static void main(String[] args) {
        ThreeDimenssionalShapes shape1 = new ThreeDimenssionalShapes(5,6,7);
        ThreeDimenssionalShapes shape2 = new ThreeDimenssionalShapes();
        ThreeDimenssionalShapes shape3 = new ThreeDimenssionalShapes(8);
        System.out.println("Volume of shape1: "+shape1.calculateVolume());
        System.out.println("Volume of shape2: "+shape2.calculateVolume());
        System.out.println("Volume of shape3: "+shape3.calculateVolume());
    }
}
