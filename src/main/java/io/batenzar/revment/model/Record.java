package io.batenzar.revment.model;

import java.util.Date;
import java.util.List;

public class Record {

	private String id;
	
	private String title;
	
	private String description;
	
	private int rating;
	
	private Date date;
	
//	private Category category;
//	
//	private List<String> tags;
	
	private List<String> picPath;
	
//	private List<Location> foundLoc;
	
	public String getId(){
		return id;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Record && ((Record) obj).getId() == this.getId();
	}
	
}
