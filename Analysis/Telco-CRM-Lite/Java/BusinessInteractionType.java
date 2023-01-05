package com.etiya.crmlite.entities.concretes;
// Istek tiplerinn tutuldugu tablodur.
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
@Table(name = "BSN_INTER_TP")
public class BusinessInteractionType  extends BaseEntity {
    @Id
    @SequenceGenerator(name = "businessInterectionTypeSeq", sequenceName = "BSN_INTER_TP_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "businessInterectionTypeSeq")
    @Column(name = "BSN_INTER_TP_ID")
    private Long businessInterectionTypeId;
    @Column(name = "PRNT_BSN_INTER_TP_ID")
    private Long prntBussinesInterTpId ;
    @Column(name = "NAME")
    private String name ;
    @Column(name = "DESCR")
    private String description ;
    @Column(name = "SHRT_CODE")
    private String shortCode ;
    @Column(name = "IS_ACTV")
    private Long ısActv ;



    @OneToMany(mappedBy = "businessInteractionType")
    List<BusinessInteractionSpec> businessInteractionSpecs;


}
