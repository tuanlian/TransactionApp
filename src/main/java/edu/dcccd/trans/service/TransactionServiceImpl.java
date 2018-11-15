package edu.dcccd.trans.service;

import edu.dcccd.trans.entity.SelectedDay;
import edu.dcccd.trans.entity.SingletonTransaction;
import edu.dcccd.trans.entity.Transaction;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class TransactionServiceImpl implements TransactionService
{
    @Override
    public void createTransaction(Transaction transaction)
    {
        SingletonTransaction.getInstance().transactions.add(transaction);
    }
    @Override
    public List<Transaction> getAllTransaction()
    {
        return SingletonTransaction.getInstance().transactions;
    }
}