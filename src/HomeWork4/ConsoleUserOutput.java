package HomeWork4;

public class ConsoleUserOutput implements UserOutput {

    @Override
    public void answer(String message) {
        System.out.println(message);
    }
}
