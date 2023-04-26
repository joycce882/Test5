class Person{

    String name;

    int age;

//以下为无参数构造器

    public Person(){

    }

//以下为有参数构造器

    public Person(String name, int age) {

        this.name = name;

        this.age = age;

    }

    public void display(){

        System.out.println("姓名："+name+",年龄："+age);

    }

    public void eat(){

        System.out.println("所有人都要吃莽莽！");

    }

}



public class TestPerson {



    public static void main(String[] args) {

// 创建Person类对象并测试

        Person p1 = new Person();

        p1.display();p1.eat();//代码1

        p1.name="李白";

        p1.age=25;

        p1.display();p1.eat();

        Person p2 = new Person("杜甫", 33);

        p2.display();

        p2.eat();

    }

}