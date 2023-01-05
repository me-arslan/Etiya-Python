package com.etiya.crmlite.entities.concretes;
// is etkilesimleri tanimlarinin tutuldugu tablodur

import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "BSN_INTER_SPEC")
public class BusinessInteractionSpec  extends BaseEntity {
    @Id
    @SequenceGenerator(name = "businessInteractionSpecSeq", sequenceName = "BSN_INTER_SPEC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "businessInteractionSpecSeq")
    @Column(name = "BSN_INTER_SPEC_ID")
    private Long businessInteractionSpecId;
    @Column(name = "NAME")
    private String name ;
    @Column(name = "DESCR")
    private String description ;
    @Column(name = "SHRT_CODE")
    private String shortCode ;
    @Column(name = "IS_ACTV")
    private Long ısActv ;


    @OneToMany(mappedBy = "businessInteractionSpec")
    List<BusinessInteractionItem> businessInteractionItems;

    @OneToMany(mappedBy = "businessInteractionSpec")
    List<BusinessInteraction> businessInteractions;

    @ManyToOne
    @JoinColumn(name = "BSN_INTER_TP_ID")
    private BusinessInteractionType businessInteractionType;
//--------------------------------------------------------------
    @OneToMany(mappedBy = "parentBusinessInteractionSpec")     //
    List<BusinessInteractionSpec> childBusinessInteractionSpec;//
                                                               //
    @ManyToOne                                                 //
    @JoinColumn(name = "PRNT_BSN_INTER_SPEC_ID")               //
    private BusinessInteractionSpec parentBusinessInteractionSpec;
//--------------------------------------------------------------

}
