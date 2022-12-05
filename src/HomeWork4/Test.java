package HomeWork4;

public class Test {
   private final TestElement[] testElements;
   private int correctCount = 0;
   private int wrongCount = 0;
   public void run(){
      for (TestElement element:testElements) {
         boolean result = element.ask();
         if (result){
            correctCount++;
         }else {
            wrongCount++;
         }
      }
      System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
   }
   public Test(TestElement[] testElements) {
      this.testElements = testElements;
   }
}
