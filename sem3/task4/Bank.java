package sem3.task4;

import java.util.HashMap;
import java.util.HashSet;

public class Bank {
    HashSet<Account> accounts = new HashSet<>();

    public void addAccount(Account account){
        this.accounts.add(account);
    }
//    public void withdraw(Account account, int sum) {
//        try{
//            if (accounts.contains(account)){
//
//            }else{
//
//            }
//
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//    }

}
