package HomeWork4;

public class HomeWork4 {
        public static void main(String[] args) {
            //System.currentTimeMillis()
            TestElement block1 = new TestElement("В файл с каким расширением компилируется java-файл?",new String[]{"cs", "java", "class", "exe"},3);
            TestElement block2 = new TestElement("С помощью какой команды git можно получить полную копию удаленного репозитория?",new String[]{"commit", "push", "clone", "copy"},3);
            TestElement block3 = new TestElement("Какой применяется цикл ,когда не известно количество итераций",new String[]{"while", "fpr", "loop"},1);
            TestElement[] blocks = new TestElement[]{block1,block2,block3};
            Quiz quiz = new Quiz (blocks);
            quiz.run();

        }
    }

