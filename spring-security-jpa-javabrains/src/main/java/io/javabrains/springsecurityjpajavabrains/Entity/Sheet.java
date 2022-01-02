package io.javabrains.springsecurityjpajavabrains.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sheet {

@Id
@SequenceGenerator(name = "sheet_sequence",sequenceName = "sheet_sequence",allocationSize = 1)
@GeneratedValue(generator = "sheet_sequence",strategy = GenerationType.SEQUENCE)
private double uniqueOrderNumber;
private	Double orderNumber;
private	String status;
private	String creationDate;
private	String creationTime;
private	String storeCredit;
private	Double amount;
private	String userName;
}
