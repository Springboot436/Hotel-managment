package com.cg.hbm.repository;

import java.util.List;

import com.cg.hbm.entites.RoomDetails;

public interface IRoomDetailsRepository {
	public RoomDetails addRoomDetails(RoomDetails roomDetails);
	public RoomDetails updateRoomDetails(RoomDetails roomDetails);
	public RoomDetails removeRoomDetails(RoomDetails roomDetails);
	public List<RoomDetails> showAllRoomDetails();
	public RoomDetails showRoomDetails(int roomDetails_id);
}
