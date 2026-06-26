class outer{
    public void display(){
        System.out.println("this is outer display");
    }
    class inner{
        public void display(){
            System.out.println("this is inner display");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        outer out=new outer();
        out.display();
        outer.inner in=out.new inner();
        in.display();
    }
    
}
