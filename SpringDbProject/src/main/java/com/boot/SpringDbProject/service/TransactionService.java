package com.boot.SpringDbProject.service;

import com.boot.SpringDbProject.entity.Customer;
import com.boot.SpringDbProject.repo.CustomerRepository;
import com.boot.SpringDbProject.repo.TransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    @Autowired
    private TransactionsRepository transactionsRepository;
    public long getTransactionsCount(){
        return  transactionsRepository.count();
    }



 }


