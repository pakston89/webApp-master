package com.webApp.webApp.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name ="users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "nif")
	private String nif;

	@Column(name = "card_number")
	private String cardNumber;

	@Column(name = "secret_key")
	private String secretKey;

	@Column(name = "salt")
	private String salt;

	@Column(name = "registration_date")
	private LocalDate registrationDate;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "password")
	private String password;

	@Column(name = "active")
	private Boolean active;

	@Column(name = "roles")
	private String roles;

	public User() {

	}

	public User(Integer id, String firstName, String lastName, String nif, String cardNumber, LocalDate registrationDate, String userName, String password, Boolean active, String roles) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nif = nif;
		this.cardNumber = cardNumber;
		this.registrationDate = registrationDate;
		this.userName = userName;
		this.password = password;
		this.active = active;
		this.roles = roles;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", nif='" + nif + '\'' +
				", cardNumber='" + cardNumber + '\'' +
				", secretKey='" + secretKey + '\'' +
				", salt='" + salt + '\'' +
				", registrationDate=" + registrationDate +
				", userName='" + userName + '\'' +
				", password='" + password + '\'' +
				", active=" + active +
				", roles='" + roles + '\'' +
				'}';
	}
}

