public class Main {

  public static void main(String[] args)
  {
    int math = 80;
    int programing = 90;
    int English = 95;

    int total = math + programing + English;
    double average = total / 3.0;

    System.out.println("Marh: " + math );
    System.out.println("programing: " + programing );
    System.out.println("English: " + English);

    System.out.println("Total: " + total );
    System.out.println("Average: " + average );

    System.out.println("Remining From 100: " + (100 - average));


    //update programin grade
    programing += 5;
    System.out.println("update programing: " + programing);
    
    //check the Remainder

    System.out.println("programing Remainder: " + programing % 10);



    int x = 10;

x += 5;   // x = x + 5
x -= 2;   // x = x - 2
x *= 3;   // x = x * 3
x /= 2;   // x = x / 2
x %= 2; // x = x % 2


System.out.println("=======================================");


int score = 100;

score += 10;
System.out.println(score);

score -= 20;
System.out.println(score);

score *= 2;
System.out.println(score);

score /= 5;
System.out.println(score);






System.out.println("=======================================");

int count = 0;

count++;
count++;

System.out.println(count);

count--;

System.out.println(count);



System.out.println("=======================================");


int age = 19;

System.out.println(age > 18);
System.out.println(age < 18);
System.out.println(age == 19);
System.out.println(age != 20);



System.out.println("=======================================");

int Age = 19;
boolean hasID = true;

System.out.println(age >= 18 && hasID);
System.out.println(age < 18 || hasID);
System.out.println(!hasID);

  }
}


/*
Arithmetic:
+  -  *  /  %

Assignment:
=  +=  -=  *=  /=  %=

Increment:
++  --

Comparison:
>  <  >=  <=  ==  !=

Logical:
&&  ||  !



Comparison → returns boolean
 */