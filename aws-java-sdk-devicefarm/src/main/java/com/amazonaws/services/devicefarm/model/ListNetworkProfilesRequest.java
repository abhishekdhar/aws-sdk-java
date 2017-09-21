/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListNetworkProfiles" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListNetworkProfilesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project for which you want to list network profiles.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The type of network profile you wish to return information about. Valid values are listed below.
     * </p>
     */
    private String type;
    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project for which you want to list network profiles.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the project for which you want to list network profiles.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project for which you want to list network profiles.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the project for which you want to list network profiles.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project for which you want to list network profiles.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the project for which you want to list network profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNetworkProfilesRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The type of network profile you wish to return information about. Valid values are listed below.
     * </p>
     * 
     * @param type
     *        The type of network profile you wish to return information about. Valid values are listed below.
     * @see NetworkProfileType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of network profile you wish to return information about. Valid values are listed below.
     * </p>
     * 
     * @return The type of network profile you wish to return information about. Valid values are listed below.
     * @see NetworkProfileType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of network profile you wish to return information about. Valid values are listed below.
     * </p>
     * 
     * @param type
     *        The type of network profile you wish to return information about. Valid values are listed below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkProfileType
     */

    public ListNetworkProfilesRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of network profile you wish to return information about. Valid values are listed below.
     * </p>
     * 
     * @param type
     *        The type of network profile you wish to return information about. Valid values are listed below.
     * @see NetworkProfileType
     */

    @com.fasterxml.jackson.annotation.JsonIgnore
    public void setType(NetworkProfileType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of network profile you wish to return information about. Valid values are listed below.
     * </p>
     * 
     * @param type
     *        The type of network profile you wish to return information about. Valid values are listed below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkProfileType
     */

    public ListNetworkProfilesRequest withType(NetworkProfileType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this operation, which can be used to return the
     *        next set of items in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @return An identifier that was returned from the previous call to this operation, which can be used to return the
     *         next set of items in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this operation, which can be used to return the
     *        next set of items in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNetworkProfilesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListNetworkProfilesRequest == false)
            return false;
        ListNetworkProfilesRequest other = (ListNetworkProfilesRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListNetworkProfilesRequest clone() {
        return (ListNetworkProfilesRequest) super.clone();
    }

}