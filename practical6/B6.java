//WAP that counts the number of objects created using static.
package practical6;
class ObjectCounter{
    static int count=0;
    public ObjectCounter(){
        count++;
    }
    public static void display(){
        System.out.println("object: "+count);
    }
}
public class B6 {
    public static void main(String[] args) {
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter.display();

        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter.display();

        ObjectCounter obj3 = new ObjectCounter();
        ObjectCounter.display();

        ObjectCounter obj4 = new ObjectCounter();
        ObjectCounter.display();
    }
}
