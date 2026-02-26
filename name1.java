
class Laptop12{
    int amount=50_000;
    String name="lenovo";
    Laptop12(){
        System.out.println("laptop");
    }
    void display(){
        System.out.println(name);
        System.out.println(amount);
    }
}
class Dell1 extends Laptop12 {
    Dell1(){
        System.out.println("dell");
    }
}
class name1{
    public static void main(String args[]){
        Dell1 obj=new Dell1();
        System.out.println(obj.name);//lenovo
        System.out.println(obj.amount);//50000
        obj.display();//lenovo 50000
}
}