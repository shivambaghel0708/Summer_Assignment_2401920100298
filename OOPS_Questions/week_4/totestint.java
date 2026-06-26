interface test{

    int square(int num);
}

class arithmetic implements test{
    public int square(int num){
        return num*num;
    }
}
public class totestint{
    public static void main(String[] args){
        arithmetic obj=new arithmetic();
        int result=obj.square(5);
        System.out.println("square="+result);
    }
}
