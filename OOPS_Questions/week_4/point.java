

public class point {
    private int x;
    private int y;
    public point(){
        x=0;
        y=0;
    }
    public point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public void setx(int x){
        this.x=x;
    }
    public void sety(int y){
        this.y=y;
    }
    public void setxy(int x,int y){
        this.x=x;
        this.y=y;
    }

    public void display(){
        System.out.println("point =("+x+","+y+")");
    }
    public static void main(String[] args) {
        point p1=new point();
        p1.display();

        point p2=new point(5,10);
        p2.display();

        p2.setxy(10,20);
        p2.display();

    }
    
}
