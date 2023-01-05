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
//Tanimli kaynak bilgilerinin tutuldugu tablodur
@Table(name = "RSRC_SPEC")
public class ResourceSpecification extends BaseEntity {
    @Id
    @SequenceGenerator(name = "resourceSpecificationSeq", sequenceName = "RSRC_SPEC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "resourceSpecificationSeq")
    @Column(name = "RSRC_SPEC_ID")
    private Long resourceSpecificationId;

    @Column(name = "RSRC_CODE")
    private String resourceCode;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCR")
    private String description;

    @Column(name = "ST_ID")
    private Long stId;


    @OneToMany(mappedBy = "resourceSpecification")
    List<ProductSpecResourceSpec> productSpecResourceSpecs;
}



