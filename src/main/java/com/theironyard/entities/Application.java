package com.theironyard.entities;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by will on 6/24/16.
 */
@Entity
@Table(name = "applications")
public class Application {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String companyName;

    @Column(nullable = false)
    String contactName;

    @Column(nullable = false)
    String contactPhoneNumber;

    @Column(nullable = false)
    String positionTitle;

    @Column(nullable = false)
    String companyLogo;

    @ManyToOne
    User user;

    public Application() {
    }


    public Application(String companyName, String contactName, String contactPhoneNumber, String positionTitle, String companyLogo, User user) {
        this.companyName = companyName;
        this.contactName = contactName;
        this.contactPhoneNumber = contactPhoneNumber;
        this.positionTitle = positionTitle;
        this.companyLogo = companyLogo;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }


    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
