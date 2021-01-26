package com.eswm.lyy.generator.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ${comments}
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-01-26 17:18:12
 */
@Data
@TableName("diagnosisInfoList")
public class DiagnosisinfolistEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	private String hospcode;
	/**
	 * $column.comments
	 */
	private String diagtype;
	/**
	 * $column.comments
	 */
	private String leave;
	/**
	 * $column.comments
	 */
	@TableId
	private Integer id;
	/**
	 * $column.comments
	 */
	private String conditioncode;
	/**
	 * $column.comments
	 */
	private Integer times;
	/**
	 * $column.comments
	 */
	private String diagname;
	/**
	 * $column.comments
	 */
	private String leavecode;
	/**
	 * $column.comments
	 */
	private Integer diagtimes;
	/**
	 * $column.comments
	 */
	private String condition;
	/**
	 * $column.comments
	 */
	private String doctdiag;
	/**
	 * $column.comments
	 */
	private String prn;
	/**
	 * $column.comments
	 */
	private String icd;

}
