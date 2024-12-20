package com.techie.microservices.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techie.microservices.inventory.model.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long>{

	 Boolean existsBySkuCodeAndQuantityIsGreaterThanEqual(String skuCode, Integer quantity) ;
}
