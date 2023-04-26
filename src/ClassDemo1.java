
    public class ClassDemo1 {

        int a;

        int b;

        public ClassDemo1(int a,int b){

            this.a=a;

            this.b=b;

            System.out.println("ClassDemo1被构建了！");

        }

        public void display(){

            System.out.println("a = "+a+"b = "+b);

        }

        public static void main(String[] args) {

            ClassDemo1 cd = new ClassDemo1(12,25);

            cd.display();

            cd = new ClassDemo1(45, 67);

            cd.display();

        }

    }

