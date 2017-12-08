package io.batenzar.revment.dao;

import java.util.List;

import io.batenzar.revment.model.Record;

public interface Database {
	Record addRecord(Record rec);

	boolean removeRecord(String id);

	Record getRecord(String id);
	
	List<Record> getRecords();
}
