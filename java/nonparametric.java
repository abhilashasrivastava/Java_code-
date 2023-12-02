class Student{
    String name;
    public void studentInfo(){
        System.out.println(this.name);
    }
      //non parametric constructor:   Student(){
       //     System.out.println("yeppp");
   // }
   Student(String name ){
    this.name=name;
   }

}public class nonparametric {
    public static void main(String[] args){
        Student s1 = new Student("abhi");
       // s1.name="Abhilaha";
        s1.studentInfo();
    }
    
}
