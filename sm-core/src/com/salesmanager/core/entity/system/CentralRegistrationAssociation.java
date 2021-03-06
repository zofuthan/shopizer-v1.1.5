/*
 * Licensed to csti consulting 
 * You may obtain a copy of the License at
 *
 * http://www.csticonsulting.com
 * Copyright (c) 2006-Aug 24, 2010 Consultation CS-TI inc. 
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.salesmanager.core.entity.system;

// Generated Nov 11, 2009 9:19:10 AM by Hibernate Tools 3.2.4.GA

import java.util.Date;

/**
 * CentralRegistrationAssociation generated by hbm2java
 */
public class CentralRegistrationAssociation implements java.io.Serializable {

	private Integer centralRegistrationAssociationId;
	private int merchantRegistrationDefCode;
	private String centralGroupCode;
	private String centralFunctionCode;
	private int promotionCode;
	private Date lastModified;

	public CentralRegistrationAssociation() {
	}

	public CentralRegistrationAssociation(int merchantRegistrationDefCode,
			String centralGroupCode, String centralFunctionCode,
			int promotionCode) {
		this.merchantRegistrationDefCode = merchantRegistrationDefCode;
		this.centralGroupCode = centralGroupCode;
		this.centralFunctionCode = centralFunctionCode;
		this.promotionCode = promotionCode;
	}

	public CentralRegistrationAssociation(int merchantRegistrationDefCode,
			String centralGroupCode, String centralFunctionCode,
			int promotionCode, Date lastModified) {
		this.merchantRegistrationDefCode = merchantRegistrationDefCode;
		this.centralGroupCode = centralGroupCode;
		this.centralFunctionCode = centralFunctionCode;
		this.promotionCode = promotionCode;
		this.lastModified = lastModified;
	}

	public Integer getCentralRegistrationAssociationId() {
		return this.centralRegistrationAssociationId;
	}

	public void setCentralRegistrationAssociationId(
			Integer centralRegistrationAssociationId) {
		this.centralRegistrationAssociationId = centralRegistrationAssociationId;
	}

	public int getMerchantRegistrationDefCode() {
		return this.merchantRegistrationDefCode;
	}

	public void setMerchantRegistrationDefCode(int merchantRegistrationDefCode) {
		this.merchantRegistrationDefCode = merchantRegistrationDefCode;
	}

	public String getCentralGroupCode() {
		return this.centralGroupCode;
	}

	public void setCentralGroupCode(String centralGroupCode) {
		this.centralGroupCode = centralGroupCode;
	}

	public String getCentralFunctionCode() {
		return this.centralFunctionCode;
	}

	public void setCentralFunctionCode(String centralFunctionCode) {
		this.centralFunctionCode = centralFunctionCode;
	}

	public int getPromotionCode() {
		return this.promotionCode;
	}

	public void setPromotionCode(int promotionCode) {
		this.promotionCode = promotionCode;
	}

	public Date getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

}
