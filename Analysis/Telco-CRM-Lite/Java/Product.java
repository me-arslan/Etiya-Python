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
@Table(name = "PROD")
public class Product extends BaseEntity {
    @Id
    @SequenceGenerator(name = "prodSeq", sequenceName = "PROD_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prodSeq")
    @Column(name = "PROD_ID")
    private Long prodId;  //
    @Column(name = "NAME")
    private String name;
    @Column(name = "DESCR")
    private String description;
    @Column(name = "TRNSC_ID")
    private Long trnscId;
    @Column(name = "CMPG_ID")
    private Long cmpgId;
    @Column(name = "ST_ID")
    private Long stId;





    @ManyToOne
    @JoinColumn(name = "PROD_OFR_ID")
    private ProductionOffering productOffering;
    @ManyToOne
    @JoinColumn(name = "PROD_SPEC_ID")
    private ProductSpecification productSpecification;

    @OneToMany(mappedBy = "product")
    private List<CustomerAccountProductInvolvment> customerAccountProductInvolvments;

    @OneToMany(mappedBy = "product")
    private List<ProductCharacteristicValue>productCharacteristicValues;

    @OneToMany(mappedBy = "product1")
    private List<ProductionRelation>productionRelations;

    @OneToMany(mappedBy = "product2")
    private List<ProductionRelation>productionRelations2;
//*****************************************************
    @OneToMany(mappedBy = "parentProduct")
    List<Product> childProducts;

    @ManyToOne
    @JoinColumn(name = "PRNT_PROD_ID")
    private Product parentProduct;
//*****************************************************


}
