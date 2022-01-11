package io.javabrains.springsecurityjpajavabrains.Entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail {

	@Id
	@SequenceGenerator(name = "orderDetail_sequence", sequenceName = "orderDetail_sequence", allocationSize = 1)
	@GeneratedValue(generator = "orderDetail_sequence", strategy = GenerationType.SEQUENCE)
	private Long uniqueOrderNumber;
	private Double orderNumber;
	private String status;
	private Date creationDate;
	private Date creationTime;
	private Double storeCredit;
	private Double amount;
	private String orderUsername;
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private User user;
}
