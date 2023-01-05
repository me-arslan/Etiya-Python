package com.etiya.crmlite.entities.concretes;

import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "CUST_TP")
public class CustomerType extends BaseEntity {

    @Id
    @SequenceGenerator(name = "custTpSeq", sequenceName = "CUST_TP_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custTpSeq")
    @Column(name = "CUST_TP_ID")
    private Long custTpId;  //
    //

    @Column(name = "NAME")
    private String name;
    @Column(name = "DESCR")
    private String description;
    @Column(name = "PARTY_TP_ID")
    private Long partyTypeId;
    @Column(name = "SHRT_CODE")
    private String shortCode;
    @Column(name = "IS_ACTV")
    private Long isActive;

    @OneToMany(mappedBy = "customerType")
    private List<Customer> customers;



}
