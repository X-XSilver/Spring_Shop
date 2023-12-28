package com.example.demo.repositories;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 *
 *
 *
 *
 */
public interface InhousePartRepository extends CrudRepository<InhousePart,Long> {

    List<InhousePart> findByName(String name);
}
