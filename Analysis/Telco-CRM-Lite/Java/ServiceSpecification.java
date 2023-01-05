package com.etiya.crmlite.entities.concretes;
//Tanimli servislerin tutuldugu tablodur.
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
@Table(name = "SRVC_SPEC")
public class ServiceSpecification extends BaseEntity {
    @Id
    @SequenceGenerator(name = "serviceSpecificationSeq", sequenceName = "SRVC_SPEC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "serviceSpecificationSeq")
    @Column(name = "SRVC_SPEC_ID")
    private Long serviceSpecificationId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCR")
    private String description;

    @Column(name = "SRVC_CODE")
    private String serviceCode;

    @Column(name = "ST_ID")
    private Long stId;


    @OneToMany(mappedBy = "serviceSpecification")
    List<ProductSpecServiceSpec> productSpecServiceSpecs;
}
