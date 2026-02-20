 class StepCounter {

   private static int totalStepsAllUsers;
    private int individualSteps;


     public void setIndividualSteps(int individualSteps) {
         StepCounter.totalStepsAllUsers+=individualSteps;
         this.individualSteps = individualSteps;
     }

     public static int getTotalStepsAllUsers() {
         return totalStepsAllUsers;
     }

     public int getIndividualSteps() {
         return individualSteps;
     }
      public void walk(int steps){
          individualSteps+=steps;
          StepCounter.totalStepsAllUsers+=steps;
     }
     public static void  resetGlobalSteps(){
         StepCounter.totalStepsAllUsers=0;
     }

 }
