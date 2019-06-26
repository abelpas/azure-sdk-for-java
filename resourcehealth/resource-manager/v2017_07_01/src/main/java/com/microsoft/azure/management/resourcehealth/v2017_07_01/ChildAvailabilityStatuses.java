/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcehealth.v2017_07_01;

import rx.Observable;
import com.microsoft.azure.management.resourcehealth.v2017_07_01.implementation.ChildAvailabilityStatusesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ChildAvailabilityStatuses.
 */
public interface ChildAvailabilityStatuses extends HasInner<ChildAvailabilityStatusesInner> {
    /**
     * Gets current availability status for a single resource.
     *
     * @param resourceUri The fully qualified ID of the resource, including the resource name and resource type. Currently the API only support one nesting level resource types : /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resource-provider-name}/{parentResourceType}/{parentResourceName}/{resourceType}/{resourceName}
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AvailabilityStatus> getByResourceAsync(String resourceUri);

    /**
     * Lists the historical availability statuses for a single child resource. Use the nextLink property in the response to get the next page of availability status.
     *
     * @param resourceUri The fully qualified ID of the resource, including the resource name and resource type. Currently the API only support one nesting level resource types : /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resource-provider-name}/{parentResourceType}/{parentResourceName}/{resourceType}/{resourceName}
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AvailabilityStatus> listAsync(final String resourceUri);

}
