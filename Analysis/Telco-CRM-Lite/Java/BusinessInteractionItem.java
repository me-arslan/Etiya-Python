package com.etiya.crmlite.entities.concretes;


import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "BSN_INTER_ITEM")
public class BusinessInteractionItem  extends BaseEntity {
    @Id
    @SequenceGenerator(name = "businessInteractionItemSeq", sequenceName = "BSN_INTER_ITEM_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "businessInteractionItemSeq")
    @Column(name = "BSN_INTER_ITEM_ID")
    private Long businessInteractionItemId;
    @Column(name = "DESCR")
    private String description ;
    @Column(name = "ROW_ID")
    private Long rowId ;
    @Column(name = "DATA_TP_ID")
    private Long dataTpId ;
    @Column(name = "ACTN_TP_ID")
    private Long actnTpId ;
    @Column(name = "ST_ID")
    private Long stId ;

    @ManyToOne
    @JoinColumn(name = "BSN_INTER_ID")
    private BusinessInteraction businessInteraction;

    @ManyToOne
    @JoinColumn(name = "BSN_INTER_SPEC_ID")
    private BusinessInteractionSpec businessInteractionSpec;


}
