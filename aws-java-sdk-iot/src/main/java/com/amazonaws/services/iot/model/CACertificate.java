/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * A CA certificate.
 * </p>
 */
public class CACertificate implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the CA certificate.
     * </p>
     */
    private String certificateArn;
    /**
     * <p>
     * The ID of the CA certificate.
     * </p>
     */
    private String certificateId;
    /**
     * <p>
     * The status of the CA certificate.
     * </p>
     * <p>
     * The status value REGISTER_INACTIVE is deprecated and should not be used.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date the CA certificate was created.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The ARN of the CA certificate.
     * </p>
     * 
     * @param certificateArn
     *        The ARN of the CA certificate.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The ARN of the CA certificate.
     * </p>
     * 
     * @return The ARN of the CA certificate.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * The ARN of the CA certificate.
     * </p>
     * 
     * @param certificateArn
     *        The ARN of the CA certificate.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CACertificate withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * <p>
     * The ID of the CA certificate.
     * </p>
     * 
     * @param certificateId
     *        The ID of the CA certificate.
     */

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    /**
     * <p>
     * The ID of the CA certificate.
     * </p>
     * 
     * @return The ID of the CA certificate.
     */

    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * <p>
     * The ID of the CA certificate.
     * </p>
     * 
     * @param certificateId
     *        The ID of the CA certificate.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CACertificate withCertificateId(String certificateId) {
        setCertificateId(certificateId);
        return this;
    }

    /**
     * <p>
     * The status of the CA certificate.
     * </p>
     * <p>
     * The status value REGISTER_INACTIVE is deprecated and should not be used.
     * </p>
     * 
     * @param status
     *        The status of the CA certificate. </p>
     *        <p>
     *        The status value REGISTER_INACTIVE is deprecated and should not be
     *        used.
     * @see CACertificateStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the CA certificate.
     * </p>
     * <p>
     * The status value REGISTER_INACTIVE is deprecated and should not be used.
     * </p>
     * 
     * @return The status of the CA certificate. </p>
     *         <p>
     *         The status value REGISTER_INACTIVE is deprecated and should not
     *         be used.
     * @see CACertificateStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the CA certificate.
     * </p>
     * <p>
     * The status value REGISTER_INACTIVE is deprecated and should not be used.
     * </p>
     * 
     * @param status
     *        The status of the CA certificate. </p>
     *        <p>
     *        The status value REGISTER_INACTIVE is deprecated and should not be
     *        used.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see CACertificateStatus
     */

    public CACertificate withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the CA certificate.
     * </p>
     * <p>
     * The status value REGISTER_INACTIVE is deprecated and should not be used.
     * </p>
     * 
     * @param status
     *        The status of the CA certificate. </p>
     *        <p>
     *        The status value REGISTER_INACTIVE is deprecated and should not be
     *        used.
     * @see CACertificateStatus
     */

    public void setStatus(CACertificateStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the CA certificate.
     * </p>
     * <p>
     * The status value REGISTER_INACTIVE is deprecated and should not be used.
     * </p>
     * 
     * @param status
     *        The status of the CA certificate. </p>
     *        <p>
     *        The status value REGISTER_INACTIVE is deprecated and should not be
     *        used.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see CACertificateStatus
     */

    public CACertificate withStatus(CACertificateStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The date the CA certificate was created.
     * </p>
     * 
     * @param creationDate
     *        The date the CA certificate was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the CA certificate was created.
     * </p>
     * 
     * @return The date the CA certificate was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date the CA certificate was created.
     * </p>
     * 
     * @param creationDate
     *        The date the CA certificate was created.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CACertificate withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCertificateArn() != null)
            sb.append("CertificateArn: " + getCertificateArn() + ",");
        if (getCertificateId() != null)
            sb.append("CertificateId: " + getCertificateId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CACertificate == false)
            return false;
        CACertificate other = (CACertificate) obj;
        if (other.getCertificateArn() == null
                ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null
                && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getCertificateId() == null ^ this.getCertificateId() == null)
            return false;
        if (other.getCertificateId() != null
                && other.getCertificateId().equals(this.getCertificateId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null
                && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCertificateArn() == null) ? 0 : getCertificateArn()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCertificateId() == null) ? 0 : getCertificateId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate()
                        .hashCode());
        return hashCode;
    }

    @Override
    public CACertificate clone() {
        try {
            return (CACertificate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
