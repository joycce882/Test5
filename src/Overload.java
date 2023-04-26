import java.util.Arrays;



public class Overload {

    public void readBooks(String name){

        System.out.println("Book name :"+name);

    }



    public void readBooks(String name,String book){

        System.out.println("Book name :"+name+" "+book);

    }



    public void readBooks(String name,String[] book){

        System.out.println("Book name :"+name+" "+Arrays.toString(book));

    }



    public static void main(String[] args) {

// TODO Auto-generated method stub

        Overload al = new Overload();

        al.readBooks("红楼梦");

        al.readBooks("三国演义","水浒传");

        al.readBooks("山河令", new String[]{"斗罗大陆","司藤","庆余年"});

    }



}