package org.fablab.labank.dto;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by kprim on 02/02/2017.
 */

@Entity
@Table(name = "Profile")
public class Profile {

    // ------------------------
    // PRIVATE FIELDS
    // ------------------------

    // An autogenerated id (unique for each defined profile in the db)
    @Id
    @Column(name = "profileID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idProfile;

    // The profile's label
    @NotNull
    @Column(name = "Profile")
    private String profile;


    // ------------------------
    // PUBLIC METHODS
    // ------------------------

    public Profile() { }

    public Profile(long idProfile) {
        this.idProfile = idProfile;
    }

    public long getIdProfile() {
        return idProfile;
    }

    public void setIdProfile(long idProfile) {
        this.idProfile = idProfile;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

}
