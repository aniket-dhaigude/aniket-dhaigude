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

import com.fleeter.entities.roles.RelationshipExecutive;
import com.fleeter.repository.RelationshipExecutiveRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/relationshipExecutive")
public class RelationshipExecutiveController
{

	@Autowired
	private RelationshipExecutiveRepository relationshipExecutiveRepository;
	
	@PostMapping("/")
	public RelationshipExecutive saveRelationshipExecutive(@RequestBody RelationshipExecutive relationshipExecutive)
	{
		relationshipExecutive.setRole("RelationshipExecutive");
	    return relationshipExecutiveRepository.save(relationshipExecutive);
	}
	
	@GetMapping("/")
	public List<RelationshipExecutive> getAllApplicant()
	{
		return relationshipExecutiveRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public RelationshipExecutive getRelationExecutiveById(@PathVariable("id") int id)
	{
		return relationshipExecutiveRepository.findById(id).get();
	}
	
	@DeleteMapping("/{id}")
	public void deleteRelationshipexecutiveById(@PathVariable("id")int id)
	{
		relationshipExecutiveRepository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public RelationshipExecutive updateRelationExecutiveById(@RequestBody RelationshipExecutive relationshipExecutive,@PathVariable("id") int id)
	{
		relationshipExecutive.setId(id);
		return relationshipExecutiveRepository.save(relationshipExecutive);
	}
	
}
