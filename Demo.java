package oops;
// getter and setters used to access and modify the class variables
public class Demo {
    public static void main(String[] args) {
        Student st1;
        st1=new Student(); // to allocate dynamic memory in java program
        st1.studentName = "Ram";
        st1.studentId = 11;
        st1.studentCity="Delhi";
        st1.setRollNumbers(45);
        st1.study();
        st1.showFullDetails();
        //constructor overloading
        Student st2 = new StudentBuilder().setI(741).setStudentName("shyam").setStudentCity("Mumbai").createStudent();
//        st2.studentName="Sristi";
//        st2.studentId=15;
//        st2.studentCity="Mumbai";
        st2.study();
        st2.showFullDetails();
        Dog d1=new Dog();
        d1.eating();
        System.out.println(d1.color);




    }
}
