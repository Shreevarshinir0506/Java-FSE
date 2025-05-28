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
        package cts;
        import java.util.*;
        public class CTS {
            public static void main(String[] args) {
                Scanner sc= new Scanner(System.in);
                System.out.print("Enter Mark: ");
                int grade=sc.nextInt();
                if(grade>=90 && grade<=100){
                    System.out.println("Your Grade is : A");
                }
                else if(grade>=80 && grade<90){
                    System.out.println("Your Grade is : B");
                }
                else if(grade>=70 && grade<80){
                    System.out.println("Your Grade is : C");
                }
                else if(grade>=60 && grade<70){
                    System.out.println("Your Grade is : D");
                }
                else{
                    System.out.println("Your Grade is : F");
                }
            }
        }

//Program 10:
        package cts;
        import java.util.*;
        public class CTS {
            public static void main(String[] args) {
                Scanner sc= new Scanner(System.in);
                Random r=new Random();
                int sys_guess=r.nextInt(100)+1;
                System.out.println("SystemGuess:"+sys_guess);
                int user_guess=0;
                while(user_guess!=sys_guess){
                    System.out.println("UserGuess: ");
                    user_guess=sc.nextInt();
                    if(user_guess<sys_guess){
                        System.out.println("Your guess is too low");
                    }
                    else if(user_guess>sys_guess){
                        System.out.println("Your guess is too high");
                    }
                    else{
                        System.out.println("Congratulation,your guess is correct");
                    }
                }
            }
        }

//Program 11:
        package cts;
        import java.util.*;
        public class CTS {
            public static void main(String[] args) {
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the number: ");
                int n = sc.nextInt();
                if (n<0){
                    System.out.println("Invalid input");
                }
                else{
                    long factorial=1;
                    for(int i=1;i<=n;i++){
                        factorial*=i;
                    }
                    System.out.println("Factorial of "+n+" is "+factorial);
                }
            }
        }

//Program 12:
        package cts;
        import java.util.*;
        public class CTS {
            public static int add(int a,int b){
                return a+b;
            }
            public static double add(double a,double b){
                return a+b;
            }
            public static int add(int a,int b,int c){
                return a+b+c;
            }
            public static void main(String[] args) {
                System.out.println("Addition of 2 integers:"+add(5,5));
                System.out.println("Addition of 2 doubles:"+add(5.0,4.0));
                System.out.println("Addition of 3 integers:"+add(5,5,5));
            }
        }
