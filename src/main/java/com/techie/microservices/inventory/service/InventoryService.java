package com.techie.microservices.inventory.service;

import org.springframework.stereotype.Service;

import com.techie.microservices.inventory.repository.InventoryRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class InventoryService {

	private final InventoryRepository inventoryRepository;
	
	
	public Boolean isInStock(String skuCode, Integer quantity) {
		
		return inventoryRepository.existsBySkuCodeAndQuantityIsGreaterThanEqual( skuCode, quantity);
		
	}
}
