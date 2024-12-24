package com.shreyas.Journal.repository;

import com.shreyas.Journal.entity.JournalEntry;
import com.shreyas.Journal.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
    User findByUserName(String userName);

    void deleteByUserName(String userName);
}
