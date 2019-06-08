/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.first.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Makis
 */
@Entity
@Table(name = "trainer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trainer.findAll", query = "SELECT t FROM Trainer t")
    , @NamedQuery(name = "Trainer.findByIdtrainer", query = "SELECT t FROM Trainer t WHERE t.idtrainer = :idtrainer")
    , @NamedQuery(name = "Trainer.findByFirstname", query = "SELECT t FROM Trainer t WHERE t.firstname = :firstname")
    , @NamedQuery(name = "Trainer.findByLastname", query = "SELECT t FROM Trainer t WHERE t.lastname = :lastname")
    , @NamedQuery(name = "Trainer.findByUsername", query = "SELECT t FROM Trainer t WHERE t.username = :username")
    , @NamedQuery(name = "Trainer.findByPasswords", query = "SELECT t FROM Trainer t WHERE t.passwords = :passwords")})
public class Trainer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtrainer")
    private Integer idtrainer;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "firstname")
    private String firstname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "lastname")
    private String lastname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1045)
    @Column(name = "passwords")
    private String passwords;

    public Trainer() {
    }

    public Trainer(Integer idtrainer) {
        this.idtrainer = idtrainer;
    }

    public Trainer(Integer idtrainer, String firstname, String lastname, String username, String passwords) {
        this.idtrainer = idtrainer;
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.passwords = passwords;
    }

    public Integer getIdtrainer() {
        return idtrainer;
    }

    public void setIdtrainer(Integer idtrainer) {
        this.idtrainer = idtrainer;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswords() {
        return passwords;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtrainer != null ? idtrainer.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trainer)) {
            return false;
        }
        Trainer other = (Trainer) object;
        if ((this.idtrainer == null && other.idtrainer != null) || (this.idtrainer != null && !this.idtrainer.equals(other.idtrainer))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bootcamp.first.model.Trainer[ idtrainer=" + idtrainer + " ]";
    }
    
}
