/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ComputeNodeRebootOption.
 */
public enum ComputeNodeRebootOption {
    /** Enum value requeue. */
    REQUEUE("requeue"),

    /** Enum value terminate. */
    TERMINATE("terminate"),

    /** Enum value taskCompletion. */
    TASK_COMPLETION("taskCompletion"),

    /** Enum value retainedData. */
    RETAINED_DATA("retainedData");

    /** The actual serialized value for a ComputeNodeRebootOption instance. */
    private String value;

    ComputeNodeRebootOption(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ComputeNodeRebootOption instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ComputeNodeRebootOption object, or null if unable to parse.
     */
    @JsonCreator
    public static ComputeNodeRebootOption fromString(String value) {
        ComputeNodeRebootOption[] items = ComputeNodeRebootOption.values();
        for (ComputeNodeRebootOption item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
