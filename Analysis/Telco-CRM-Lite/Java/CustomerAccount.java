package com.etiya.crmlite.entities.concretes;
//Müsteri hesap bilgilerinin tutuldugu tablodur.


import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CUST_ACCT")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerAccount   extends BaseEntity {

    @Id
    @SequenceGenerator(name = "custAcctSeq", sequenceName = "CUST_ACCT_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custAcctSeq")
    @Column(name = "CUST_ACCT_ID")
    private Long custAcctId;  //

    @Column(name = "ACCT_NO") // Hesap no.
    private String  accountNo;

    @Column(name = "ACCT_NAME")
    private String accountName;

    @Column(name = "ST_ID")
    private Long stId;

    @Column(name = "ACCT_TP_ID")  //Hesap tipi bilgisidir.
    private Long accountTypeId;

    @OneToMany(mappedBy = "customerAccount")
    private List<CustomerAccountProductInvolvment> ustomerAccountProductInvolvments;

    @ManyToOne
    @JoinColumn(name = "CUST_ID")
    private Customer customer;


}
