package dao;

import domain.Region;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Stateless
public class RegionDao {
    @PersistenceContext
    protected EntityManager entityManager;

    public Optional<Region> find(int id){
        return Optional.ofNullable(entityManager.find(Region.class, id));
    }
}
