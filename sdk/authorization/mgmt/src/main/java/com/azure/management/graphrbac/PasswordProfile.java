// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * The PasswordProfile model.
 */
@Fluent
public final class PasswordProfile {
    /*
     * Password
     */
    @JsonProperty(value = "password", required = true)
    private String password;

    /*
     * Whether to force a password change on next login.
     */
    @JsonProperty(value = "forceChangePasswordNextLogin")
    private Boolean forceChangePasswordNextLogin;

    /*
     * The password profile associated with a user.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * Get the password property: Password.
     * 
     * @return the password value.
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Set the password property: Password.
     * 
     * @param password the password value to set.
     * @return the PasswordProfile object itself.
     */
    public PasswordProfile setPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the forceChangePasswordNextLogin property: Whether to force a
     * password change on next login.
     * 
     * @return the forceChangePasswordNextLogin value.
     */
    public Boolean isForceChangePasswordNextLogin() {
        return this.forceChangePasswordNextLogin;
    }

    /**
     * Set the forceChangePasswordNextLogin property: Whether to force a
     * password change on next login.
     * 
     * @param forceChangePasswordNextLogin the forceChangePasswordNextLogin
     * value to set.
     * @return the PasswordProfile object itself.
     */
    public PasswordProfile setForceChangePasswordNextLogin(Boolean forceChangePasswordNextLogin) {
        this.forceChangePasswordNextLogin = forceChangePasswordNextLogin;
        return this;
    }

    /**
     * Get the additionalProperties property: The password profile associated
     * with a user.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: The password profile associated
     * with a user.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the PasswordProfile object itself.
     */
    public PasswordProfile setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }
}