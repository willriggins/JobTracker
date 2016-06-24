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
    LocalDate dateApplied;

    @Column(nullable = false)
    LocalDate lastContactDate;

    @ManyToOne
    User user;

    public Application() {
    }

    public Application(String companyName, String contactName, String contactPhoneNumber, String positionTitle, LocalDate dateApplied, LocalDate lastContactDate, User user) {
        this.companyName = companyName;
        this.contactName = contactName;
        this.contactPhoneNumber = contactPhoneNumber;
        this.positionTitle = positionTitle;
        this.dateApplied = dateApplied;
        this.lastContactDate = lastContactDate;
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

    public LocalDate getDateApplied() {
        return dateApplied;
    }

    public void setDateApplied(LocalDate dateApplied) {
        this.dateApplied = dateApplied;
    }

    public LocalDate getLastContactDate() {
        return lastContactDate;
    }

    public void setLastContactDate(LocalDate lastContactDate) {
        this.lastContactDate = lastContactDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
