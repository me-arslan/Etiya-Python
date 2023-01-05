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
@Table(name = "PROD_OFR")
public class ProductionOffering extends BaseEntity {
    @Id
    @SequenceGenerator(name = "productOfferingSeq", sequenceName = "PROD_OFR_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "productOfferingSeq")
    @Column(name = "PROD_OFR_ID")
    private Long productionOfferingId;  //

    @Column(name = "NAME")
    private String  name;

    @Column(name = "DESCR")
    private String description;

    @Column(name = "ST_ID")
    private Long st_Id;

    @Column(name = "PROD_OFR_TOTAL_PRC")//Total price
    private Long productOfferTotalPrice;

    @Column(name = "PRNT_OFR_ID")//Indirim ve taahhütün nereye olacagini belirtir.
    private Long printOfferId;

    @ManyToOne
    @JoinColumn(name= "PROD_SPEC_ID")
    private ProductSpecification productSpecification;

    @OneToMany(mappedBy = "productOffering")
    List<Product> products;

    @OneToMany(mappedBy = "productOffering")
    List<CampaignProductOffering> campaignProductOfferings;

    @OneToMany(mappedBy = "productOffering")
    List<ProductionCatalogProductionOffer> productionCatalogProductionOffers;



}
