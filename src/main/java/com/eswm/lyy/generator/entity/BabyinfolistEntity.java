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
 * @date 2021-01-26 17:14:58
 */
@Data
@TableName("babyInfoList")
public class BabyinfolistEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private String checkch;
	/**
	 * $column.comments
	 */
	private String deliverycode;
	/**
	 * $column.comments
	 */
	private String hospcode;
	/**
	 * $column.comments
	 */
	private String babybreath;
	/**
	 * $column.comments
	 */
	private String checkhearing;
	/**
	 * $column.comments
	 */
	private String babyleavecode;
	/**
	 * $column.comments
	 */
	private Integer babyweight;
	/**
	 * $column.comments
	 */
	private String babyleave;
	/**
	 * $column.comments
	 */
	private String outcomecode;
	/**
	 * $column.comments
	 */
	private Integer babyrescue;
	/**
	 * $column.comments
	 */
	private String checkg6pd;
	/**
	 * $column.comments
	 */
	private Integer babynum;
	/**
	 * $column.comments
	 */
	private String checkcahcode;
	/**
	 * $column.comments
	 */
	private Integer apgscore;
	/**
	 * $column.comments
	 */
	private String resultcode;
	/**
	 * $column.comments
	 */
	private String result;
	/**
	 * $column.comments
	 */
	private String babysexcode;
	/**
	 * $column.comments
	 */
	private String checkhearingcode;
	/**
	 * $column.comments
	 */
	private String outcome;
	/**
	 * $column.comments
	 */
	private String delivery;
	/**
	 * $column.comments
	 */
	private String checkcah;
	/**
	 * $column.comments
	 */
	private String prn;
	/**
	 * $column.comments
	 */
	private String checkpkucode;
	/**
	 * $column.comments
	 */
	private String checkpku;
	/**
	 * $column.comments
	 */
	private String babysex;
	/**
	 * $column.comments
	 */
	private String checkg6pdcode;
	/**
	 * $column.comments
	 */
	private Integer times;
	/**
	 * $column.comments
	 */
	private Integer babysucscue;
	/**
	 * $column.comments
	 */
	private String babybreathcode;
	/**
	 * $column.comments
	 */
	private String checkchcode;

}
