package org.comstudy21.jsonex;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class App 
{   static JSONObject jsRoot;
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        JSONArray jsArr=new JSONArray();
        JSONObject jsObj  = new JSONObject();
        jsObj.put("no", "1001");
        jsObj.put("name", "Gildong");
        jsObj.put("email", "hong@naver.com");
        jsObj.put("phone", "010-9999-8888");
        
        jsArr.put(jsObj);
        
        jsObj  = new JSONObject();
        jsObj.put("no", "1001");
        jsObj.put("name", "Changjoo");
        jsObj.put("email", "hong@naver.com");
        jsObj.put("phone", "010-9999-8888");
        jsArr.put(jsObj);
        
        
         jsRoot= new JSONObject();
        jsRoot.put("mem_list",   jsArr);
        System.out.println(jsRoot.toString(1));
        
        
        json2object();
    }
   private static void json2object() {
      
      JSONArray jsList = jsRoot.getJSONArray("mem_list");
      ArrayList<MemberVo> list = new ArrayList<MemberVo>();
      for(int i= 0; i<jsList.length();i++) {
         JSONObject json = jsList.getJSONObject(i);
         MemberVo vo=new MemberVo();
         vo.setNo(json.get("no").toString());
         vo.setName(json.get("name").toString());
         vo.setEmail(json.get("email").toString());
         vo.setPhone(json.get("phone").toString());
         list.add(vo);
      }
      System.out.println(list);
   }
}