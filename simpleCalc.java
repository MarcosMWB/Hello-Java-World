import java.util.Scanner;
public class simpleCalc{
  public static void main(String[] args)
  {
    System.out.println("Enter first number:");
    Scanner inp= new Scanner(System.in);
    float num1,num2;
    num1 = inp.nextInt();
    System.out.println("Enter your selection: + - x /");
    char choose;
    choose = inp.next().charAt(0);
    System.out.println("Enter second number:");
    num2 = inp.nextInt();
    
    switch (choose){
      case '+':
        System.out.println(add(num1,num2));
        break;
      case '-':
        System.out.println(sub(num1,num2));
        break;
      case 'x':
        System.out.println(mult(num1,num2));
        break;
      case '/':
        System.out.println(div(num1,num2));
        break;
      default:
        System.out.println("Illigal Operation");
    }



  }
  public static float add(float x, float y)
  {
    float result = x + y;
    return result;
  }
  public static float sub(float x, float y)
  {
    float result = x-y;
    return result;
  }
  public static float mult(float x, float y)
  {
    float result = x*y;
    return result;
  }
  public static float div(float x, float y)
  {
    float result = x/y;
    return result;
  }

}
