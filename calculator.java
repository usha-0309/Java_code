import java.util.*;
public class calculator{
    public static void main(String[] args) {
 
System.out.println("THIS IS calculator");
Scanner sn = new Scanner(System.in);
System.out.print("Enter FRIST NO:-");
float a=sn.nextFloat();
System.out.print("Enter SECOND NO:-");
 float b=sn.nextFloat();
 float add,sub,mul,div;
       
        add = a+b;
        mul= a*b;
        sub=a-b;
        div = a/b;
 System.out.println("THE ADDITION IS"+"  "+add);
  System.out.println("THE SUBTRACTION IS"+"  "+sub);
 System.out.println("THE MULTIPLICATION IS"+"  "+mul);
 System.out.print("THE DIVISION IS"+"  "+div);

      



    }
}