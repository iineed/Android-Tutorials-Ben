package com.iineed.model;

import org.restlet.resource.Get;
import org.restlet.resource.Put;
 
public interface NeedControllerInterface {
 @Put
 void create(Need need);
 
 @Get
 Container getAllNedds();
}
