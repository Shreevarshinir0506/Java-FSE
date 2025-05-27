//Program 1:
    package cts;
    public class CTS {
        public static void main(String[] args) {
            System.out.println("Hello, World!");
        }
  }

//Program 2:
    package cts;
    import java.util.*;
    public class CTS {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter a value: ");
            int a=sc.nextInt();
            System.out.println("Enter b value: ");
            int b=sc.nextInt();
            System.out.println("Enter operation(+,-,*,/)");
            String op=sc.next();
            switch(op){
                case "+":
                    System.out.println("Addition result:"+(a+b));
                    break;
                case "-":
                    System.out.println("Subtraction result:"+(a-b));
                    break; 
                case "*":
                    System.out.println("Multiplication result:"+(a*b));
                    break; 
                case "/":
                    System.out.println("Division result:"+(a/b));
                    break;     
                default :
                    System.out.print("Enter valid input");
            }
        }
    }

//Program 3:
    package cts;
    import java.util.*;
    public class CTS {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter a value: ");
            int a=sc.nextInt();
            if(a%2==0){
                System.out.println("The number "+a+" is Even.");
            }
            else{
                System.out.println("The number "+a+" is Odd.");
            }
        }
    }

//Program 4:
    package cts;
    import java.util.*;
    public class CTS {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter year: ");
            int year=sc.nextInt();
            if(year%4==0 && year%100!=0 ){
                System.out.println("The year "+year+" is leap year.");
            }
            else if(year%400==0){
                System.out.println("The year "+year+" is leap year.");
            }
            else{
                System.out.println("The year "+year+" is not a leap year.");
            }
        }
    }

//Program 5:
    package cts;
    import java.util.*;
    public class CTS {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter table: ");
            int a=sc.nextInt();
            for(int i=1;i<=10;i++){
                System.out.println(i+"*"+a+"="+(i*a));
            }   
        }
    }

//Program 6:
    package cts;
    import java.util.*;
    public class CTS {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int a=5;
            float b=3.14f;
            double c=99.99;
            char d='S';
            boolean e=true;
                System.out.println("Int Value: "+a); 
                System.out.println("Float Value: "+b); 
                System.out.println("Double Value: "+c); 
                System.out.println("Character Value: "+d); 
                System.out.println("Boolean Value: "+e); 
        }
}

//Program 7:
    package cts;
    import java.util.*;
    public class CTS {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int a=(int)5.55;
            System.out.println("Int Value: "+a);
            double b=(double)50;
            System.out.println("Double Value: "+b); 
        }
    }

//Program 8:
    package cts;
    import java.util.*;
    public class CTS {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            float a=5+6+9*8/4*(9/3);
            System.out.println("Int Value: "+a);
        }
    }

//Program 9:

