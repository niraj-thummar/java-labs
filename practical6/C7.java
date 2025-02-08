//Write a program in Java to demonstrate use of this keyword. Check whether this can
//access the Static variables of the class or not.
package practical6;
class Demo{
    static int a;
    public Demo(int a){
        this.a = a;
    }
}
public class C7 {
    public static void main(String[] args) {
        Demo obj = new Demo(3);
    }
}
