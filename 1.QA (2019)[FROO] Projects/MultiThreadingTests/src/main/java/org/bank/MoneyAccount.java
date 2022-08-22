package org.bank;


import static java.lang.Thread.sleep;

public class MoneyAccount {

//  private static MoneyAccount instance;
  private static ThreadLocal<MoneyAccount> instance = new ThreadLocal<>();


  private Integer account;

  private MoneyAccount() {
    account = 100000;
  }

  public static MoneyAccount getInstance() {
    if (instance.get() == null) {
      instance.set(new MoneyAccount());
    }
    return instance.get();
  }

  public void cache(final int amount) {
    account -= amount;
  }

  public Integer getAccount() {
    return account;
  }

  static final class BrokenCachePoint extends Thread {

    private Integer id;
    private String userName;
    private Integer cacheAmount;

    public void setCacheAmount(final Integer cacheAmount) {
      this.cacheAmount = cacheAmount;
    }

    public void setUserName(final String name) {
      this.userName = name;
    }

    public void setId(final Integer id) {
      this.id = id;
    }

    @Override
    public void run() {
      final int previousAccountValue = MoneyAccount.getInstance().getAccount();

      try {
        sleep(1);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      if (previousAccountValue < cacheAmount) {
        System.out.println(userName + "Nu am reusit sa scot bani! Nedestul bani pe cont! ");
        return;
      }

      MoneyAccount.getInstance().cache(cacheAmount);

      String message = "Sa scos bani de Utilizatorul: " +
              userName +
              "de la bancomatul " +
              id +
              " in suma de " +
              cacheAmount +
              ". Restul pe cont inainte de Extragere= " +
              previousAccountValue +
              ", dupa Extragere= " +
              MoneyAccount.getInstance().getAccount();

      System.out.println(message);
    }
  }

  static final class CachePoint extends Thread {

    private static final MoneyAccount moneyAccount = MoneyAccount.getInstance();

    private Integer id;
    private String userName;
    private Integer cacheAmount;

    public void setCacheAmount(final Integer cacheAmount) {
      this.cacheAmount = cacheAmount;
    }

    public void setUserName(final String name) {
      this.userName = name;
    }

    public void setId(final Integer id) {
      this.id = id;
    }

    @Override
    public void run() {
      synchronized (moneyAccount) {
        final int previousAccountValue = MoneyAccount.getInstance().getAccount();

        try {
          sleep(1);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }

        if (previousAccountValue < cacheAmount) {
          System.out.println(userName + "Nu am reusit sa scot bani! Nedestul bani pe cont! "
          );
          return;
        }

        MoneyAccount.getInstance().cache(cacheAmount);

        String message = "Sa scos bani de Utilizatorul: " +
                userName +
                "de la bancomatul " +
                id +
                " in suma de " +
                cacheAmount +
                ". Restul pe cont inainte de Extragere= " +
                previousAccountValue +
                ", dupa Extragere= " +
                MoneyAccount.getInstance().getAccount();

        System.out.println(message);
      }
    }
  }

  public static void main(String[] args) throws InterruptedException {

    /*System.out.println("Situatie N1. Folosim bancomat lucrator!");

    CachePoint point1 = new CachePoint();
    point1.setId(1);
    point1.setCacheAmount(99000);
    point1.setUserName("Hots1 ");

    CachePoint point2 = new CachePoint();
    point2.setId(2);
    point2.setCacheAmount(99000);
    point2.setUserName("Hots2 ");

    CachePoint point3 = new CachePoint();
    point3.setId(3);
    point3.setCacheAmount(99000);
    point3.setUserName("Hots3 ");

    point1.start();
    point2.start();
    point3.start();

    sleep(100);*/

    System.out.println("Situatie N2. Folosim bancomat Stricat!");

    BrokenCachePoint bpoint1 = new BrokenCachePoint();
    bpoint1.setId(1);
    bpoint1.setCacheAmount(99000);
    bpoint1.setUserName("Hots1 ");

    BrokenCachePoint bpoint2 = new BrokenCachePoint();
    bpoint2.setId(2);
    bpoint2.setCacheAmount(99000);
    bpoint2.setUserName("Hots2 ");

    BrokenCachePoint bpoint3 = new BrokenCachePoint();
    bpoint3.setId(3);
    bpoint3.setCacheAmount(99000);
    bpoint3.setUserName("Hots3 ");

    bpoint1.start();
    bpoint2.start();
    bpoint3.start();
  }

}
