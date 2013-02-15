package org.cloudbus.cloudsim.workflow;

import java.util.HashSet;

/**
 * This class represents data that is generated by a DAG task.
 *
 */
public class DataItem {

	int ownerId;
	int id;
	String name;
	long size; /*Unit: kB*/
	HashSet<Integer> locations;
	
	public DataItem(int id, int ownerId, String name, long size){
		this.id = id;
		this.ownerId = ownerId;
		this.name = name;
		this.size = size;
		
		locations = new HashSet<Integer>();
	}
	
	public int getId(){
		return id;
	}
	
	public int getOwnerId(){
		return ownerId;
	}
	
	public String getName(){
		return name;
	}
	
	public long getSize(){
		return size;
	}
	
	public void addLocation(int locationId){
		locations.add(locationId);
	}
	
	public void removeLocation(int locationId){
		locations.remove(locationId);
	}
	
	public boolean isAvailableAt(int locationId){
		return (locations.contains(locationId));
	}

}
