package oops;

public class MyChild extends abstjava{

    @Override
    public void launchRocket() {
        System.out.println("MyChild class is going to launch rocket from Nasa");
    }

     class Start{
         public void main(String[] args) {

//             MyChild myChild = new MyChild();
//             myChild.launchRocket();
//             myChild.cal();

             abstjava ob = new MyChild();
             ob.cal();
             ob.launchRocket();
         }
     }
}
