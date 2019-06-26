/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcehealth.v2017_07_01.implementation;

import com.microsoft.azure.management.resourcehealth.v2017_07_01.OperationDisplay;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Operation available in the resourcehealth resource provider.
 */
public class OperationInner {
    /**
     * Name of the operation.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Properties of the operation.
     */
    @JsonProperty(value = "display")
    private OperationDisplay display;

    /**
     * Get name of the operation.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the operation.
     *
     * @param name the name value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get properties of the operation.
     *
     * @return the display value
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Set properties of the operation.
     *
     * @param display the display value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withDisplay(OperationDisplay display) {
        this.display = display;
        return this;
    }

}
