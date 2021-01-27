package com.eswm.lyy.generator.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * ${comments}
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-01-26 17:07:07
 */
@Data
@TableName("medicalMainOther")
public class MedicalmainotherEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private String isdrugcombination;
	/**
	 * $column.comments
	 */
	private String isicucode;
	/**
	 * $column.comments
	 */
	private String clinicalmanifestation;
	/**
	 * $column.comments
	 */
	private Integer noidcardreasoncode;
	/**
	 * $column.comments
	 */
	private String reopdeadcode;
	/**
	 * $column.comments
	 */
	private String intoicu;
	/**
	 * $column.comments
	 */
	private String optypecode;
	/**
	 * $column.comments
	 */
	private String isinhosp;
	/**
	 * $column.comments
	 */
	private String hemodialysisinfect;
	/**
	 * $column.comments
	 */
	private String petctcode;
	/**
	 * $column.comments
	 */
	private String luesscreen;
	/**
	 * $column.comments
	 */
	private String isemergencycode;
	/**
	 * $column.comments
	 */
	private String periopdeath;
	/**
	 * $column.comments
	 */
	private String pneumothoraxcode;
	/**
	 * $column.comments
	 */
	private String acutediseasename;
	/**
	 * $column.comments
	 */
	private String mothername;
	/**
	 * $column.comments
	 */
	private String isopcompcode;
	/**
	 * $column.comments
	 */
	private String istraffic;
	/**
	 * $column.comments
	 */
	private Integer regionallymphday;
	/**
	 * $column.comments
	 */
	private String finishpathwaycode;
	/**
	 * $column.comments
	 */
	private String choutpatientmatchcode;
	/**
	 * $column.comments
	 */
	private String chindiag1;
	/**
	 * $column.comments
	 */
	private Integer metastasesday;
	/**
	 * $column.comments
	 */
	private String tumortypecode;
	/**
	 * $column.comments
	 */
	private String threedaysinop;
	/**
	 * $column.comments
	 */
	private String drugtypecode;
	/**
	 * $column.comments
	 */
	private String isulcercode;
	/**
	 * $column.comments
	 */
	private String tumortypeallname;
	/**
	 * $column.comments
	 */
	private String pciandcabg;
	/**
	 * $column.comments
	 */
	private String issamediseasecode;
	/**
	 * $column.comments
	 */
	private String prn;
	/**
	 * $column.comments
	 */
	private String inpatientstatuscode;
	/**
	 * $column.comments
	 */
	private String unplannedreicucode;
	/**
	 * $column.comments
	 */
	private String degreediffcode;
	/**
	 * $column.comments
	 */
	private String indayopcode;
	/**
	 * $column.comments
	 */
	private String antibacterials;
	/**
	 * $column.comments
	 */
	private String recatheter;
	/**
	 * $column.comments
	 */
	private String isdialecticaluse;
	/**
	 * $column.comments
	 */
	private String infusionreactioncode;
	/**
	 * $column.comments
	 */
	private String reoperation;
	/**
	 * $column.comments
	 */
	private String tearinjurycode;
	/**
	 * $column.comments
	 */
	private String venousinfect;
	/**
	 * $column.comments
	 */
	private String surgerypatientsname;
	/**
	 * $column.comments
	 */
	private String riskpregnancy;
	/**
	 * $column.comments
	 */
	private String critical;
	/**
	 * $column.comments
	 */
	private String criticallyillcode;
	/**
	 * $column.comments
	 */
	private String majordrugselect;
	/**
	 * $column.comments
	 */
	private String prediagcode;
	/**
	 * $column.comments
	 */
	private String quitpathwaycause;
	/**
	 * $column.comments
	 */
	private String chinpatientmatch;
	/**
	 * $column.comments
	 */
	private String accidentalpuncture;
	/**
	 * $column.comments
	 */
	private String petrolin;
	/**
	 * $column.comments
	 */
	private String dsct;
	/**
	 * $column.comments
	 */
	private String metastasesname;
	/**
	 * $column.comments
	 */
	private String samplecase;
	/**
	 * $column.comments
	 */
	private String tumortypen;
	/**
	 * $column.comments
	 */
	private String selectiveopreturn;
	/**
	 * $column.comments
	 */
	private String isdiagnosis7daycode;
	/**
	 * $column.comments
	 */
	private String reicutime;
	/**
	 * $column.comments
	 */
	private String physicalconstraints;
	/**
	 * $column.comments
	 */
	private String complicationplace;
	/**
	 * $column.comments
	 */
	private String pathologyhwdiag;
	/**
	 * $column.comments
	 */
	private String followup;
	/**
	 * $column.comments
	 */
	private String issingledisease;
	/**
	 * $column.comments
	 */
	private BigDecimal platelet;
	/**
	 * $column.comments
	 */
	private String otherbloodtype;
	/**
	 * $column.comments
	 */
	private String chnursingcode;
	/**
	 * $column.comments
	 */
	private String isrelatedetailcode;
	/**
	 * $column.comments
	 */
	private String isrescuecode;
	/**
	 * $column.comments
	 */
	private String babyinfectdead;
	/**
	 * $column.comments
	 */
	private String dvtorpulmonaryembolism;
	/**
	 * $column.comments
	 */
	private String pathwayopcomplication;
	/**
	 * $column.comments
	 */
	private BigDecimal otherblood;
	/**
	 * $column.comments
	 */
	private String ulcercount;
	/**
	 * $column.comments
	 */
	private String babybirthinjurycode;
	/**
	 * $column.comments
	 */
	private String reveininfect;
	/**
	 * $column.comments
	 */
	private String antibacterials6;
	/**
	 * $column.comments
	 */
	private String mri;
	/**
	 * $column.comments
	 */
	private String catheter;
	/**
	 * $column.comments
	 */
	private String opantibacterials;
	/**
	 * $column.comments
	 */
	private String infectname;
	/**
	 * $column.comments
	 */
	private Integer fetussex;
	/**
	 * $column.comments
	 */
	private Integer bleed;
	/**
	 * $column.comments
	 */
	private String transfusionreaction;
	/**
	 * $column.comments
	 */
	private String hospital;
	/**
	 * $column.comments
	 */
	private String opcomplication;
	/**
	 * $column.comments
	 */
	private String isrecoveryinroomcode;
	/**
	 * $column.comments
	 */
	private String ifvariation;
	/**
	 * $column.comments
	 */
	private Integer primaryfocustimes;
	/**
	 * $column.comments
	 */
	private String deadcausecode;
	/**
	 * $column.comments
	 */
	private String fallingbed;
	/**
	 * $column.comments
	 */
	private String leaveotherdiag;
	/**
	 * $column.comments
	 */
	private String firstevercheck;
	/**
	 * $column.comments
	 */
	private BigDecimal nursing1leveldays;
	/**
	 * $column.comments
	 */
	private String reopplancode;
	/**
	 * $column.comments
	 */
	private String isanesthesiaunexpecteddeadcode;
	/**
	 * $column.comments
	 */
	private String nonmedicinetherapyname;
	/**
	 * $column.comments
	 */
	private String teamleader;
	/**
	 * $column.comments
	 */
	private String metabolicdisorder;
	/**
	 * $column.comments
	 */
	private BigDecimal autobloodtransfusion;
	/**
	 * $column.comments
	 */
	private BigDecimal birthweight2;
	/**
	 * $column.comments
	 */
	private String indiag1;
	/**
	 * $column.comments
	 */
	private String isicuoutcode;
	/**
	 * $column.comments
	 */
	private String ulcerotherpart;
	/**
	 * $column.comments
	 */
	private BigDecimal ureanitrogen;
	/**
	 * $column.comments
	 */
	private String pathwaytypecode;
	/**
	 * $column.comments
	 */
	private String perineum;
	/**
	 * $column.comments
	 */
	private String transfusioncode;
	/**
	 * $column.comments
	 */
	private String birthinjurycode;
	/**
	 * $column.comments
	 */
	private String hipbefordose;
	/**
	 * $column.comments
	 */
	private String variationother;
	/**
	 * $column.comments
	 */
	private String twotofourteendaysrehosp;
	/**
	 * $column.comments
	 */
	private String criticallyillinhosp;
	/**
	 * $column.comments
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date primaryfocusend;
	/**
	 * $column.comments
	 */
	private String isoxygenreducecode;
	/**
	 * $column.comments
	 */
	private String iscomplication;
	/**
	 * $column.comments
	 */
	private String inhostital;
	/**
	 * $column.comments
	 */
	private String preventiveanti;
	/**
	 * $column.comments
	 */
	private String opantibacterialscombined;
	/**
	 * $column.comments
	 */
	private String womenstate;
	/**
	 * $column.comments
	 */
	private String infectsite;
	/**
	 * $column.comments
	 */
	private String respiratoryfailure;
	/**
	 * $column.comments
	 */
	private String deadcause;
	/**
	 * $column.comments
	 */
	private BigDecimal nursing2leveldays;
	/**
	 * $column.comments
	 */
	private String ctcode;
	/**
	 * $column.comments
	 */
	private String reopplanname;
	/**
	 * $column.comments
	 */
	private String idcardtypecode;
	/**
	 * $column.comments
	 */
	private BigDecimal albumin;
	/**
	 * $column.comments
	 */
	private String isunexpectedrelatecode;
	/**
	 * $column.comments
	 */
	private String firsteverdiagnosis;
	/**
	 * $column.comments
	 */
	private BigDecimal intervaldays;
	/**
	 * $column.comments
	 */
	private String reicu;
	/**
	 * $column.comments
	 */
	private String iswzblcode;
	/**
	 * $column.comments
	 */
	private String pathologyexaminationcode;
	/**
	 * $column.comments
	 */
	private String issamediseaseunplan;
	/**
	 * $column.comments
	 */
	private String pathwaytype;
	/**
	 * $column.comments
	 */
	private String foreignbodycode;
	/**
	 * $column.comments
	 */
	private String birthinjury;
	/**
	 * $column.comments
	 */
	private String kneebefordose;
	/**
	 * $column.comments
	 */
	private String betweentimecode;
	/**
	 * $column.comments
	 */
	private String transfusion;
	/**
	 * $column.comments
	 */
	private String opdiagnosematchcode;
	/**
	 * $column.comments
	 */
	private String bloodpressure;
	/**
	 * $column.comments
	 */
	private String mdtcasecode;
	/**
	 * $column.comments
	 */
	private String scientific;
	/**
	 * $column.comments
	 */
	private String opcomptreatmentcode;
	/**
	 * $column.comments
	 */
	private Integer regionallymphgy;
	/**
	 * $column.comments
	 */
	private String infecttimes;
	/**
	 * $column.comments
	 */
	private String liverfunctionstate;
	/**
	 * $column.comments
	 */
	private String drugcombinationopcode;
	/**
	 * $column.comments
	 */
	private Integer adlin;
	/**
	 * $column.comments
	 */
	private String chnursing;
	/**
	 * $column.comments
	 */
	private String isrelatedetail;
	/**
	 * $column.comments
	 */
	private String icd03;
	/**
	 * $column.comments
	 */
	private String firsteverop;
	/**
	 * $column.comments
	 */
	private String isicu;
	/**
	 * $column.comments
	 */
	private String tpcliacode;
	/**
	 * $column.comments
	 */
	private String hematoma;
	/**
	 * $column.comments
	 */
	private String reopdead;
	/**
	 * $column.comments
	 */
	private String isallanesthesiaenddrugcode;
	/**
	 * $column.comments
	 */
	private String ulcerpartcode;
	/**
	 * $column.comments
	 */
	private String drgscode;
	/**
	 * $column.comments
	 */
	private String rerespirator;
	/**
	 * $column.comments
	 */
	private BigDecimal selfamount;
	/**
	 * $column.comments
	 */
	private String reopcode;
	/**
	 * $column.comments
	 */
	private String opbefordosecode;
	/**
	 * $column.comments
	 */
	private String infectothername;
	/**
	 * $column.comments
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date regionallymphbegin;
	/**
	 * $column.comments
	 */
	private String pneumothorax;
	/**
	 * $column.comments
	 */
	private String babybirthinjury;
	/**
	 * $column.comments
	 */
	private String tumorstaging;
	/**
	 * $column.comments
	 */
	private String bleedamount;
	/**
	 * $column.comments
	 */
	private String infusioncode;
	/**
	 * $column.comments
	 */
	private String highestbasis;
	/**
	 * $column.comments
	 */
	private Integer primaryfocusday;
	/**
	 * $column.comments
	 */
	private String isstewardscore;
	/**
	 * $column.comments
	 */
	private String drugtype;
	/**
	 * $column.comments
	 */
	private String reasons;
	/**
	 * $column.comments
	 */
	private String othercomplicationtypecode;
	/**
	 * $column.comments
	 */
	private Integer opantibacterialstimes;
	/**
	 * $column.comments
	 */
	private String delivery;
	/**
	 * $column.comments
	 */
	private String radioprogramcode;
	/**
	 * $column.comments
	 */
	private String endoscopiccode;
	/**
	 * $column.comments
	 */
	private String chemotherapymethname;
	/**
	 * $column.comments
	 */
	private String refallhospcode;
	/**
	 * $column.comments
	 */
	private String airwayslippage;
	/**
	 * $column.comments
	 */
	private String inbedno;
	/**
	 * $column.comments
	 */
	private String ulcersource;
	/**
	 * $column.comments
	 */
	private String followupmonth;
	/**
	 * $column.comments
	 */
	private String inhospisfallcausecode;
	/**
	 * $column.comments
	 */
	private String apgarscore;
	/**
	 * $column.comments
	 */
	private String dvt;
	/**
	 * $column.comments
	 */
	private String antibacterials4;
	/**
	 * $column.comments
	 */
	private String respiratorinfect;
	/**
	 * $column.comments
	 */
	private String isteachrounds;
	/**
	 * $column.comments
	 */
	private String cardtype;
	/**
	 * $column.comments
	 */
	private String ecgcheck;
	/**
	 * $column.comments
	 */
	private String isdiagnosis;
	/**
	 * $column.comments
	 */
	private String fifteentothirtydaysrehosp;
	/**
	 * $column.comments
	 */
	private String emergencyoperationname;
	/**
	 * $column.comments
	 */
	private String xcheckcode;
	/**
	 * $column.comments
	 */
	private String pathwayvariationcause;
	/**
	 * $column.comments
	 */
	private String moderntechnologycode;
	/**
	 * $column.comments
	 */
	private String accuratetraditionalcode;
	/**
	 * $column.comments
	 */
	private String constrainttool;
	/**
	 * $column.comments
	 */
	private String fetusnumcode;
	/**
	 * $column.comments
	 */
	private String infectcondition;
	/**
	 * $column.comments
	 */
	private String posdiag;
	/**
	 * $column.comments
	 */
	private String islungrecoverycode;
	/**
	 * $column.comments
	 */
	private Integer preventiveantidays;
	/**
	 * $column.comments
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date outicudate;
	/**
	 * $column.comments
	 */
	private String radiodevicename;
	/**
	 * $column.comments
	 */
	private String ulcerstagecode;
	/**
	 * $column.comments
	 */
	private String antibacterials1;
	/**
	 * $column.comments
	 */
	private String antibiosischeck;
	/**
	 * $column.comments
	 */
	private String fallinhopscode;
	/**
	 * $column.comments
	 */
	private BigDecimal plasma;
	/**
	 * $column.comments
	 */
	private String isrescue;
	/**
	 * $column.comments
	 */
	private String restricteapplicationname;
	/**
	 * $column.comments
	 */
	private Integer specialnursingdays;
	/**
	 * $column.comments
	 */
	private String isfollowcode;
	/**
	 * $column.comments
	 */
	private String chemotherapycode;
	/**
	 * $column.comments
	 */
	private String babysex;
	/**
	 * $column.comments
	 */
	private String opcomp;
	/**
	 * $column.comments
	 */
	private String qccode;
	/**
	 * $column.comments
	 */
	private BigDecimal respiratortime;
	/**
	 * $column.comments
	 */
	private String catheterinfect;
	/**
	 * $column.comments
	 */
	private String isspecialroom;
	/**
	 * $column.comments
	 */
	private String isotopiccode;
	/**
	 * $column.comments
	 */
	private String custodyhours;
	/**
	 * $column.comments
	 */
	private String antibioticscheme;
	/**
	 * $column.comments
	 */
	private String gestationresult;
	/**
	 * $column.comments
	 */
	private String intractablecase;
	/**
	 * $column.comments
	 */
	private String infectionintrusivecode;
	/**
	 * $column.comments
	 */
	private Integer externalconsultation;
	/**
	 * $column.comments
	 */
	private String leavemaindiag;
	/**
	 * $column.comments
	 */
	private String hivabcode;
	/**
	 * $column.comments
	 */
	private Integer opprevendrugdays;
	/**
	 * $column.comments
	 */
	private Integer parity;
	/**
	 * $column.comments
	 */
	private String otheranesthesia;
	/**
	 * $column.comments
	 */
	private String ulcerstage;
	/**
	 * $column.comments
	 */
	private String fallinhops;
	/**
	 * $column.comments
	 */
	private String nonmedicinetherapycode;
	/**
	 * $column.comments
	 */
	private String antibacterials2;
	/**
	 * $column.comments
	 */
	private String savemethod;
	/**
	 * $column.comments
	 */
	private String firstevertreatment;
	/**
	 * $column.comments
	 */
	private String catagma;
	/**
	 * $column.comments
	 */
	private BigDecimal allblood;
	/**
	 * $column.comments
	 */
	private String ulcerpart;
	/**
	 * $column.comments
	 */
	private String isotopic;
	/**
	 * $column.comments
	 */
	private String nursinglevel;
	/**
	 * $column.comments
	 */
	private String isfollow;
	/**
	 * $column.comments
	 */
	private String chemotherapyname;
	/**
	 * $column.comments
	 */
	private String opcomplicationdead;
	/**
	 * $column.comments
	 */
	private String babyweight;
	/**
	 * $column.comments
	 */
	private Integer catheterdays;
	/**
	 * $column.comments
	 */
	private String opbefordose;
	/**
	 * $column.comments
	 */
	private String inicd1;
	/**
	 * $column.comments
	 */
	private String noninclusioncode;
	/**
	 * $column.comments
	 */
	private BigDecimal respiratorhour;
	/**
	 * $column.comments
	 */
	private String allanesthesiacode;
	/**
	 * $column.comments
	 */
	private String medicalcardno;
	/**
	 * $column.comments
	 */
	private String indayrehosp;
	/**
	 * $column.comments
	 */
	private String criticallyillinhospcode;
	/**
	 * $column.comments
	 */
	private String babyouttype;
	/**
	 * $column.comments
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date birthdaytime;
	/**
	 * $column.comments
	 */
	private Integer antibioticdays;
	/**
	 * $column.comments
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date primaryfocusbegin;
	/**
	 * $column.comments
	 */
	private String isunexpectedobstaclescode;
	/**
	 * $column.comments
	 */
	private String consultationother;
	/**
	 * $column.comments
	 */
	private String leaveotherdiagcode;
	/**
	 * $column.comments
	 */
	private String antibacterialsnumber;
	/**
	 * $column.comments
	 */
	private String opantibacterialscombinedcode;
	/**
	 * $column.comments
	 */
	private String infectionintrusive;
	/**
	 * $column.comments
	 */
	private String radioprogramname;
	/**
	 * $column.comments
	 */
	private String endoscopicname;
	/**
	 * $column.comments
	 */
	private String issinglediseasecode;
	/**
	 * $column.comments
	 */
	private BigDecimal erythrocyte;
	/**
	 * $column.comments
	 */
	private String outbedno;
	/**
	 * $column.comments
	 */
	private String followupyear;
	/**
	 * $column.comments
	 */
	private BigDecimal nursing3leveldays;
	/**
	 * $column.comments
	 */
	private String refallhosp;
	/**
	 * $column.comments
	 */
	private String renalfunction;
	/**
	 * $column.comments
	 */
	private String moderntechnologyname;
	/**
	 * $column.comments
	 */
	private String pulmonaryembolism;
	/**
	 * $column.comments
	 */
	private String midwife;
	/**
	 * $column.comments
	 */
	private String antibacterials5;
	/**
	 * $column.comments
	 */
	private String ulcercountcode;
	/**
	 * $column.comments
	 */
	private String mricode;
	/**
	 * $column.comments
	 */
	private String severitylevel;
	/**
	 * $column.comments
	 */
	private Integer beforeopdays;
	/**
	 * $column.comments
	 */
	private String mdtcase;
	/**
	 * $column.comments
	 */
	private String accuratetraditionalname;
	/**
	 * $column.comments
	 */
	private String fetusnum;
	/**
	 * $column.comments
	 */
	private Integer primaryfocusgy;
	/**
	 * $column.comments
	 */
	private String islungrecoveryresultcode;
	/**
	 * $column.comments
	 */
	private String infecteopcode;
	/**
	 * $column.comments
	 */
	private String infectcode;
	/**
	 * $column.comments
	 */
	private String opantibacterialscode;
	/**
	 * $column.comments
	 */
	private String consultationcode;
	/**
	 * $column.comments
	 */
	private String indayop;
	/**
	 * $column.comments
	 */
	private String inpatientstatus;
	/**
	 * $column.comments
	 */
	private String passcrisiscode;
	/**
	 * $column.comments
	 */
	private String antibacterialstimes;
	/**
	 * $column.comments
	 */
	private String degreediffcode2;
	/**
	 * $column.comments
	 */
	private String recatheterinfect;
	/**
	 * $column.comments
	 */
	private String infusionreaction;
	/**
	 * $column.comments
	 */
	private String tearinjury;
	/**
	 * $column.comments
	 */
	private Integer veininfecttime;
	/**
	 * $column.comments
	 */
	private String criticallyillname;
	/**
	 * $column.comments
	 */
	private String deliveryplacecode;
	/**
	 * $column.comments
	 */
	private String fathername;
	/**
	 * $column.comments
	 */
	private String prediag;
	/**
	 * $column.comments
	 */
	private String isdiagnosis7day;
	/**
	 * $column.comments
	 */
	private String puncturescode;
	/**
	 * $column.comments
	 */
	private String buscode;
	/**
	 * $column.comments
	 */
	private String pathwayvariationcode;
	/**
	 * $column.comments
	 */
	private Integer metastasesgy;
	/**
	 * $column.comments
	 */
	private String tumortypem;
	/**
	 * $column.comments
	 */
	private String pciopcode;
	/**
	 * $column.comments
	 */
	private String constrainthour;
	/**
	 * $column.comments
	 */
	private Integer gestational;
	/**
	 * $column.comments
	 */
	private String opafterinfect;
	/**
	 * $column.comments
	 */
	private String othercomplicationplace;
	/**
	 * $column.comments
	 */
	private String icuname;
	/**
	 * $column.comments
	 */
	private String noidcardreason;
	/**
	 * $column.comments
	 */
	private String ulcertimecode;
	/**
	 * $column.comments
	 */
	private String bacteriacode;
	/**
	 * $column.comments
	 */
	private String inicudead;
	/**
	 * $column.comments
	 */
	private String isantibacterials;
	/**
	 * $column.comments
	 */
	private String inhospisfallcause;
	/**
	 * $column.comments
	 */
	private String drugcombinationcode;
	/**
	 * $column.comments
	 */
	private String criticaltypecode;
	/**
	 * $column.comments
	 */
	private String isemergency;
	/**
	 * $column.comments
	 */
	private String petct;
	/**
	 * $column.comments
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date metastasesbegin;
	/**
	 * $column.comments
	 */
	private String healthfilecode;
	/**
	 * $column.comments
	 */
	private String vapulcer;
	/**
	 * $column.comments
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date diagdate;
	/**
	 * $column.comments
	 */
	private String mothertel;
	/**
	 * $column.comments
	 */
	private String babydisscreeningcode;
	/**
	 * $column.comments
	 */
	private String suddendeathcode;
	/**
	 * $column.comments
	 */
	private String xcheck;
	/**
	 * $column.comments
	 */
	private String antibioticuse;
	/**
	 * $column.comments
	 */
	private String isopcomp;
	/**
	 * $column.comments
	 */
	private String finishpathway;
	/**
	 * $column.comments
	 */
	private String hbsagcode;
	/**
	 * $column.comments
	 */
	private String choutpatientmatch;
	/**
	 * $column.comments
	 */
	private String indiagcodetcm2;
	/**
	 * $column.comments
	 */
	private String leave;
	/**
	 * $column.comments
	 */
	private String isulcer;
	/**
	 * $column.comments
	 */
	private String isdiagnosis3daycode;
	/**
	 * $column.comments
	 */
	private Integer antibiosischecknum;
	/**
	 * $column.comments
	 */
	private String constraintcause;
	/**
	 * $column.comments
	 */
	private String radiotherapycode;
	/**
	 * $column.comments
	 */
	private String reopanesthesiacode;
	/**
	 * $column.comments
	 */
	private String unplannedreicu;
	/**
	 * $column.comments
	 */
	private String icuapachescore;
	/**
	 * $column.comments
	 */
	private Integer times;
	/**
	 * $column.comments
	 */
	private String issamedisease;
	/**
	 * $column.comments
	 */
	private String bacteria;
	/**
	 * $column.comments
	 */
	private String fallhosplevel;
	/**
	 * $column.comments
	 */
	private String ulcertime;
	/**
	 * $column.comments
	 */
	private String antibiosischeckcode;
	/**
	 * $column.comments
	 */
	private String drugcombination;
	/**
	 * $column.comments
	 */
	private String restricteapplicationcode;
	/**
	 * $column.comments
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date metastasesend;
	/**
	 * $column.comments
	 */
	private String criticaltype;
	/**
	 * $column.comments
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date deaddate;
	/**
	 * $column.comments
	 */
	private String surgerypatientscode;
	/**
	 * $column.comments
	 */
	private Integer respiratorupbeddays;
	/**
	 * $column.comments
	 */
	private String babydisscreening;
	/**
	 * $column.comments
	 */
	private String suddendeath;
	/**
	 * $column.comments
	 */
	private String isspecial;
	/**
	 * $column.comments
	 */
	private String intractablecasecode;
	/**
	 * $column.comments
	 */
	private String ecgcheckcode;
	/**
	 * $column.comments
	 */
	private String opcompcode;
	/**
	 * $column.comments
	 */
	private String indiagtcm2;
	/**
	 * $column.comments
	 */
	private String hcvagcode;
	/**
	 * $column.comments
	 */
	private String antibioticobjective;
	/**
	 * $column.comments
	 */
	private String leavemaindiagcode;
	/**
	 * $column.comments
	 */
	private String opprevendrug;
	/**
	 * $column.comments
	 */
	private String reicutimecode;
	/**
	 * $column.comments
	 */
	private String custodydays;
	/**
	 * $column.comments
	 */
	private Integer pregnanttimes;
	/**
	 * $column.comments
	 */
	private String radiotherapyname;
	/**
	 * $column.comments
	 */
	private String infecteop;
	/**
	 * $column.comments
	 */
	private Integer consultation;
	/**
	 * $column.comments
	 */
	private String anesthesiatypecode;
	/**
	 * $column.comments
	 */
	private String infectconditioncode;
	/**
	 * $column.comments
	 */
	private String ulcersourcecode;
	/**
	 * $column.comments
	 */
	private String airwayslippagecode;
	/**
	 * $column.comments
	 */
	private String passcrisisname;
	/**
	 * $column.comments
	 */
	private String isdrugcombinationcode;
	/**
	 * $column.comments
	 */
	private String isinhospcode;
	/**
	 * $column.comments
	 */
	private String fallhosp;
	/**
	 * $column.comments
	 */
	private String respirator;
	/**
	 * $column.comments
	 */
	private String dehiscence;
	/**
	 * $column.comments
	 */
	private String antibacterials3;
	/**
	 * $column.comments
	 */
	private String followupweek;
	/**
	 * $column.comments
	 */
	private String chemotherapymethcode;
	/**
	 * $column.comments
	 */
	private String isteachroundscode;
	/**
	 * $column.comments
	 */
	private String deliveryplace;
	/**
	 * $column.comments
	 */
	private String fathertel;
	/**
	 * $column.comments
	 */
	private String afteroppaincode;
	/**
	 * $column.comments
	 */
	private String isdiagnosiscode;
	/**
	 * $column.comments
	 */
	private String emergencyoperationcode;
	/**
	 * $column.comments
	 */
	private String bus;
	/**
	 * $column.comments
	 */
	private Integer metastasestimes;
	/**
	 * $column.comments
	 */
	private String infectious;
	/**
	 * $column.comments
	 */
	private String pathwayvariation;
	/**
	 * $column.comments
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date inicudate;
	/**
	 * $column.comments
	 */
	private String constraintmode;
	/**
	 * $column.comments
	 */
	private String opafterinfectname;
	/**
	 * $column.comments
	 */
	private String pciop;
	/**
	 * $column.comments
	 */
	private Integer excessdays;
	/**
	 * $column.comments
	 */
	private String tumortypeallcode;
	/**
	 * $column.comments
	 */
	private String posdiagcode;
	/**
	 * $column.comments
	 */
	private String radiodevicecode;
	/**
	 * $column.comments
	 */
	private String icutype;
	/**
	 * $column.comments
	 */
	private String tpclianame;
	/**
	 * $column.comments
	 */
	private String criticalcode;
	/**
	 * $column.comments
	 */
	private String isdialecticalusecode;
	/**
	 * $column.comments
	 */
	private String noidcardother;
	/**
	 * $column.comments
	 */
	private String isrespiratoryobstaclescode;
	/**
	 * $column.comments
	 */
	private String venous;
	/**
	 * $column.comments
	 */
	private String rerespiratorinfect;
	/**
	 * $column.comments
	 */
	private String dsctcode;
	/**
	 * $column.comments
	 */
	private String riskpregnancycode;
	/**
	 * $column.comments
	 */
	private String reop;
	/**
	 * $column.comments
	 */
	private String drgs;
	/**
	 * $column.comments
	 */
	private BigDecimal otheramount;
	/**
	 * $column.comments
	 */
	private String myomectomydose;
	/**
	 * $column.comments
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date regionallymphend;
	/**
	 * $column.comments
	 */
	private String accidentalpuncturecode;
	/**
	 * $column.comments
	 */
	private String quitpathway;
	/**
	 * $column.comments
	 */
	private String chinpatientmatchcode;
	/**
	 * $column.comments
	 */
	private String infectwritename;
	/**
	 * $column.comments
	 */
	private String tumortypet;
	/**
	 * $column.comments
	 */
	private String infusion;
	/**
	 * $column.comments
	 */
	private String teamleadercode;
	/**
	 * $column.comments
	 */
	private String isdiagnosis3day;
	/**
	 * $column.comments
	 */
	private String antibacterialscode;
	/**
	 * $column.comments
	 */
	private String selectiveopreturncode;
	/**
	 * $column.comments
	 */
	private String variation;
	/**
	 * $column.comments
	 */
	private String isnotsamediseasecode;
	/**
	 * $column.comments
	 */
	private String intype;
	/**
	 * $column.comments
	 */
	private String othercomplicationtype;
	/**
	 * $column.comments
	 */
	private String intoicucode;
	/**
	 * $column.comments
	 */
	private String ichoremia;
	/**
	 * $column.comments
	 */
	private String babyinfect;
	/**
	 * $column.comments
	 */
	private String reopcause;
	/**
	 * $column.comments
	 */
	private String optype;
	/**
	 * $column.comments
	 */
	private String idcardtype;
	/**
	 * $column.comments
	 */
	private String infusionreactiondrug;
	/**
	 * $column.comments
	 */
	private String samplecasecode;
	/**
	 * $column.comments
	 */
	private String hemodialysis;
	/**
	 * $column.comments
	 */
	private String ct;
	/**
	 * $column.comments
	 */
	private String pathwaydisease;
	/**
	 * $column.comments
	 */
	private BigDecimal cryoprecipitate;
	/**
	 * $column.comments
	 */
	private String obstetrics;
	/**
	 * $column.comments
	 */
	private String revein;
	/**
	 * $column.comments
	 */
	private String foreignbody;
	/**
	 * $column.comments
	 */
	private String errordrugdead;
	/**
	 * $column.comments
	 */
	private String pathologyexaminationname;
	/**
	 * $column.comments
	 */
	private String periopdeathcode;
	/**
	 * $column.comments
	 */
	private String acutediseasecode;
	/**
	 * $column.comments
	 */
	private String betweentime;
	/**
	 * $column.comments
	 */
	private String istrafficcode;
	/**
	 * $column.comments
	 */
	private String transfusionreactioncode;
	/**
	 * $column.comments
	 */
	private Integer regionallymphtimes;
	/**
	 * $column.comments
	 */
	private String punctures;
	/**
	 * $column.comments
	 */
	private String casediscussion;
	/**
	 * $column.comments
	 */
	private String amnioticfluid;
	/**
	 * $column.comments
	 */
	private String istumorpatients;
	/**
	 * $column.comments
	 */
	private String opcompothertreatment;
	/**
	 * $column.comments
	 */
	private String drugcombinationop;
	/**
	 * $column.comments
	 */
	private String chinicd1;
	/**
	 * $column.comments
	 */
	private Integer adlout;
	/**
	 * $column.comments
	 */
	private String hospcode;

}
