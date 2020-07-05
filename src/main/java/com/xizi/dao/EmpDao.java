package com.xizi.dao;

import com.xizi.pojo.Emp;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpDao {

    List<Emp> findAll();

    void save(Emp emp);

    void delete(String id);

    Emp find(String id);

    void update(Emp emp);

}