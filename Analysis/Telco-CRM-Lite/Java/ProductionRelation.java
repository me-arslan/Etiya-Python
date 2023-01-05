package com.etiya.crmlite.entities.concretes;



import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "PROD_REL")
public class ProductionRelation extends BaseEntity {
    @Id
    @SequenceGenerator(name = "prodRelSeq", sequenceName = "PROD_REL_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prodRelSeq")
    @Column(name = "PROD_REL_ID")
    private Long prodRelId;

    @Column(name = "IS_ACTV")
    private Long isActive;

    @Column(name = "REL_TP_ID")
    private Long relationTypeId;

    @ManyToOne
    @JoinColumn(name = "PROD_ID1")
    private Product product1;

    @ManyToOne
    @JoinColumn(name = "PROD_ID2")
    private Product product2;


}
