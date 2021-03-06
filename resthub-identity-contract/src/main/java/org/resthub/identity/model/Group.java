package org.resthub.identity.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Describes a group.<br/>
 * A group has few attributes, a name, a list of {@link User} belonging to this
 * Group and some permissions
 */
@Entity
/* "Group" conflicts with SQL keyword */
@Table(name = "idm_groups")
public class Group extends PermissionsOwner {

    private static final long serialVersionUID = -4082240647340997479L;
    /**
     * name of the group
     */
    protected String name = null;

    /**
     * Default Constructor
     */
    public Group() {

    }

    /**
     * getName
     *
     * @return name of the group
     */
    @Column(unique = true)
    @NotNull
    public String getName() {
        return name;
    }

    /**
     * setName
     *
     * @param name the name to be set for the group
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Display the representation of the group Display the I and the Name of
     * the Group
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
