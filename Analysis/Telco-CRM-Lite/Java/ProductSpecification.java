package com.etiya.crmlite.entities.concretes;

import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Table(name ="PROD_SPEC")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductSpecification extends BaseEntity {
    @Id
    @SequenceGenerator(name = "productSpecSeq", sequenceName = "PROD_SPEC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "productSpecSeq")
    @Column(name = "PROD_SPEC_ID")
    private Long productSpecId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCR")
    private String description;

    @Column(name = "ST_ID")
    private Long stId;

    @Column(name = "IS_DEV")
    private Long isDev;


    @OneToMany(mappedBy = "productSpecification")
    List<ProductionOffering> productionOfferings;

    @OneToMany(mappedBy = "productSpecification")
    List<Product> products;

    @OneToMany(mappedBy = "productSpecification")
    List<ProductSpecCharUse> productSpecCharUses;

    @OneToMany(mappedBy = "productSpecification")
    List<ProductSpecResourceSpec> ProductSpecResourceSpecs;

    @OneToMany(mappedBy = "productSpecification")
    List<ProductSpecServiceSpec> ProductSpecServiceSpecs;


}
