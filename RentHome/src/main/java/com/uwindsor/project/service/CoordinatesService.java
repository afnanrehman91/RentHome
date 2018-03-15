package com.uwindsor.project.service;

import java.util.List;

import com.uwindsor.project.models.Coordinates;

public interface CoordinatesService {

	public Iterable<Coordinates> finalAll();
	
	public void saveCoordinates(Coordinates coordinates);
	
	public List<Coordinates> listAllCoordinates();
	
	public Coordinates findCoordinatesById(int id);
	
}
