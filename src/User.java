/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vanshika
 */
class User {
    private int sno;
    private String bname,location,state,phone;
   // private int phone;
    public User(int sno,String bname,String location,String phone,String state)
    {   this.sno=sno;
        this.bname=bname;
        this.location=location;
        this.phone=phone;
        this.state=state;
        
        
       
        
    }
    public int getsno()
    {  
        return sno;
    }
    
    public String getname()
    {
        return bname;
        
    }
    public String getlocation()
    {
        return location;
        
    }
    public String getstate()
    {
        return state;
        
    }
    public String getnumber()
    {
        return phone;
        
    }
}
