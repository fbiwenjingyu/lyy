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
 * @date 2021-01-26 17:11:36
 */
@Data
@TableName("operationInfoList")
public class OperationinfolistEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	private String surgeon;
	/**
	 * $column.comments
	 */
	private Date opdate;
	/**
	 * $column.comments
	 */
	@TableId
	private Integer id;
	/**
	 * $column.comments
	 */
	private String surgicallevelcode;
	/**
	 * $column.comments
	 */
	private String narcosisdoct;
	/**
	 * $column.comments
	 */
	private String narcosiscode;
	/**
	 * $column.comments
	 */
	private Integer times;
	/**
	 * $column.comments
	 */
	private String heal;
	/**
	 * $column.comments
	 */
	private Integer ismainoperation;
	/**
	 * $column.comments
	 */
	private String selectiveopcode;
	/**
	 * $column.comments
	 */
	private String isdsaangcode;
	/**
	 * $column.comments
	 */
	private String hospcode;
	/**
	 * $column.comments
	 */
	private String narcosis;
	/**
	 * $column.comments
	 */
	private String surgeon2code;
	/**
	 * $column.comments
	 */
	private String incision;
	/**
	 * $column.comments
	 */
	private String healcode;
	/**
	 * $column.comments
	 */
	private String surgeon2;
	/**
	 * $column.comments
	 */
	private String selectiveop;
	/**
	 * $column.comments
	 */
	private String surgicallevel;
	/**
	 * $column.comments
	 */
	private String surgeon1code;
	/**
	 * $column.comments
	 */
	private String opcode;
	/**
	 * $column.comments
	 */
	private String surgeon1;
	/**
	 * $column.comments
	 */
	private String incisioncode;
	/**
	 * $column.comments
	 */
	private String surgeoncode;
	/**
	 * $column.comments
	 */
	private String op;
	/**
	 * $column.comments
	 */
	private String prn;
	/**
	 * $column.comments
	 */
	private String narcosisdoctcode;
	/**
	 * $column.comments
	 */
	private Integer optimes;
	/**
	 * $column.comments
	 */
	private String isdsaang;

}
