package com.zepto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zepto.entity.AmazonEntity;

@Repository
public interface AmazonRepository  extends CrudRepository<AmazonEntity, Integer>{

}
