package myapplication.AddressBook;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.swing.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class AddressBook {
    @OneToMany
    private List<BuddyInfo> buddyList;
    @Id @GeneratedValue
    private long id;
    private int selected;
    public AddressBook() {
        this.buddyList = new ArrayList<>();
    }
    /**
     * Gets the id of this Team.
     * @return the id
     */

    public Long getId() {
        return this.id;
    }
    /**
     * Sets the id of this Team to the specified value.
     * @param id the new id
     */
    public void setId(Long id) {
        this.id = id;
    }


    public List<BuddyInfo> getAddressBook(){
        return buddyList;
    }
    public void setAddressBook(List<BuddyInfo> buddyInfos) {
        this.buddyList = buddyInfos;
    }

    public void addBuddy(BuddyInfo buddy) {
        buddyList.add(buddy);
    }

    public void setSelected(int index) {
        this.selected = index;
    }
    public int size() {
        return buddyList.size();
    }
    public void clear() {
        buddyList.clear();
    }

    public String toString() {
        String a="";
        for(BuddyInfo buddy:buddyList) {
            a = a + buddy.getName()+" "+buddy.getAddress()+" "+buddy.getPhonenum()+"\n";
        }
        return a;
    }


}
