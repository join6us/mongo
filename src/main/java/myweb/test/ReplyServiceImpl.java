package myweb.test;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ReplyServiceImpl implements ReplyRepo {

    @Autowired
    private ReplyRepo replyRepo;

    @Override
    public <S extends ReplyDomain> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public List<ReplyDomain> findAll(Sort sort) {
        return null;
    }

    @Override
    public <S extends ReplyDomain> S insert(S entity) {
        return null;
    }

    @Override
    public <S extends ReplyDomain> List<S> insert(Iterable<S> entities) {
        return null;
    }

    @Override
    public <S extends ReplyDomain> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends ReplyDomain> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public Page<ReplyDomain> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends ReplyDomain> S save(S entity) {
        return null;
    }

    @Override
    public Optional<ReplyDomain> findById(Long id) {
        return null;
    }

    @Override
    public boolean existsById(Long id) {
        return false;
    }

    @Override
    public Iterable<ReplyDomain> findAllById(Iterable<Long> ids) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void delete(ReplyDomain entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends ReplyDomain> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends ReplyDomain> Optional<S> findOne(Example<S> example) {
        return null;
    }

    @Override
    public <S extends ReplyDomain> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends ReplyDomain> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends ReplyDomain> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public List<ReplyDomain> findByBno(int bno) {
        System.out.println("GO MONGO..");
        return replyRepo.findByBno(bno);
    }

    @Override
    public List<ReplyDomain> findAll() {
        return null;
    }

}