package oops;

abstract  class abstjava {
    public void cal(){
        System.out.println("calculation results");
    }
    //abstract method
    abstract public void launchRocket();
}

class Start{
    public static void main(String[] args) {

        abstjava abstjava = new abstjava() {
            @Override
            public void launchRocket() {

            }
        };
    }
}
