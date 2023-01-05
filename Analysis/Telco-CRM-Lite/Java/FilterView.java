package com.etiya.crmlite.entities.concretes;


import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "FLTR_VIEW")
public class FilterView  extends BaseEntity {


    @Column(name = "CUST_ID")
    private Long customerId;

    @Column(name = "NAT_ID")
    private Long natId;

    @Column(name = "FRST_NAME")
    private String  firstName;

    @Column(name = "MNAME")
    private String middleName;

    @Column(name = "LST_NAME")
    private String lastName;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CNTC_ORD_ID")
    private String cntcOrderId;

    @Column(name = "CUST_ORD_ID")
    private Long customerOrderId;

    @Column(name = "CUST_ACCT_ID")
    private Long customerAcctId;

}
