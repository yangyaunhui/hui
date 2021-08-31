package spring21aop02;

import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImpl implements AccountService{

    @Override
    public void findAll() {
        int i = 9/0;
        System.out.println("全查......");
    }
}
