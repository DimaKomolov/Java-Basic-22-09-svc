package HomeWork6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank {
    Map<Account,Client> accountClientMap = new HashMap<>();

    Map<Client,List<Account>> map = new HashMap<>();
    List<Account> getAccounts(Client client) {

        return map.get(client);
    }

    Client findClient(Account account) {

        return accountClientMap.get(account);
    }
}
