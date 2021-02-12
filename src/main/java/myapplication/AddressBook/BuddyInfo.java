package myapplication.AddressBook;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class BuddyInfo implements Serializable {
    private String name;
    private String address;
    private String phonenum;

    @Id @GeneratedValue
    long id;


    public BuddyInfo(){
        this.name = "zewen";
        this.address = "default address";
        this.phonenum = "default phoneNum";
    }
    public BuddyInfo(String name,String address,String phonenum) {
        this.name = name;
        this.address = address;
        this.phonenum = phonenum;
    }

    /**
     * Gets the id of this myapplication.AddressBook.BuddyInfo.
     * @return the id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Sets the id of this myapplication.AddressBook.BuddyInfo to the specified value.
     * @param id the new id
     */
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null) return false;
        if(!(o instanceof BuddyInfo))return false;
        BuddyInfo bi = (BuddyInfo) o;
        return (bi.name.equals(this.name)&& bi.phonenum.equals(this.phonenum)&& bi.address.equals(this.address));

    }

    @Override
    public String toString() {
        return name + "#" + address + "#" + phonenum;
    }


}
