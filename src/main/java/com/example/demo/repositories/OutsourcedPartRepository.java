package com.example.demo.repositories;

import com.example.demo.domain.OutsourcedPart;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
/**
 *
 *
 *
 *
 */
public interface OutsourcedPartRepository extends CrudRepository<OutsourcedPart,Long> {

    List<OutsourcedPart> findByName(String name);
}
