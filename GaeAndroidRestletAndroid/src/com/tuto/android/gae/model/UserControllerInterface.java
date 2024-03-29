package com.tuto.android.gae.model;

import org.restlet.resource.Get;
import org.restlet.resource.Put;

public interface UserControllerInterface {
    @Put
    void create(User user);
    
    @Get
    Container getAllUsers();
}
