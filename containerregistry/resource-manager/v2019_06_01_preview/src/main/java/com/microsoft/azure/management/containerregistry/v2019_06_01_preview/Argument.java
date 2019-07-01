/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of a run argument.
 */
public class Argument {
    /**
     * The name of the argument.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The value of the argument.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Flag to indicate whether the argument represents a secret and want to be
     * removed from build logs.
     */
    @JsonProperty(value = "isSecret")
    private Boolean isSecret;

    /**
     * Get the name of the argument.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the argument.
     *
     * @param name the name value to set
     * @return the Argument object itself.
     */
    public Argument withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value of the argument.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value of the argument.
     *
     * @param value the value value to set
     * @return the Argument object itself.
     */
    public Argument withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get flag to indicate whether the argument represents a secret and want to be removed from build logs.
     *
     * @return the isSecret value
     */
    public Boolean isSecret() {
        return this.isSecret;
    }

    /**
     * Set flag to indicate whether the argument represents a secret and want to be removed from build logs.
     *
     * @param isSecret the isSecret value to set
     * @return the Argument object itself.
     */
    public Argument withIsSecret(Boolean isSecret) {
        this.isSecret = isSecret;
        return this;
    }

}
