package com.xiaofu;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by keifc on 2017/8/16.
 */
public interface EmpRepository extends Repository<Emp, Long> {

    @Transactional
    void save(Emp emp);

    List<Emp> findAll();

    @Transactional
    @Modifying
    @Query("update emp e set e.username = ?1, e.phone = ?2 where e.id = ?3")
    int updateUser(String username, String phone, int id);

    @Transactional
    int deleteById(int id);

}
