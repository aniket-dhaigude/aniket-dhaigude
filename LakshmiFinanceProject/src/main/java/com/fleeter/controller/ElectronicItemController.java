package com.fleeter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fleeter.entities.master.ElectronicItem;
import com.fleeter.repository.ElectronicItemRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/electronicItem")
public class ElectronicItemController 
{

	@Autowired
	private ElectronicItemRepository electronicItemRepository;
	
	@PostMapping("/")
	public ElectronicItem saveElectronicItem(@RequestBody ElectronicItem electronicItem)
	{
		return electronicItemRepository.save(electronicItem);
	}
	
	@GetMapping("/")
	public List<ElectronicItem> getAllElectronicItems()
	{
		return electronicItemRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ElectronicItem getElectronicItemById(@PathVariable("id") int id)
	{
		return electronicItemRepository.findById(id).get();
	}
	
	@DeleteMapping("/{id}")
	public void deleteElectronicItemById(@PathVariable("id") int id)
	{
		electronicItemRepository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public ElectronicItem updateElectronicItemById(@RequestBody ElectronicItem electronicItem,@PathVariable("id") int id)
	{
		electronicItem.setId(id);
		return electronicItemRepository.save(electronicItem);
	}
}
