package HomeWork4;

    public class Quiz {
        private final  UserOutput userOutput = new ConsoleUserOutput();
        private final TestElement[] elements;
        private int correctCount = 0;
        private int wrongCount = 0;

        public void run(){
            for (TestElement element:elements) {
                boolean result = element.test();
                if (result){
                    correctCount++;
                }else {
                    wrongCount++;
                }
            }
            userOutput.print("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
        }

        public Quiz(TestElement[] elements) {
            this.elements = elements;
        }
    }

