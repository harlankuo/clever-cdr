package com.vico.clever.cdr.service.dao;

import com.vico.clever.cdr.service.model.NewBirthProcess;
import com.vico.clever.cdr.service.model.NewBornApgarScore;
import com.vico.clever.cdr.service.model.NewBornExamination;
import com.vico.clever.cdr.service.model.NewBornHearingScreeningRecords;
import com.vico.clever.cdr.service.model.NewBornMaster;
import com.vico.clever.cdr.service.model.NewBornOtherInformation;
import com.vico.clever.cdr.service.model.NewBornVaccinationRecords;

/**
 * @author Yuan.Ziyang
 * 
 */
public interface NewBornInfoDao {

	public NewBornMaster selectNewBornMaster(String newBornID);

	public int deleteNewBornMaster(String newBornID);

	public int insertNewBornMaster(NewBornMaster newBornMaster);

	public int updateNewBornMaster(NewBornMaster newBornMaster);

	// NewBirthProcess

	public NewBirthProcess selectNewBirthProcess(String newBornID);

	public int deleteNewBirthProcess(String newBornID);

	public int insertNewBirthProcess(NewBirthProcess newBirthProcess);

	// NewBornExamination

	public NewBornExamination selectNewBornExamination(String newBornID);

	public int deleteNewBornExamination(String newBornID);

	public int insertNewBornExamination(NewBornExamination newBornExamination);

	// NewBornApgarScore

	public NewBornApgarScore selectNewBornApgarScore(String newBornID);

	public int deleteNewBornApgarScore(String newBornID);

	public int insertNewBornApgarScore(NewBornApgarScore newBornApgarScore);

	// NewBornVaccinationRecords

	public NewBornVaccinationRecords selectNewBornVaccinationRecords(
			String newBornID);

	public int deleteNewBornVaccinationRecords(String newBornID);

	public int insertNewBornVaccinationRecords(
			NewBornVaccinationRecords newBornVaccinationRecords);

	// NewBornHearingScreeningRecords

	public NewBornHearingScreeningRecords selectNewBornHearingScreeningRecords(
			String newBornID);

	public int deleteNewBornHearingScreeningRecords(String newBornID);

	public int insertNewBornHearingScreeningRecords(
			NewBornHearingScreeningRecords newBornHearingScreeningRecords);

	// NewBornOtherInformation
	public NewBornOtherInformation selectNewBornOtherInfo(String newBornID);
	
	public int deleteNewBornOtherInfo(String newBornID);
	
	public int insertNewBornOtherInfo(NewBornOtherInformation newBornOtherInfo);
}
