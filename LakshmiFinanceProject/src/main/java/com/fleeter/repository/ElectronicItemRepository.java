package com.fleeter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fleeter.entities.master.ElectronicItem;

@Repository
public interface ElectronicItemRepository extends JpaRepository<ElectronicItem, Integer>
{

}
