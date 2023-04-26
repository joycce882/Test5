public class BoxTest {
    public static void main(String[] args)
    {
        Box b = new Box(20, 10,30);
        b.volume();
    }

}
class Box
{
    int length;
    int width;
    int height;
    public Box(int length, int width, int height)
    {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public void volume()
    {
        System.out.println("长方体的面积为: "+length*width*height);
    }
}
