package com.realtimechat.realtimechat.repositories;

import com.realtimechat.realtimechat.entities.Room;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoomRepository extends MongoRepository<Room, String> {

    //get room using roomid
    Room findByRoomId(String roomId);

}
