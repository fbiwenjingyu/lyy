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
 * 病案首页主信息
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-01-26 15:56:26
 */
@Data
@TableName("medicalMain")
public class MedicalmainEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 本次住院流水号
	 */
	@TableId
	private String patientid;
	/**
	 * 医院代码
	 */
	private String hospcode;
	/**
	 * 病案号
	 */
	private String prn;
	/**
	 * 住院次数
	 */
	private Integer times;
	/**
	 * 医疗付款方式，编码
	 */
	private String paycode;
	/**
	 * 医疗付款方式名称
	 */
	private String pay;
	/**
	 * 健康卡号
	 */
	private String ascard1;
	/**
	 * 病人姓名
	 */
	private String name;
	/**
	 * 性别，编码
	 */
	private String sexcode;
	/**
	 * 性别名称
	 */
	private String sex;
	/**
	 * 出生日期
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date birthday;
	/**
	 * 年龄
	 */
	private String ageold;
	/**
	 * 年龄（XX岁
	 */
	private String age;
	/**
	 * 国籍，编码
	 */
	private String countrycode;
	/**
	 * 国籍，名称
	 */
	private String country;
	/**
	 * 新生儿出生体重
	 */
	private BigDecimal birthweight;
	/**
	 * 新生儿入院体重
	 */
	private BigDecimal inweight;
	/**
	 * 出生地（省市县）编码
	 */
	private String birthplacecode;
	/**
	 * 出生地（省市县）名称
	 */
	private String birthplace;
	/**
	 * 籍贯（省市县）编码
	 */
	private String nativeplacecode;
	/**
	 * 籍贯（省市县）名称
	 */
	private String nativeplace;
	/**
	 * 民族，编码
	 */
	private String nationalitycode;
	/**
	 * 民族，名称
	 */
	private String nationality;
	/**
	 * 身份证号
	 */
	private String idcard;
	/**
	 * 职业，编码
	 */
	private String jobcode;
	/**
	 * 职业，名称
	 */
	private String job;
	/**
	 * 婚姻状况，编码
	 */
	private String statuscode;
	/**
	 * 婚姻状况，名称
	 */
	private String status;
	/**
	 * 现住址，标准编码（省市县编码）
	 */
	private String curraddrcode;
	/**
	 * 现住址，标准名称（省市县）
	 */
	private String curraddrname;
	/**
	 * 现住址，详细街道地址
	 */
	private String curraddr;
	/**
	 * 现住址电话
	 */
	private String currtele;
	/**
	 * 现住址邮编
	 */
	private String currpost;
	/**
	 * 户口地址标准编码（省市县）
	 */
	private String houseaddrcode;
	/**
	 * 户口地址标准名称（省市县）
	 */
	private String houseaddrname;
	/**
	 * 户口地址详细地址
	 */
	private String houseaddr;
	/**
	 * 病人来源，编码
	 */
	private String sourcecode;
	/**
	 * 病人来源名称
	 */
	private String source;
	/**
	 * 户口邮编
	 */
	private String housepost;
	/**
	 * 工作单位及地址，编码（省市县）
	 */
	private String workaddrcode;
	/**
	 * 工作单位及地址，名称（省市县）
	 */
	private String workaddrname;
	/**
	 * 工作单位及地址，详细地址
	 */
	private String workaddr;
	/**
	 * 单位电话
	 */
	private String worktele;
	/**
	 * 单位邮编
	 */
	private String workpost;
	/**
	 * 联系人姓名
	 */
	private String contactsname;
	/**
	 * 与病人关系(名称)
	 */
	private String relate;
	/**
	 * 联系人地址编码（省市县）
	 */
	private String contactaddrcode;
	/**
	 * 联系人地址名称（省市区）
	 */
	private String contactaddr;
	/**
	 * 联系人电话
	 */
	private String contacttele;
	/**
	 * 输入日期
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date inputdate;
	/**
	 * 入院途径，编码
	 */
	private String inchannelcode;
	/**
	 * 入院途径，名称
	 */
	private String inchannel;
	/**
	 * 治疗类别，编码
	 */
	private String treatcodetcm;
	/**
	 * 治疗类别名称
	 */
	private String treattcm;
	/**
	 * 入院日期
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date indate;
	/**
	 * 入院时间
	 */
	private String intime;
	/**
	 * 入院科号
	 */
	private String indeptcode;
	/**
	 * 入院科别
	 */
	private String indept;
	/**
	 * 入院病区，编码
	 */
	private String inwardcode;
	/**
	 * 入院病区，名称
	 */
	private String inward;
	/**
	 * 首次转科日期
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date transferdate;
	/**
	 * 首次转科时间
	 */
	private String transfertime;
	/**
	 * 首次转科科号
	 */
	private String transferdeptcode;
	/**
	 * 首次转科科别
	 */
	private String transferdept;
	/**
	 * 出院日期
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date leavedate;
	/**
	 * 出院时间
	 */
	private String leavetime;
	/**
	 * 出院科号
	 */
	private String outdeptcode;
	/**
	 * 出院科别
	 */
	private String outdept;
	/**
	 * 出院病区，编码
	 */
	private String outwardcode;
	/**
	 * 出院病区，名称
	 */
	private String outward;
	/**
	 * 实际住院天数
	 */
	private Integer days;
	/**
	 * 门诊诊断 (中医主病)，编码
	 */
	private String maindiseasecodetcm;
	/**
	 * 门诊诊断 (中医主病)，名称
	 */
	private String maindiseasetcm;
	/**
	 * 门诊诊断(中医主证)，编码
	 */
	private String maincardcodetcm;
	/**
	 * 门诊诊断(中医主证)，名称
	 */
	private String maincardtcm;
	/**
	 * 门（急）诊诊断，编码
	 */
	private String inicd;
	/**
	 * 门（急）诊诊断，名称
	 */
	private String indiag;
	/**
	 * 门、急诊医生，编码
	 */
	private String indiagdoctcode;
	/**
	 * 门、急诊医生
	 */
	private String indiagdoct;
	/**
	 * 中医实施临床路径，编码
	 */
	private String pathwaycodetcm;
	/**
	 * 中医实施临床路径，名称
	 */
	private String pathwaytcm;
	/**
	 * 使用医疗机构中药制剂，编码
	 */
	private String preparationcodetcm;
	/**
	 * 使用医疗机构中药制剂，名称
	 */
	private String preparationtcm;
	/**
	 * 使用中医诊疗设备，编码
	 */
	private String equipmentcodetcm;
	/**
	 * 使用中医诊疗设备，名称
	 */
	private String equipmenttcm;
	/**
	 * 使用中医诊疗技术，编码
	 */
	private String technologycodetcm;
	/**
	 * 使用中医诊疗技术，名称
	 */
	private String technologytcm;
	/**
	 * 辨证施护，编码
	 */
	private String nursingcodetcm;
	/**
	 * 辨证施护，名称
	 */
	private String nursingtcm;
	/**
	 * 病例分型，编码
	 */
	private String diagclasscode;
	/**
	 * 病例分型，名称
	 */
	private String diagclass;
	/**
	 * 是否临床路径病例/入径情况/临床路径管理，编码
	 */
	private String ispathwaycode;
	/**
	 * 是否临床路径病例/入径情况，名称
	 */
	private String ispathway;
	/**
	 * 抢救次数
	 */
	private Integer savetimes;
	/**
	 * 抢救成功次数
	 */
	private Integer savesuctimes;
	/**
	 * 病理诊断，编码
	 */
	private String pathologycode;
	/**
	 * 病理诊断，名称
	 */
	private String pathology;
	/**
	 * 病理号
	 */
	private String pathologyno;
	/**
	 * 药物过敏，编码
	 */
	private String isallergycode;
	/**
	 * 药物过敏，名称
	 */
	private String isallergy;
	/**
	 * 过敏药物
	 */
	private String allergy;
	/**
	 * 死亡患者尸检，编码
	 */
	private String isbodycode;
	/**
	 * 死亡患者尸检，名称
	 */
	private String isbody;
	/**
	 * 血型，编码
	 */
	private String bloodcode;
	/**
	 * 血型，名称
	 */
	private String blood;
	/**
	 * RH，编码
	 */
	private String rhcode;
	/**
	 * RH，名称
	 */
	private String rh;
	/**
	 * 门诊与出院诊断符合，编码
	 */
	private String outpatientmatchcode;
	/**
	 * 门诊与出院诊断符合，名称
	 */
	private String outpatientmatch;
	/**
	 * 入院与出院符合，编码
	 */
	private String inpatientmatchcode;
	/**
	 * 入院与出院符合，名称
	 */
	private String inpatientmatch;
	/**
	 * 术前与术后符合，编码
	 */
	private String opmatchcode;
	/**
	 * 术前与术后符合，名称
	 */
	private String opmatch;
	/**
	 * 放射与病理符合，编码
	 */
	private String radiatematchcode;
	/**
	 * 放射与病理符合，名称
	 */
	private String radiationmatch;
	/**
	 * 临床与病理符合，编码
	 */
	private String pathologymatchcode;
	/**
	 * 临床与病理符合，名称
	 */
	private String pathologymatch;
	/**
	 * 科主任，编码
	 */
	private String directorcode;
	/**
	 * 科主任，名称
	 */
	private String director;
	/**
	 * 主任（副主任）医师，编码
	 */
	private String archiatercode;
	/**
	 * 主任（副主任）医师，名称
	 */
	private String archiater;
	/**
	 * 主治医生，编码
	 */
	private String doctorcode;
	/**
	 * 主治医生，名称
	 */
	private String doctor;
	/**
	 * 住院医生，编码
	 */
	private String residentcode;
	/**
	 * 住院医生，名称
	 */
	private String resident;
	/**
	 * 责任护士，编码
	 */
	private String nursecode;
	/**
	 * 责任护士，名称
	 */
	private String nurse;
	/**
	 * 进修医师，编码
	 */
	private String studydoctcode;
	/**
	 * 进修医师，名称
	 */
	private String studydoct;
	/**
	 * 实习医师，编码
	 */
	private String practicedoctcode;
	/**
	 * 实习医师，名称
	 */
	private String practicedoct;
	/**
	 * 编码员，编码
	 */
	private String codercode;
	/**
	 * 编码员，名称
	 */
	private String coder;
	/**
	 * 病案质量，编码
	 */
	private String qualitycode;
	/**
	 * 病案质量，名称
	 */
	private String quality;
	/**
	 * 质控医师，编码
	 */
	private String qualitydoctcode;
	/**
	 * 质控医师，名称
	 */
	private String qualitydoct;
	/**
	 * 质控护士，编码
	 */
	private String qualitynursecode;
	/**
	 * 质控护士，名称
	 */
	private String qualitynurse;
	/**
	 * 质控日期
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date qualitydate;
	/**
	 * 离院方式，编码
	 */
	private String leavewaycode;
	/**
	 * 离院方式，名称
	 */
	private String leaveway;
	/**
	 * 医嘱转院，拟接收机构名称
	 */
	private String intransferhostital;
	/**
	 * 转社区，拟接收机构名称
	 */
	private String incommunityhostital;
	/**
	 * 是否有出院31天内再住院计划，编码
	 */
	private String isagaincode;
	/**
	 * 是否有出院31天内再住院计划，名称
	 */
	private String isagain;
	/**
	 * 再住院目的
	 */
	private String isagainreason;
	/**
	 * 颅脑损伤患者昏迷时间入院前X天
	 */
	private Integer comabefordays;
	/**
	 * 颅脑损伤患者昏迷时间
	 */
	private Integer comabeforhours;
	/**
	 * 颅脑损伤患者昏迷时间
	 */
	private Integer comabeformins;
	/**
	 * 颅脑损伤患者昏迷时间
	 */
	private Integer comaafterdays;
	/**
	 * 颅脑损伤患者昏迷时间
	 */
	private Integer comaafterhours;
	/**
	 * 颅脑损伤患者昏迷时间
	 */
	private Integer comaaftermins;
	/**
	 * 部分病种
	 */
	private Integer ispartdisease;
	/**
	 * 总费用
	 */
	private BigDecimal totalfee;
	/**
	 * 住院总费用：自付金额
	 */
	private BigDecimal selffee;
	/**
	 * 一般医疗服务费
	 */
	private BigDecimal generalfee;
	/**
	 * 中医辨证论治费（中医）
	 */
	private BigDecimal zhfwlylftcm01;
	/**
	 * 中医辨证论治会诊费（中医）
	 */
	private BigDecimal zhfwlylftcm02;
	/**
	 * 一般治疗操作费
	 */
	private BigDecimal treatfee;
	/**
	 * 护理费
	 */
	private BigDecimal nursingfee;
	/**
	 * 其他费用
	 */
	private BigDecimal medicalotherfee;
	/**
	 * 诊断类：病理诊断费
	 */
	private BigDecimal pathologicalfee;
	/**
	 * 诊断类：实验室诊断费
	 */
	private BigDecimal laboratoryfee;
	/**
	 * 诊断类：影像学诊断费
	 */
	private BigDecimal checkfee;
	/**
	 * 诊断类：临床诊断项目费
	 */
	private BigDecimal diagfee;
	/**
	 * 治疗类：非手术治疗项目费
	 */
	private BigDecimal noopfee;
	/**
	 * 其中临床物理治疗费
	 */
	private BigDecimal physicalfee;
	/**
	 * 治疗类：手术治疗费
	 */
	private BigDecimal allopfee;
	/**
	 * 其中麻醉费
	 */
	private BigDecimal narcosisopfee;
	/**
	 * 其中手术费
	 */
	private BigDecimal surgeryopfee;
	/**
	 * 康复类：康复费
	 */
	private BigDecimal recurefee;
	/**
	 * 中医类：诊断
	 */
	private BigDecimal zylzdftcm;
	/**
	 * 中医类：中医治疗费
	 */
	private BigDecimal treatfeetcm;
	/**
	 * 其中外治（中医）
	 */
	private BigDecimal treatfeetcm1;
	/**
	 * 其中骨伤（中医）
	 */
	private BigDecimal treatfeetcm2;
	/**
	 * 针刺与灸法（中医）
	 */
	private BigDecimal treatfeetcm3;
	/**
	 * 推拿治疗（中医）
	 */
	private BigDecimal treatfeetcm4;
	/**
	 * 其中肛肠治疗（中医）
	 */
	private BigDecimal treatfeetcm5;
	/**
	 * 其中特殊治疗（中医）
	 */
	private BigDecimal treatfeetcm6;
	/**
	 * 中医类：其他（中医）
	 */
	private BigDecimal otherfeetcm;
	/**
	 * 中药特殊调配加工（中医）
	 */
	private BigDecimal otherfeetcm1;
	/**
	 * 其中辨证施膳（中医）
	 */
	private BigDecimal otherfeetcm2;
	/**
	 * 西药类：西药费
	 */
	private BigDecimal westernfee;
	/**
	 * 其中抗菌药物费用
	 */
	private BigDecimal antibacterialsfee;
	/**
	 * 中药类：中成药费
	 */
	private BigDecimal patentmedicinefee;
	/**
	 * 医疗机构中药制剂费（中医）
	 */
	private BigDecimal preparationfeetcm;
	/**
	 * 中草药费
	 */
	private BigDecimal herbalmedicinefee;
	/**
	 * 血费
	 */
	private BigDecimal bloodfee;
	/**
	 * 白蛋白类制品费
	 */
	private BigDecimal albuminfee;
	/**
	 * 球蛋白制品费
	 */
	private BigDecimal globulinfee;
	/**
	 * 凝血因子类制品费
	 */
	private BigDecimal coagulationfactorfee;
	/**
	 * 细胞因子类制品费
	 */
	private BigDecimal cytokinesfee;
	/**
	 * 检查用一次性医用材料费
	 */
	private BigDecimal inspectoncefee;
	/**
	 * 治疗用一次性医用材料费
	 */
	private BigDecimal treatoncefee;
	/**
	 * 手术用一次性医用材料费
	 */
	private BigDecimal oponcefee;
	/**
	 * 其他费
	 */
	private BigDecimal otherfee;
	/**
	 * 工作单位
	 */
	private String workunit;
	/**
	 * 0:未质控 1:已质控 
	 */
	private String isquality;
	/**
	 * 病理诊断2，名称
	 */
	private String pathology2;
	/**
	 * 病理诊断2，编码
	 */
	private String pathologycode2;
	/**
	 * 病理诊断2 病理号
	 */
	private String pathologyno2;
	/**
	 * 创建时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date ctime;
	/**
	 * 审核结果 
0 未审核 
1 审核通过 
2 病案返修 
3 病案修回
	 */
	private String qualityresult;
	/**
	 * 质控时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date qualitytime;
	/**
	 * 病案状态 0未完成 1已完成
	 */
	private String prnstatus;
	/**
	 * 质控分数
	 */
	private BigDecimal prnscore;
	/**
	 * 关系代码
	 */
	private String extend1;
	/**
	 * 审核通过时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date reviewpasstime;
	/**
	 * 病案回收标志 0未回收 1 已回收
	 */
	private Integer returnsignstatus;
	/**
	 * 病案第一次接收时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date firstreceivetime;
	/**
	 * 归档天数
	 */
	private Integer filingdays;
	/**
	 * 回收时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date returntime;
	/**
	 * 住院流水号
	 */
	private String barcode;

}
