package com.etiya.crmlite.entities.concretes;

import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name ="PROD_SPEC_CHAR_USE" )
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductSpecCharUse extends BaseEntity {
    @Id
    @SequenceGenerator(name = "productSpecCharUseSeq", sequenceName = "PROD_SPEC_CHAR_USE_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "productSpecCharUseSeq")
    @Column(name = "PROD_SPEC_CHAR_USE_ID")
    private Long productSpecCharUseId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCR")
    private String description;

    @Column(name = "IS_ACTV")
    private Long isActive;

    @ManyToOne
    @JoinColumn(name = "PROD_SPEC_ID")
    private ProductSpecification productSpecification;


    @ManyToOne
    @JoinColumn(name = "CHAR_ID")
    private GeneralCharacter generalCharacter;
}
