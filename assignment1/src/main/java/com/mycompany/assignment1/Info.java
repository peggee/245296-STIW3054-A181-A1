
package com.mycompany.assignment1;

public class Info {
    private String th;
    private String td;
    
    public Info(){
}
    public Info(String header, String data){
        this.th = header;
        this.td = data;
    }
    
    public void setHeader(String header){
        this.th = header;
    }
    
    public String getHeader(){
        return th;
    }
    
    public void setData(String data){
        this.td = data;
    }
    
    public String getData(){
        return td;
    }
}
