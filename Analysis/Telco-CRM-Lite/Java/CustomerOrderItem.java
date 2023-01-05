package com.etiya.crmlite.entities.concretes;

import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "CUST_ORD_ITEM")
public class CustomerOrderItem  extends BaseEntity {
    @Id
    @SequenceGenerator(name = "customerOrderItemSeq", sequenceName = "CUST_ORD_ITEM_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customerOrderItemSeq")
    @Column(name = "CUST_ORD_ITEM_ID")
    private Long customerOrderItemId;

    @Column(name = "CUST_ACCT_ID")
    private Long customerAcctId;
    @Column(name = "NEW_CUST_ACCT_ID")
    private Long newCustomerAcctId;
    @Column(name = "PROD_ID")
    private Long productId ;
    @Column(name = "PROD_OFR_ID")
    private Long productOfrId ;
    @Column(name = "CMPG_ID")
    private Long cmpgId ;
    @Column(name = "IS_NEED_SHPMT")
    private Long ısNeedShpmt;
    @Column(name = "OFR_NAME")
    private String ofrName;
    @Column(name = "PROD_NAME")
    private String productName ;
    @Column(name = "PROD_SPEC_ID")
    private Long productSpecId ;
    @Column(name = "CUST_ID")
    private Long customerId ;
    @Column(name = "NEW_CUST_ID")
    private Long newCustId ;
    @Column(name = "CMPG_NAME")
    private String cmpgName ;


    @ManyToOne
    @JoinColumn(name = "BSN_INTER_ID")
    private BusinessInteraction businessInteraction;

    @ManyToOne
    @JoinColumn(name = "CUST_ORD_ID")
    private CustomerOrder customerOrder;
}
