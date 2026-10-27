import java.util.*;

class Vehicle{
    int days;
    String brand;
    int rent;
}
class Car extends Vehicle{
    int insurence;
    Car(String brand,int days,int rent,int insurence){
        this.days=days;
        this.brand=brand;
        this.rent=rent;
        this.insurence=insurence;
    }
    int total;
    void calculate(){
        total=(days*rent)+insurence;
        System.out.println("Total rent for "+brand+" is "+total);
    }
}

public class Main {
    public static void main(String[] args) {
        Car obj1=new Car("Honda",9,1500,300);
        Car obj2=new Car("BMW",5,6500,3000);
        Car obj3=new Car("Ferrari",3,9800,5000);
        Car obj4=new Car("McLaren",4,7500,4000);
        obj1.calculate();
        obj2.calculate();
        obj3.calculate();
        obj4.calculate();
    }
}
