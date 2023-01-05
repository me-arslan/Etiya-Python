package com.etiya.crmlite.entities.concretes;

import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

// Ürün katalog içersinde yer alan ürün tekliflerinin tutuldugu tablodur.
@Table(name = "PROD_CATAL_PROD_OFR")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductionCatalogProductionOffer extends BaseEntity {
    @Id
    @SequenceGenerator(name = "productionCatalogProductionOfferSeq", sequenceName = "PROD_CATAL_PROD_OFR_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "productionCatalogProductionOfferSeq")
    @Column(name = "PROD_CATAL_PROD_OFR_ID")
    private Long productionCatalogProductionOfferId;

    @Column(name = "ST_ID")
    private Long stId;

    @ManyToOne
    @JoinColumn(name = "PROD_OFR_ID")
    private ProductionOffering productOffering;


    @ManyToOne
    @JoinColumn(name = "PROD_CATAL_ID")
    private ProductCatalog productCatalog;
}
