package OOPs;

public class basic {
    public static void main(String[] args) {
       // object creation
        Student s1 = new Student(20,"lala",45);
        System.out.println(s1.age);
        System.out.println(s1.name);
        System.out.println(s1.marks);

        Student s2 = new Student();
        System.out.println(s2.marks);
        s1.greeting();
    }
}
//template of class
class Student{
    int age;
    String name;
    int marks;


    void greeting(){
        System.out.println("hello my name is" +" "+ this.name);
    }

    Student(){
        this.age = 20;
        this.name = "abhi";
        this.marks =56;
    }
    Student(int age,String name, int marks){
        this.age = age;
        this.name = name;
        this.marks = marks;

    }
}

