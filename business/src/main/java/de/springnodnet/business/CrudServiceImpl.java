package de.springnodnet.business;

import de.springnodnet.repository.BaseRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class CrudServiceImpl implements CrudService<Object, Object> {

    @Autowired
    private BaseRepository baseRepo;

    @Override
    public Object findOne(Long id) {
        return baseRepo.findOne(id);
    }

    @Override
    public List findAll() {
        return baseRepo.findAll();
    }

    @Override
    public Object create(Object t) {
        return baseRepo.save(t);
    }

    @Override
    public void update(Object t) {
        baseRepo.saveAndFlush(t);
    }

    @Override
    public void delete(Long id) {
        baseRepo.delete(baseRepo.findOne(id));

    }

    
}
