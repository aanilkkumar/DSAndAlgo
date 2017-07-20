package com.datastructure.binarySearch;


public enum Status {
	
	PRESENT(0, "Present"),NOT_PRESENT(1, "Not_Present");
	
	private final int id;
	private final String status;
	
	private Status(int id, String status) {
		this.id = id;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public String getStatus() {
		return status;
	}
	
	public static Status typeOf(int id){
		for (Status status : Status.values()) {
			if(id == status.getId()){
				return status;
			}
		}
		throw new IllegalArgumentException("Unknown status for id"+ id);
	}
}
