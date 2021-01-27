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
 * @date 2021-01-26 17:24:02
 */
@Data
@TableName("opInfoOtherList")
public class OpinfootherlistEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	private String opriskcode;
	/**
	 * $column.comments
	 */
	private String opfailbreath;
	/**
	 * $column.comments
	 */
	private String unexpectedsecop;
	/**
	 * $column.comments
	 */
	private String opsepticemiacode;
	/**
	 * $column.comments
	 */
	private String opbeforeprevendrug;
	/**
	 * $column.comments
	 */
	private String hospcode;
	/**
	 * $column.comments
	 */
	private String opcomp;
	/**
	 * $column.comments
	 */
	private BigDecimal opbefordays;
	/**
	 * $column.comments
	 */
	private String opleftforeigncode;
	/**
	 * $column.comments
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date opbefordosedate;
	/**
	 * $column.comments
	 */
	private String ophemorrhage;
	/**
	 * $column.comments
	 */
	private Integer ordernum;
	/**
	 * $column.comments
	 */
	private String opfracture;
	/**
	 * $column.comments
	 */
	private String anesthesiacomp;
	/**
	 * $column.comments
	 */
	private Integer times;
	/**
	 * $column.comments
	 */
	private String opfracturecode;
	/**
	 * $column.comments
	 */
	private String unexpectedsecopcode;
	/**
	 * $column.comments
	 */
	private String opcompcode;
	/**
	 * $column.comments
	 */
	private String isemergency;
	/**
	 * $column.comments
	 */
	private String ophemorrhagecode;
	/**
	 * $column.comments
	 */
	private Integer opoperationtypecode;
	/**
	 * $column.comments
	 */
	private String opphydisordercode;
	/**
	 * $column.comments
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date openddate;
	/**
	 * $column.comments
	 */
	private String selectiveop;
	/**
	 * $column.comments
	 */
	private String incisionposition;
	/**
	 * $column.comments
	 */
	private String opcode;
	/**
	 * $column.comments
	 */
	private String opwoundsplit;
	/**
	 * $column.comments
	 */
	private String selectiveopcode;
	/**
	 * $column.comments
	 */
	private String opleftforeign;
	/**
	 * $column.comments
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date narcosisbegintime;
	/**
	 * $column.comments
	 */
	private Integer optimes;
	/**
	 * $column.comments
	 */
	private String opwoundsplitcode;
	/**
	 * $column.comments
	 */
	private String prn;
	/**
	 * $column.comments
	 */
	private String opcomplication;
	/**
	 * $column.comments
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date opbegindate;
	/**
	 * $column.comments
	 */
	private String opbeforeprevendrugcode;
	/**
	 * $column.comments
	 */
	private String oppulembolism;
	/**
	 * $column.comments
	 */
	@TableId
	private Integer id;
	/**
	 * $column.comments
	 */
	private String opfailbreathcode;
	/**
	 * $column.comments
	 */
	private String asa;
	/**
	 * $column.comments
	 */
	private String opcutinfect;
	/**
	 * $column.comments
	 */
	private String opvenous;
	/**
	 * $column.comments
	 */
	private String asacode;
	/**
	 * $column.comments
	 */
	private String opcutinfectcode;
	/**
	 * $column.comments
	 */
	private String opvenouscode;
	/**
	 * $column.comments
	 */
	private String oprisk;
	/**
	 * $column.comments
	 */
	private String opname;
	/**
	 * $column.comments
	 */
	private String opoperationtype;
	/**
	 * $column.comments
	 */
	private String opphydisorder;
	/**
	 * $column.comments
	 */
	private Integer opprevendrugday;
	/**
	 * $column.comments
	 */
	private String isemergencycode;
	/**
	 * $column.comments
	 */
	private String oppulembolismcode;
	/**
	 * $column.comments
	 */
	private String anesthesiacompcode;
	/**
	 * $column.comments
	 */
	private String opsepticemia;

}
