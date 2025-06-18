// 17. **Write a method that converts Celsius to Fahrenheit.**

public class prob17 {
    public static double temperature(double temp){
        double Faren = (9.0/5)*temp+32;
        return Faren;
    }
    
    

    public static void main(String args[]){
       System.out.println(temperature(32));
       
    }
}
