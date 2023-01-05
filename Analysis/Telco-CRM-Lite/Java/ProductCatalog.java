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
@Table(name = "PROD_CATAL")
//Ürün Katalog tanimindan olusan ürün kataloglarinin tutuldugu tablodur
public class ProductCatalog extends BaseEntity {
    @Id
    @SequenceGenerator(name = "productCatalogSeq", sequenceName = "PROD_CATAL_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "productCatalogSeq")
    @Column(name = "PROD_CATAL_ID")
    private Long productCatalogId;  //
    @Column(name = "NAME")
    private String name;
    @Column(name = "DESCR")
    private String description;
    @Column(name = "ST_ID")
    private Long cmpgId;
    @Column(name = "SHRT_CODE")
    private String shortCode;


    @OneToMany(mappedBy = "productCatalog")
    List<ProductionCatalogProductionOffer> productionCatalogProductionOffers;

}
