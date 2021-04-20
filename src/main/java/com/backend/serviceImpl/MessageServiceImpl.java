package com.backend.serviceImpl;

import com.backend.dao.MessageDao;
import com.backend.entity.Message;
import com.backend.entity.User;
import com.backend.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    MessageDao messageDao;

    @Override
    public List<Message> getMessages() {
        return messageDao.getMessages();
    }

    @Override
    public List<Message> findByAuthor(User author) {
        return messageDao.findByAuthor(author);
    }

    @Override
    public Message releaseMessage(Message message) {
        return messageDao.releaseMessage(message);
    }
}