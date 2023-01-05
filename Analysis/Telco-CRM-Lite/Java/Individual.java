package com.etiya.crmlite.entities.concretes;

import com.etiya.crmlite.entities.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "IND")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Individual  extends BaseEntity {

    @Id
    @SequenceGenerator(name = "ındSeq",sequenceName ="IND_SEQ",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "ındSeq")
    @Column(name = "IND_ID")
    private Long ındId;  //

    @Column(name = "FRST_NAME")
    private String firstName;

    @Column(name = "MNAME")
    private String middleName;

    @Column(name = "LST_NAME")
    private String lastName;

    @Column(name = "BRTH_DATE") //***************
    private LocalDate birthDate;

    @Column(name = "GENDR_ID") // 1 man-2 woman
    private int genderId;

    @Column(name = "MTHR_NAME")
    private String motherName;

    @Column(name = "FTHR_NAME")
    private String fatherName;

    @Column(name = "NAT_ID")// Tc.Number
    private Long natId;

    @Column(name = "ST_ID")
    private Long stId;

    @OneToOne
    @JoinColumn(name="PARTY_ID",unique = true)
    private Party party;


}
