package com.tuto.android.gae.server;

import org.restlet.resource.Get;
import org.restlet.resource.Put;

import com.tuto.android.gae.model.User;

public interface UserControllerInterface {
    @Put
    void create(User user);
    
    @Get
    Container getAllUsers();
}
