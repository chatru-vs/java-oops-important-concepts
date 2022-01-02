package oops;
public class Student {
    //data members: instance variable
    int studentId;
    String studentName;
    String studentCity;
    private int rollNumbers;
//getter
    public int getRollNumbers(){
        return  this.rollNumbers;
    }
    //setter
    public void setRollNumbers(int rollNumbers){
        if(rollNumbers<=0){
            throw new IllegalArgumentException("Invalid arguments");
        }
        this.rollNumbers=rollNumbers;
    }
    //Non parametized constructor
    public Student(int i, String studentName ){
        System.out.println("Creating object : non Parametrized");
    }

    public Student(){
        this(56, "Sarita", "Bihar");
        System.out.println("Parmetrized construction : (int) st");
    }
    //This keyword is used to identify or differenciate the current object variable.
    // this() is user to invoke current class constructor
    //super() is user to invoke immediate parent class constructor. and super is used to access immediate perent class variable
    public Student(int i, String studentName, String studentCity){
        studentId=i;
        this.studentName = studentName;
        this.studentCity = studentCity;
    }
    //Behaviour : Member method: methods: (functions)
    public void study() {
        System.out.println(studentName + " is studying");
        System.out.println(studentCity + " he is liviing");
    }
    public void showFullDetails(){
        System.out.println("my name is " + studentName);
        System.out.println("my id is " + studentId);
        System.out.println("Student city is " + studentCity);
        System.out.println(this.rollNumbers);
    }
}
