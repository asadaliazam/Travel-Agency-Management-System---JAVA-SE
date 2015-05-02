/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;




/**
 *
 * @author danial
 */
public class Staff 
{
    private String Name;
    private int staffID;
    private String post;
    private String contact;
    private String address;
    
    public String getAddress() {
        return address;
    }

    public Staff(String Name, String post, String contact, String address) {
        this.Name = Name;
       
        this.post = post;
        this.contact = contact;
        this.address = address;
         this.staffID = 3000 + (int)(Math.random()*1200);
        
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContact() {
        return contact;
    }

    public Staff()
    {
    

    }


    public String getName() {
        return Name;
    }

    public String getPost() {
        return post;
    }

    public int getStaffID() {
        return staffID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }
    
 
    public void deleteStaffHandler(int id)
    {
  //  dbHandlerManagStaff.deleteStaffFromDB(id);
    
    }

    @Override
    public String toString() {
        return Name+"\t"+staffID+"\t"+post+"\t"+contact+"\t"+address;
    }

  

    
}
