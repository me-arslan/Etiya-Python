package com.etiya.crmlite.entities.concretes;
//Hesaba bagli ürünlerin tutuldugu tablodur.Product-Customer Account ara tablosu.
import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "CUST_ACCT_PROD_INVL")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerAccountProductInvolvment   extends BaseEntity {

    @Id
    @SequenceGenerator(name = "custAcctProdInvlSeq", sequenceName = "CUST_ACCT_PROD_INVL_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custAcctProdInvlSeq")
    @Column(name = "CUST_ACCT_PROD_INVL_ID")//customer tarafından onaylanmış product ıd
    private Long custAcctProdInvlId;  //

    @Column(name = "SHRT_CODE")//kısa kodu
    private String shortCode;

    @Column(name = "ST_ID")
    private Long stId;

    @ManyToOne
    @JoinColumn(name = "PROD_ID")
    private Product product;


    @ManyToOne
    @JoinColumn(name = "CUST_ACCT_ID")
    private CustomerAccount customerAccount;
}
