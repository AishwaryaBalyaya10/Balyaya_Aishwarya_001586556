/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.File;
import java.util.Date;

/**
 *
 * @author aishw
 */


public class Profile {
    private String Name;
    private String Geographic_data;
    private Date Date_of_Birth;
    private long Telephone_Number;
    private long FAX_number;
    private String Email_address;
    private String Social_Security_Number;
    private long Medical_record_number;
    private long Health_Plan_Beneficiary_Number;
    private long Bank_Account_Number;
    private long Certificate_or_License_Number;
    private String Vehicle_identifier_and_Serial_number_including_license_plate;
    private int Device_Identifiers_and_Serial_number;
    private String LinkedIn;
    private String Internet_Protocol_Address;
    private File biometric_Photo;
    private long unique_identifier;

    public File getBiometric_Photo() {
        return biometric_Photo;
    }

    public void setBiometric_Photo(File biometric_Photo) {
        this.biometric_Photo = biometric_Photo;
    }
   
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGeographic_data() {
        return Geographic_data;
    }

    public void setGeographic_data(String Geographic_data) {
        this.Geographic_data = Geographic_data;
    }

    public Date getDate_of_Birth() {
        return Date_of_Birth;
    }

    public void setDate_of_Birth(Date Date_of_Birth) {
        this.Date_of_Birth = Date_of_Birth;
    }

    public long getTelephone_Number() {
        return Telephone_Number;
    }

    public void setTelephone_Number(long Telephone_Number) {
        this.Telephone_Number = Telephone_Number;
    }

    public long getFAX_number() {
        return FAX_number;
    }

    public void setFAX_number(long FAX_number) {
        this.FAX_number = FAX_number;
    }

    public String getEmail_address() {
        return Email_address;
    }

    public void setEmail_address(String Email_address) {
        this.Email_address = Email_address;
    }

    public String getSocial_Security_Number() {
        return Social_Security_Number;
    }

    public void setSocial_Security_Number(String Social_Security_Number) {
        this.Social_Security_Number = Social_Security_Number;
    }

    public long getMedical_record_number() {
        return Medical_record_number;
    }

    public void setMedical_record_number(long Medical_record_number) {
        this.Medical_record_number = Medical_record_number;
    }

    public long getHealth_Plan_Beneficiary_Number() {
        return Health_Plan_Beneficiary_Number;
    }

    public void setHealth_Plan_Beneficiary_Number(long Health_Plan_Beneficiary_Number) {
        this.Health_Plan_Beneficiary_Number = Health_Plan_Beneficiary_Number;
    }

    public long getBank_Account_Number() {
        return Bank_Account_Number;
    }

    public void setBank_Account_Number(long Bank_Account_Number) {
        this.Bank_Account_Number = Bank_Account_Number;
    }

    public long getCertificate_or_License_Number() {
        return Certificate_or_License_Number;
    }

    public void setCertificate_or_License_Number(long Certificate_or_License_Number) {
        this.Certificate_or_License_Number = Certificate_or_License_Number;
    }

    public String getVehicle_identifier_and_Serial_number_including_license_plate() {
        return Vehicle_identifier_and_Serial_number_including_license_plate;
    }

    public void setVehicle_identifier_and_Serial_number_including_license_plate(String Vehicle_identifier_and_Serial_number_including_license_plate) {
        this.Vehicle_identifier_and_Serial_number_including_license_plate = Vehicle_identifier_and_Serial_number_including_license_plate;
    }

    public int getDevice_Identifiers_and_Serial_number() {
        return Device_Identifiers_and_Serial_number;
    }

    public void setDevice_Identifiers_and_Serial_number(int Device_Identifiers_and_Serial_number) {
        this.Device_Identifiers_and_Serial_number = Device_Identifiers_and_Serial_number;
    }

    public String getLinkedIn() {
        return LinkedIn;
    }

    public void setLinkedIn(String LinkedIn) {
        this.LinkedIn = LinkedIn;
    }

    public String getInternet_Protocol_Address() {
        return Internet_Protocol_Address;
    }

    public void setInternet_Protocol_Address(String Internet_Protocol_Address) {
        this.Internet_Protocol_Address = Internet_Protocol_Address;
    }
    
   public long getUnique_identifier() {
        return unique_identifier;
    }

    public void setUnique_identifier(long unique_identifier) {
        this.unique_identifier = unique_identifier;
    }
    
}
