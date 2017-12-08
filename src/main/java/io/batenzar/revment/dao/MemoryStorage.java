package io.batenzar.revment.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import io.batenzar.revment.model.Record;

public class MemoryStorage implements Database {

	private List<Record> map = new ArrayList<>();
	
	MemoryStorage() {
		// not allow initializing outside package
	}
	
	public Record addRecord(Record rec) {
		map.add(rec);
		rec.setId(String.valueOf(map.indexOf(rec)));
		
		return rec;
	}

	public boolean removeRecord(String id) {
		return false;
	}

	public Record getRecord(String id) {
		return map.get(Integer.parseInt(id));
	}

	@Override
	public List<Record> getRecords() {
		return Collections.unmodifiableList(map);
	}
	
	
}
