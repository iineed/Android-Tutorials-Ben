package com.iineed.model;

import java.util.ArrayList;
import java.util.List;
 
import com.iineed.model.Need;

public class Container
{
 public List<Need> need_list;
 
 public List<Need> getNeed_list() {
 return need_list;
 }
 
 public void setNeed_list(List<Need> need_list) {
 this.need_list = need_list;
 }
 
 public Container()
 {
 need_list = new ArrayList<Need>();
 }
 
 public Container(List<Need> need_list)
 {
 this.need_list = need_list;
 }
 
}