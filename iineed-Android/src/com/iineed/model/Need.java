package com.iineed.model;


import java.io.Serializable;
 
public class Need implements Serializable {
 
 private static final long serialVersionUID = 7390103290165670089L;
 private Long id;
 private String title;
 private String description;
 private String price;
 
 
 public Need() {
 
 }
 
 public Long getId() {
 return id;
 }
 
 public void setId(Long id) {
 this.id = id;
 }
 
 public void setTitle(String title) {
 this.title = title;
 }
 
 public String getTitle() {
 return title;
 }
 
 public String getDescription() {
 return description;
 }
 
 public void setDescription(String description) {
 this.description = description;
 }
 
 public String getPrice() {
 return price;
 }
 
 public void setPrice(String price) {
 this.price = price;
 }
 

}