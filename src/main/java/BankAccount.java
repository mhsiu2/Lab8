import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    /**
     * List of possible account types.
     */
    public enum BankAccountType {
        /**
         * Checking account.
         */
        CHECKINGS,

        /**
         * Saving account.
         */
        SAVINGS,

        /**
         * Student account.
         */
        STUDENT,

        /**
         * Workplace account.
         */
        WORKPLACE
    }

    /**
     * Account number.
     */
    private int accountNumber;

    /**
     * Type of account.
     */
    private BankAccountType accountType;

    /**
     * Total money in account.
     */
    private double accountBalance;

    /**
     * Name of account owner.
     */
    private String ownerName;

    /**
     * Interest rate.
     */
    private double interestRate;

    /**
     * Amount of interest earned.
     */
    private double interestEarned;

    /**
     * Set owner name and account type.
     * @param name Name of owner
     * @param accountCategory Type of account
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        ownerName = name;
        accountType = accountCategory;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
    /**
     * Set account number.
     * @param n Account number
     */
    public void setAccountNumber(final int n) {
        accountNumber = n;
    }

    /**
     * Get account number.
     * @return Account number.
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Get account type.
     * @return Account type
     */
    public BankAccountType gettAccountType() {
        return accountType;
    }

    /**
     * Set account balance.
     * @param b Account balance
     */
    public void setBalance(final double b) {
        accountBalance = b;
    }

    /**
     * Get account balance.
     * @return Account balance
     */
    public double getBalance() {
        return accountBalance;
    }

    /**
     * Set name of account owner.
     * @param owner Name of owner
     */
    public void setOwnerName(final String owner) {
        ownerName = owner;
    }

    /**
     * Get name of account owner.
     * @return Name of owner
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Set interest rate.
     * @param rate Interest rate
     */
    public void setInterestRate(final double rate) {
        interestRate = rate;
    }

    /**
     * Get interest rate.
     * @return Interest rate
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * Set amount of interest earned.
     */
    public void setInterestEarned() {
        interestEarned = getBalance() * getInterestRate();
    }

    /**
     * Get amount of interest earned.
     * @return Interest earned
     */
    public double getInterestEarned() {
        return interestEarned;
    }
}