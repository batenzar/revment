package io.batenzar.revment.manager;

import java.util.List;

import io.batenzar.revment.dao.Database;
import io.batenzar.revment.dao.DatabaseFactory;
import io.batenzar.revment.model.Record;

public class RecordManager {

	private Database db;

	public RecordManager() {
		db = DatabaseFactory.getDatabase();
	}

	public Record addRecord(Record rec) {
		Record result = null;
		if (rec.getId() != null && db.getRecord(rec.getId()) != null){
			result = db.getRecord(rec.getId());
		} else {
			result = db.addRecord(rec);
		}
		
		return result;
	}
	
	public Record getRecord(String id){
		return db.getRecord(id);
	}
	
	public List<Record> getRecords(){
		return db.getRecords();
	}
}
