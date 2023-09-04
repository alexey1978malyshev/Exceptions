package sem3.task4;
/*Задача: Управление банковскими счетами

Вы разрабатываете программу для управления банковскими счетами.
 Вам нужно реализовать классы для создания счетов, пополнения, снятия
  денег и вывода информации о балансе. Также нужно предусмотреть
  обработку различных исключительных ситуаций.

  Создание собственных исключений InsufficientFundsException и
  NegativeAmountException.
Обработка исключений при работе с методами deposit и withdraw класса BankAccount.
  */

import javax.swing.plaf.basic.BasicColorChooserUI;

public class BankApp {
    public static void main(String[] args) throws NegativeAmountException {
        Account account1 = null;
        Account account2 = null;
        Account account3 = null;
        
        
        try{
        account1 = new Account(548557, 85000);
            System.out.println(account1);
        account2 = new Account(1023565, 44000);
            System.out.println(account2);
        account3 = new Account(654654, -5);
            System.out.println(account3);

    }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            account1.deposit(40);
            System.out.println(account1);
            
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            account2.withdraw(45000);
            System.out.println(account2);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        

    }
}
