import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    while(true){
      try {
        Scanner ask = new Scanner(System.in);
        System.out.println("Enter Your Exam Degree:");
        Byte degree = ask.nextByte();

        if(degree > 100){
            System.out.println("Are you joking?\nThe exam was out of 100.");
            System.out.println(' ');
        } else if(degree < 0){
            System.out.println("How did you get negative points?!");
            System.out.println(' ');
        } else{
            if(degree >= 90){
                System.out.println(degree + "% You are a pretty good student!");
            } else if(degree < 90 && degree > 50){
                System.out.println(degree + "% Your have passed the exam.");
            } else if(degree == 50){
                System.out.println(degree + "% You have passed by the skin of one's teeth.\nStudy More.");
            } else if(degree < 50) {
                System.out.println(degree + "% Why are you here?! Get Out!");
            } else{
                System.out.println("Invalid Input!");
            }
            System.out.println(' ');
        }
      } catch(Exception e) {
          System.out.println("Invalid Input!");
          System.out.println(' ');
      }
    }
  }
}
