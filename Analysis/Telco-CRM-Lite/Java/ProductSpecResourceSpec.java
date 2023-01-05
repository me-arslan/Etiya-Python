package com.etiya.crmlite.entities.concretes;

import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "PROD_SPEC_RSRC_SPEC")
public class ProductSpecResourceSpec extends BaseEntity {

    @Id
    @SequenceGenerator(name = "productSpecResourceSpecSeq", sequenceName = "PROD_SPEC_RSRC_SPEC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "productSpecResourceSpecSeq")
    @Column(name = "PROD_SPEC_RSRC_SPEC_ID")
    private Long productSpecResourceSpecId;  //

    @Column(name = "REL_TP_ID")
    private Long relationTypeId;

    @Column(name = "SDATE")
    private Date sDate;

    @Column(name = "EDATE")
    private Date eDate;

    @Column(name = "ST_ID")
    private Long stId;


    @ManyToOne
    @JoinColumn(name = "PROD_SPEC_ID")
    private ProductSpecification productSpecification;


    @ManyToOne
    @JoinColumn(name = "RSRC_SPEC_ID")
    private ResourceSpecification resourceSpecification;
}
