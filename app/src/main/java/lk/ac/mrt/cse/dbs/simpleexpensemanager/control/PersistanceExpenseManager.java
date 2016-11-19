package lk.ac.mrt.cse.dbs.simpleexpensemanager.control;

import android.content.Context;

import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.AccountDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.TransactionDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.PersistanceAccountDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.PersistanceTransactionDAO;

/**
 * Created by shan on 11/19/2016.
 */

public class PersistanceExpenseManager extends ExpenseManager {
    private Context context= null;
    public PersistanceExpenseManager(Context context) {
        this.context =context;
        setup();
    }

    public void setup(){
        AccountDAO persestanceAccountDAO = new PersistanceAccountDAO(context);
        setAccountsDAO(persestanceAccountDAO);

        TransactionDAO persistanceTransactionDAO = new PersistanceTransactionDAO(context);
        setTransactionsDAO(persistanceTransactionDAO);
    }
}
