package org.hypernovae.apps.models.bank;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * A bank entity and an associate controller and repository (illustration purpose only)
 * @author LOMPO
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "bank")
public class Bank implements Serializable {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(unique=true)
	private String designation;
	
	@Column(name="CREATION_DATE", nullable=true)
	private Date creationDate;
	
	/**
	 * It is also the same as the BIC code
	 */
	@Column(name="SWIFT_CODE",nullable=true)
	private String swiftCode;
	
	
	private String role = "ROLE_BANK_ADMIN";
	
	

	public Bank() {
	}


	public Bank(String designation, Date creationDate, String swiftCode,
			 String role) {
		super();
		this.designation = designation;
		this.creationDate = creationDate;
		this.swiftCode = swiftCode;
		
		this.role = role;
	}
	
	
	public Bank(String designation, String swiftCode,  String role) {
		
		this(designation, null, swiftCode, role);
	}
	
	
	public Bank(String designation,  String role) {
		this(designation, null,  role);
	
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getCreationDate() {
		return  (Date)creationDate.clone();
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = (Date)creationDate.clone();
	}

	public String getSwiftCode() {
		return swiftCode;
	}

	public void setSwiftCode(String swiftCode) {
		this.swiftCode = swiftCode;
	}

	

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
