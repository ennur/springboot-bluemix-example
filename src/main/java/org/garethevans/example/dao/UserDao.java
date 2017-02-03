package org.garethevans.example.dao;


import org.garethevans.example.model.JoinEvent;
import org.garethevans.example.model.User;

import java.util.List;

public interface UserDao
{
    public List<User> get();
    public List<User> getByUserId(String aUserId);
    public int registerLineId(String aUserId, String aLineId, String aDisplayName);
    public int joinEvent(String aEventId, String aUserId, String aLineId, String aDisplayName);
    public List<JoinEvent> getEvent();
    public List<JoinEvent> getByEventId(String aEventId);
    public List<JoinEvent> getByJoin(String aEventId, String aUserId);
};
