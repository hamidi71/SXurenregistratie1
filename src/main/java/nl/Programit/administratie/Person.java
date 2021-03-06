package nl.Programit.administratie;

import java.time.LocalDate;

public abstract class Person {
	private int entryNumber;
	private String firstName;
	private String lastName;
	private String street;
	private String zipCode;
	private String city;
	private int houseNr;
	private LocalDate birthDay;
	private String bankAccountID;
	private int pin;
	private String emailAddress;
	private String gender;

	public int getEntryNumber() {
		return entryNumber;
	}
	public void setEntryNumber(int entryNumber) {
		this.entryNumber = entryNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
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
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getHouseNr() {
		return houseNr;
	}
	public void setHouseNr(int houseNr) {
		this.houseNr = houseNr;
	}
	public LocalDate getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}
	public String getBirthDayString(){
		if (this.getBirthDay() == null) return null;
		else return this.getBirthDay().toString();
	}
	public void setBirthdayStringInput(String databaseDate){
		if (databaseDate.equals("null")) return;
		else {
			int year = Integer.parseInt(databaseDate.substring(0, databaseDate.indexOf("-")));
			int month = Integer.parseInt(databaseDate.substring(databaseDate.indexOf("-") + 1, databaseDate.lastIndexOf("-")));
			int day = Integer.parseInt(databaseDate.substring(databaseDate.lastIndexOf("-") + 1, databaseDate.length()));
			this.setBirthDay(LocalDate.of(year, month, day));
		}
	}
	public String getBankAccountID() {
		return bankAccountID;
	}
	public void setBankAccountID(String bankAccountID) {
		this.bankAccountID = bankAccountID;
	}
}