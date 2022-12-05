package HomeWork6;
import java.util.Objects;
public class Account {
    int amount;
    int id;
    public Account(int amount, int id) {
        this.amount = amount;
        this.id = id;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return amount == account.amount && id == account.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(amount, id);
    }
    @Override
    public String toString() {
        return "Account{" +
                "amount=" + amount +
                ", id=" + id +
                '}';
    }
}
