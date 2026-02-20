import java.util.Random;
public class Main {


   static   int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
    public static void main(String[] args){
      Random random = new Random();
      /*Problem 1
     LibraryBook book1=new LibraryBook();
     book1.setBookTitle("DarkSide");
     book1.setAuthor("Abbos Qurbonov");
     book1.setPages(799);
     LibraryBook book2=new LibraryBook();
     book2.setPages(-500);
    System.out.println(book1.getBookTitle()+"  "+book1.getAuthor()+"  "+book1.getPages()+" pages\n");
    System.out.println(book2.getBookTitle()+"  "+book2.getAuthor()+"  "+book2.getPages()+" pages");
    if (book1.isThinck()){
      System.out.println("The #1 Book is think");
    }else System.out.println("The #1 Book is not think");
    if (book2.isThinck()){
      System.out.println("The #2 Book is think");
    }else System.out.println("The #2 Book is not think");*/



             /*Problem2
          TemperatureSensorArray reading1[]=new TemperatureSensorArray[5];
          for (int i = 0; i < 5; i++) {
              reading1[i] = new TemperatureSensorArray();
          }
          reading1[0].setLocation("Istanbul");
          reading1[1].setLocation("Tashkent");
          reading1[2].setLocation("Samarkand");
          reading1[3].setLocation("Navoi");
          reading1[4].setLocation("Qoqon");

          for (int i = 0; i < 5; i++) {
              reading1[i].setReading(random.nextDouble(101)-50);
          }
          double sum = 0;
          for (int i = 0; i < 5; i++) {
              System.out.printf("%s: %.2f°C %n", reading1[i].getLocation(), reading1[i].getReading());
          }
          for (int i = 0; i < 5; i++) {
              sum+=reading1[i].getReading();
          }
          sum/=5;
          System.out.printf("Avarage Value is for all: %.2f",sum);*/


          /*    Problem4
            StepCounter Abbos=new StepCounter();
            Abbos.setIndividualSteps(700);
            Abbos.walk(74);
            StepCounter.resetGlobalSteps();
            StepCounter Shuhrat=new StepCounter();
            Shuhrat.setIndividualSteps(100);
            Shuhrat.walk(800);
      System.out.println("SHuhrat walked "+Shuhrat.getIndividualSteps());
      System.out.println("Abbos Walked "+Abbos.getIndividualSteps());
      System.out.println("They both walked "+StepCounter.getTotalStepsAllUsers());*/




            int n = 20;
            int iterations = 1000000;
            Mathtool timer = new Mathtool();


            timer.start();
            for (int i = 0; i < iterations; i++) {
                factorial(n);
            }
            timer.stop();
            System.out.println("Recursive (" + iterations + " times): " + timer.getElapsedTime() + " ms");


            timer.start();
            for (int i = 0; i < iterations; i++) {
                factorial(n);
            }
            timer.stop();
            System.out.println("Iterative (" + iterations + " times): " + timer.getElapsedTime() + " ms");
  }
}
