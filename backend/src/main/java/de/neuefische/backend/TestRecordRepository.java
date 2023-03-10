package de.neuefische.backend;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRecordRepository extends MongoRepository<TestRecord, String> {
}
