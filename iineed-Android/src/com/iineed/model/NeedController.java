package com.iineed.model;
 
import java.util.List;
 
import org.restlet.resource.ClientResource;
 
import android.util.Log;
 
public class NeedController {
 public final ClientResource cr = new ClientResource(
 EngineConfiguration.gae_path + "/rest/need");
 
 public NeedController() {
 EngineConfiguration.getInstance();
 }
 
 public void create(Need need) throws Exception {
 final NeedControllerInterface uci = cr
 .wrap(NeedControllerInterface.class);
 
 try {
 uci.create(need);
 Log.i("UserController", "Creation success !");
 } catch (Exception e) {
 Log.i("UserController", "Creation failed !");
 throw e;
 }
 }
 
 public List<Need> getAllNeeds() {
 final NeedControllerInterface uci = cr
 .wrap(NeedControllerInterface.class);
 Container content = uci.getAllNedds();
 return content.getNeed_list();
 }
}
