class DataSwap{

    public int a;

    public int b;

}



public class SwapValue {

//第一种交换方法

    public static void swap1(int a,int b){

        int temp =a;

        a=b;

        b=temp;

        System.out.println("交换后，a="+a+",b="+b);

    }

//第二种交换方法

    public static void swap2(DataSwap dw){

        int temp =dw.a;

        dw.a=dw.b;

        dw.b=temp;

        System.out.println("交换后，dw.a="+dw.a+",dw.b="+dw.b);

    }



    public static void main(String[] args) {

        int x=16;

        int y=89;

        swap1(x,y);

        System.out.println("交换结束后，x="+x+",y="+y);



        DataSwap dw=new DataSwap();

        dw.a=6;

        dw.b=9;

        swap2(dw);

        System.out.println("交换结束后，dw.a="+dw.a+",dw.b="+dw.b);

    }

}