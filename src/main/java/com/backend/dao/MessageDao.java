package com.backend.dao;

import com.backend.entity.Message;
import com.backend.entity.User;

import java.util.List;

public interface MessageDao {
    List<Message> getMessages();
    List<Message> findByAuthor(User author);
    Message releaseMessage(Message message);
}
