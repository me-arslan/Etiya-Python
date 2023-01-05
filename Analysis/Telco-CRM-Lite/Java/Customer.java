package com.etiya.crmlite.entities.concretes;

import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table(name = "CUST")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer   extends BaseEntity {
    @Id
    @SequenceGenerator(name = "customerSeq", sequenceName = "CUST_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customerSeq")
    @Column(name = "CUST_ID")
    private Long customerId;  //
    @Column(name = "ST_ID")
    private Long stID ;



    @OneToMany(mappedBy = "customer")//customer
    private List<CustomerAccount>customerAccounts;

    @OneToOne
    @JoinColumn(name = "PARTY_ROLE_ID",unique = true)
    private PartyRole partyRole;

    @ManyToOne
    @JoinColumn(name = "CUST_TP_ID")
    private CustomerType customerType;



}
