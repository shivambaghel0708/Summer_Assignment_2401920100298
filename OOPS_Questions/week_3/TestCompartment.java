

import java.util.Random;

abstract class compartment{
    public abstract String notice();
}

class FirstClass extends compartment{
    public String notice(){
        return "First Class Compartment: Premium passengers only.";
    }
}

class luggage extends compartment{
    public String notice(){
        return "luggage Compartment: for luggage and parcels only.";
    }
}


class ladies extends compartment{
    public String notice(){
        return "ladies Compartment: ladies  passengers only.";
    }
}


class general extends compartment{
    public String notice(){
        return "general Compartment: open for all passengers.";
    }
}



public class TestCompartment {
    public static void main(String[] args){
        compartment[] compartments=new compartment[10];
        Random  random=new Random();
        for (int i=0;i<compartments.length;i++){
            int num=random.nextInt(4)+1;
        
        switch(num){
            case 1:
                compartments[i]= new FirstClass();
                break;
            case 2:
                compartments[i]= new ladies();
                break;
            case 3:
                compartments[i]= new general();
                break;
            case 4:
                compartments[i]= new luggage();
                break;


        }}
        for (int i = 0; i < compartments.length; i++) {
            System.out.println("Compartment " + (i + 1) + ": "
                    + compartments[i].notice());
        }



    }
    
}
