public class BocTest2 {
    public static void main(String[] args)
    {
        Box2 b = new Box2();
        b.setter(10,10,10);
        //System.out.println("长方体的面积为: "+b.getHeight()*b.getLength()*b.getWidth());
        b.volume(b.getLength(),b.getWidth(),b.getHeight());
    }

}
class Box2
{
    private int length;
    private int width;
    private int height;
    public void setter(int length, int width, int height)
    {
        this.height = height;
        this.length = length;
        this.width = width;
    }
    public int getLength()
    {
        return length;
    }
    public int getWidth()
    {
        return width;
    }
    public  int getHeight()
    {
        return height;
    }
    public void volume(int length1, int width1,int height1)
    {
        System.out.println("长方体的面积为: "+length1*width1*height1);
    }
}
