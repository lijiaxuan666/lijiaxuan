package first.service;

import first.domain.Account;

public interface IAccountService {
    Account findByName(String name);
    void update(Account account);
    void transfer(String source,String target,float money);
}
