package myweb.test;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReplyRepo extends MongoRepository<ReplyDomain,Long>{

    public List<ReplyDomain> findByBno(int bno);
    public List<ReplyDomain> findAll();

}