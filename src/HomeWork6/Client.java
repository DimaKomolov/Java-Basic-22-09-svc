package HomeWork6;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
public class Client {
    String name;
    int age;
    List<Account>accounts = new ArrayList<Account>();
    public void addAccount(Account account){
        accounts.add(account);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return age == client.age && name.equals(client.name) && accounts.equals(client.accounts);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age, accounts);
    }
    public Client(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", accounts=" + accounts +
                '}';
    }
}
