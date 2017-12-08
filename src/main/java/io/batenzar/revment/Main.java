package io.batenzar.revment;

import java.util.List;

import io.batenzar.revment.manager.RecordManager;
import io.batenzar.revment.model.Record;

public class Main {

	public static void main(String[] args) {
		RecordManager recordManager = new RecordManager();
		Record rec = new Record();
		recordManager.addRecord(rec);
		
		rec = new Record();
		recordManager.addRecord(rec);
		
		List<Record> records = recordManager.getRecords();
		for (Record r : records){
			System.out.println(r.getId());
		}
	}

}
