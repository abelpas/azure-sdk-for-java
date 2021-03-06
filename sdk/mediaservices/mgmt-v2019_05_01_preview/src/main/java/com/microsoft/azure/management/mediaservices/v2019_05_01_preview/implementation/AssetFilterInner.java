/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2019_05_01_preview.implementation;

import com.microsoft.azure.management.mediaservices.v2019_05_01_preview.PresentationTimeRange;
import com.microsoft.azure.management.mediaservices.v2019_05_01_preview.FirstQuality;
import java.util.List;
import com.microsoft.azure.management.mediaservices.v2019_05_01_preview.FilterTrackSelection;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * An Asset Filter.
 */
@JsonFlatten
public class AssetFilterInner extends ProxyResource {
    /**
     * The presentation time range.
     */
    @JsonProperty(value = "properties.presentationTimeRange")
    private PresentationTimeRange presentationTimeRange;

    /**
     * The first quality.
     */
    @JsonProperty(value = "properties.firstQuality")
    private FirstQuality firstQuality;

    /**
     * The tracks selection conditions.
     */
    @JsonProperty(value = "properties.tracks")
    private List<FilterTrackSelection> tracks;

    /**
     * Get the presentation time range.
     *
     * @return the presentationTimeRange value
     */
    public PresentationTimeRange presentationTimeRange() {
        return this.presentationTimeRange;
    }

    /**
     * Set the presentation time range.
     *
     * @param presentationTimeRange the presentationTimeRange value to set
     * @return the AssetFilterInner object itself.
     */
    public AssetFilterInner withPresentationTimeRange(PresentationTimeRange presentationTimeRange) {
        this.presentationTimeRange = presentationTimeRange;
        return this;
    }

    /**
     * Get the first quality.
     *
     * @return the firstQuality value
     */
    public FirstQuality firstQuality() {
        return this.firstQuality;
    }

    /**
     * Set the first quality.
     *
     * @param firstQuality the firstQuality value to set
     * @return the AssetFilterInner object itself.
     */
    public AssetFilterInner withFirstQuality(FirstQuality firstQuality) {
        this.firstQuality = firstQuality;
        return this;
    }

    /**
     * Get the tracks selection conditions.
     *
     * @return the tracks value
     */
    public List<FilterTrackSelection> tracks() {
        return this.tracks;
    }

    /**
     * Set the tracks selection conditions.
     *
     * @param tracks the tracks value to set
     * @return the AssetFilterInner object itself.
     */
    public AssetFilterInner withTracks(List<FilterTrackSelection> tracks) {
        this.tracks = tracks;
        return this;
    }

}
