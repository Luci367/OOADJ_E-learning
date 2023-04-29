package com.ooadj.ooadj;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LEARNER",schema = "elearning")
public class learner
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public Long id;

    @Column(name = "username")
    public String username;

    @Column(name = "firstname")
    public String firstname;

    @Column(name = "lastname")
    public String lastname;

    @Column(name = "email_id")
    public String email_id;

    @Column(name = "password")
    private String password;

    @Column(name = "contact_no")
    public String contact_no;


    public Long getId() 
    {
      return id;
    }
  
    public void setId(Long id) {
      this.id = id;
    }
  
    public String getUsername()
    {
      return username;
    }
  
    public void setUsername(String username)
    {
      this.username = username;
    }
  
    public String getFirstname() {
      return firstname;
    }
  
    public void setFirstname(String firstname) 
    {
      this.firstname = firstname;
    }
  
    public String getLastname()
    {
      return lastname;
    }
  
    public void setLastname(String lastname) {
      this.lastname = lastname;
    }
  
    public String getEmail_id() 
    {
      return email_id;
    }
    
    public void setEmail_id(String email_id) 
    {
      this.email_id = email_id;
    }

    public String getPassword()
    {
      return password;
    }
      
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public String getContact_no()
    {
      return contact_no;
    }
    
    public void setContact_no(String contact_no)
    {
      this.contact_no = contact_no;
    }

    private learner() {}
}
