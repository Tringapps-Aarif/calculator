
/*Implement a simple objculator that performs basic arithmetic operations
(addition, subtraction, multiplication, and division).
This project will help you understand OOP concepts such as encapsulation,
inheritance, and polymorphism.*/
import java.util.*;

class declaration {
    int a, b;

    declaration(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class operation extends declaration {
    operation(int a, int b) {
        super(a, b);
    }

    int add() {
        return a + b;
    }

    int sub() {
        return a - b;
    }

    int mul() {
        return a * b;
    }

    int div() {
        return a / b;
    }
}

class calculator {
    public static void main(String args[]) {
        int a, b, ch = 0;
        Scanner sc = new Scanner(System.in);
        while (ch != 5) {
            System.out.print(
                    "1.Add \n2.Subtract \n3.Multiply \n4.Divide \n5.Exit \nEnter your choice : ");
            ch = sc.nextInt();
            System.out.print("Enter the value of A : ");
            a = sc.nextInt();
            System.out.print("Enter the value of B : ");
            b = sc.nextInt();
            operation obj = new operation(a, b);
            switch (ch) {
                case 1:
                    System.out.println("Addition is : " + obj.add());
                    break;
                case 2:
                    System.out.println("Subtraction is : " + obj.sub());
                    break;
                case 3:
                    System.out.println("Multiplication is : " + obj.mul());
                    break;
                case 4:
                    System.out.println("Divition is : " + obj.div());
                    break;
                case 5:
                    System.exit(0);

                default:
                    System.out.println("Enter a valid choice!!");
                    break;
            }
        }
    }
}