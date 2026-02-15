package Task2;

public class Mobile{
   private String name;
    private float price;
    private int number;

    Mobile(){
        name=" Huawei";
        price= 210;
        number= 123;

    }
    Mobile(String N,float p, int no){
        this.name=N;
        this.price=p;
        this.number=no;
    }
    void display(){
        System.out.println("Name: " +name+ "Price: " +price+ "Number:" +number);
    }
    public static void main(String[] args){
        Mobile m1= new Mobile();
        Mobile m2= new Mobile("Samsung",25000,12347568);
        m1.display();
        m2.display();
    }
}
