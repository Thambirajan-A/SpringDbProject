package com.boot.SpringDbProject.repo;

import com.boot.SpringDbProject.entity.Transactions;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionsRepository extends MongoRepository<Transactions, ObjectId> {

}
