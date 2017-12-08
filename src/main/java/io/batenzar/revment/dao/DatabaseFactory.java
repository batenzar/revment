package io.batenzar.revment.dao;

public class DatabaseFactory {

	// we support only one currently.
	private static Database db = new MemoryStorage();
	
	public static Database getDatabase(){
		return db;
	}
}
