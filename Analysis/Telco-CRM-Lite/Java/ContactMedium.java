package com.etiya.crmlite.entities.concretes;
//Irtibat bilgilerinin tutuldugu tablodur.
import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "CNTC_MEDIUM")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ContactMedium  extends BaseEntity {
    @Id
    @SequenceGenerator(name = "contactMediumSeq", sequenceName = "CNTC_MEDIUM_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contactMediumSeq")
    @Column(name = "CNTC_MEDIUM_ID")
    private Long contactMediumId;  //
}
