/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_07_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Backup policy Details for create and update.
 */
@JsonFlatten
public class BackupPolicyPatch extends Resource {
    /**
     * Name of backup policy.
     */
    @JsonProperty(value = "properties.name", access = JsonProperty.Access.WRITE_ONLY)
    private String name1;

    /**
     * Azure lifecycle management.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Daily backups count to keep.
     */
    @JsonProperty(value = "properties.dailyBackupsToKeep")
    private Integer dailyBackupsToKeep;

    /**
     * Weekly backups count to keep.
     */
    @JsonProperty(value = "properties.weeklyBackupsToKeep")
    private Integer weeklyBackupsToKeep;

    /**
     * Monthly backups count to keep.
     */
    @JsonProperty(value = "properties.monthlyBackupsToKeep")
    private Integer monthlyBackupsToKeep;

    /**
     * Yearly backups count to keep.
     */
    @JsonProperty(value = "properties.yearlyBackupsToKeep")
    private Integer yearlyBackupsToKeep;

    /**
     * Volumes using current backup policy.
     */
    @JsonProperty(value = "properties.volumesAssigned")
    private Integer volumesAssigned;

    /**
     * The property to decide policy is enabled or not.
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /**
     * A list of volumes assigned to this policy.
     */
    @JsonProperty(value = "properties.volumeBackups")
    private List<VolumeBackups> volumeBackups;

    /**
     * Get name of backup policy.
     *
     * @return the name1 value
     */
    public String name1() {
        return this.name1;
    }

    /**
     * Get azure lifecycle management.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get daily backups count to keep.
     *
     * @return the dailyBackupsToKeep value
     */
    public Integer dailyBackupsToKeep() {
        return this.dailyBackupsToKeep;
    }

    /**
     * Set daily backups count to keep.
     *
     * @param dailyBackupsToKeep the dailyBackupsToKeep value to set
     * @return the BackupPolicyPatch object itself.
     */
    public BackupPolicyPatch withDailyBackupsToKeep(Integer dailyBackupsToKeep) {
        this.dailyBackupsToKeep = dailyBackupsToKeep;
        return this;
    }

    /**
     * Get weekly backups count to keep.
     *
     * @return the weeklyBackupsToKeep value
     */
    public Integer weeklyBackupsToKeep() {
        return this.weeklyBackupsToKeep;
    }

    /**
     * Set weekly backups count to keep.
     *
     * @param weeklyBackupsToKeep the weeklyBackupsToKeep value to set
     * @return the BackupPolicyPatch object itself.
     */
    public BackupPolicyPatch withWeeklyBackupsToKeep(Integer weeklyBackupsToKeep) {
        this.weeklyBackupsToKeep = weeklyBackupsToKeep;
        return this;
    }

    /**
     * Get monthly backups count to keep.
     *
     * @return the monthlyBackupsToKeep value
     */
    public Integer monthlyBackupsToKeep() {
        return this.monthlyBackupsToKeep;
    }

    /**
     * Set monthly backups count to keep.
     *
     * @param monthlyBackupsToKeep the monthlyBackupsToKeep value to set
     * @return the BackupPolicyPatch object itself.
     */
    public BackupPolicyPatch withMonthlyBackupsToKeep(Integer monthlyBackupsToKeep) {
        this.monthlyBackupsToKeep = monthlyBackupsToKeep;
        return this;
    }

    /**
     * Get yearly backups count to keep.
     *
     * @return the yearlyBackupsToKeep value
     */
    public Integer yearlyBackupsToKeep() {
        return this.yearlyBackupsToKeep;
    }

    /**
     * Set yearly backups count to keep.
     *
     * @param yearlyBackupsToKeep the yearlyBackupsToKeep value to set
     * @return the BackupPolicyPatch object itself.
     */
    public BackupPolicyPatch withYearlyBackupsToKeep(Integer yearlyBackupsToKeep) {
        this.yearlyBackupsToKeep = yearlyBackupsToKeep;
        return this;
    }

    /**
     * Get volumes using current backup policy.
     *
     * @return the volumesAssigned value
     */
    public Integer volumesAssigned() {
        return this.volumesAssigned;
    }

    /**
     * Set volumes using current backup policy.
     *
     * @param volumesAssigned the volumesAssigned value to set
     * @return the BackupPolicyPatch object itself.
     */
    public BackupPolicyPatch withVolumesAssigned(Integer volumesAssigned) {
        this.volumesAssigned = volumesAssigned;
        return this;
    }

    /**
     * Get the property to decide policy is enabled or not.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the property to decide policy is enabled or not.
     *
     * @param enabled the enabled value to set
     * @return the BackupPolicyPatch object itself.
     */
    public BackupPolicyPatch withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get a list of volumes assigned to this policy.
     *
     * @return the volumeBackups value
     */
    public List<VolumeBackups> volumeBackups() {
        return this.volumeBackups;
    }

    /**
     * Set a list of volumes assigned to this policy.
     *
     * @param volumeBackups the volumeBackups value to set
     * @return the BackupPolicyPatch object itself.
     */
    public BackupPolicyPatch withVolumeBackups(List<VolumeBackups> volumeBackups) {
        this.volumeBackups = volumeBackups;
        return this;
    }

}
