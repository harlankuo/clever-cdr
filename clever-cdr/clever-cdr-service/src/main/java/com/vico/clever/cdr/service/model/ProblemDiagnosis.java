package com.vico.clever.cdr.service.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ProblemDiagnosis")
public class ProblemDiagnosis {
	private String diagnosisID;// 诊断ID(*)
	private String patientID;// 病人ID(*)
	private String visitID;// 就诊ID(*)
	private String condition;// 入院病情
	private int dayOfTreatment;// 治疗天数
	private String result;// 治疗结果
	private String flagOfOperation;// 是否手术治疗,0-否；1-是。
	private String doctor;// 诊断医生
	private String classOfDiagnosisCode;// 诊断类别ID
	private String classOfDiagnosisName;// 类别名称
	private String diagnosisNO;// 诊断序号(*)
	private String problemDiagnosis;// 诊断项目代码
	private String description;// 诊断项目名称
	private Date dateOfDiagnosis;// 诊断日期和时间

	public ProblemDiagnosis() {
		super();
	}

	public ProblemDiagnosis(String diagnosisID, String patientID,
			String visitID, String condition, int dayOfTreatment,
			String result, String flagOfOperation, String doctor,
			String classOfDiagnosisCode, String classOfDiagnosisName,
			String diagnosisNO, String problemDiagnosis, String description,
			Date dateOfDiagnosis) {
		super();
		this.diagnosisID = diagnosisID;
		this.patientID = patientID;
		this.visitID = visitID;
		this.condition = condition;
		this.dayOfTreatment = dayOfTreatment;
		this.result = result;
		this.flagOfOperation = flagOfOperation;
		this.doctor = doctor;
		this.classOfDiagnosisCode = classOfDiagnosisCode;
		this.classOfDiagnosisName = classOfDiagnosisName;
		this.diagnosisNO = diagnosisNO;
		this.problemDiagnosis = problemDiagnosis;
		this.description = description;
		this.dateOfDiagnosis = dateOfDiagnosis;
	}

	public String getDiagnosisID() {
		return diagnosisID;
	}

	public void setDiagnosisID(String diagnosisID) {
		this.diagnosisID = diagnosisID;
	}

	public String getPatientID() {
		return patientID;
	}

	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}

	public String getVisitID() {
		return visitID;
	}

	public void setVisitID(String visitID) {
		this.visitID = visitID;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public int getDayOfTreatment() {
		return dayOfTreatment;
	}

	public void setDayOfTreatment(int dayOfTreatment) {
		this.dayOfTreatment = dayOfTreatment;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getFlagOfOperation() {
		return flagOfOperation;
	}

	public void setFlagOfOperation(String flagOfOperation) {
		this.flagOfOperation = flagOfOperation;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getClassOfDiagnosisCode() {
		return classOfDiagnosisCode;
	}

	public void setClassOfDiagnosisCode(String classOfDiagnosisCode) {
		this.classOfDiagnosisCode = classOfDiagnosisCode;
	}

	public String getClassOfDiagnosisName() {
		return classOfDiagnosisName;
	}

	public void setClassOfDiagnosisName(String classOfDiagnosisName) {
		this.classOfDiagnosisName = classOfDiagnosisName;
	}

	public String getDiagnosisNO() {
		return diagnosisNO;
	}

	public void setDiagnosisNO(String diagnosisNO) {
		this.diagnosisNO = diagnosisNO;
	}

	public String getProblemDiagnosis() {
		return problemDiagnosis;
	}

	public void setProblemDiagnosis(String problemDiagnosis) {
		this.problemDiagnosis = problemDiagnosis;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateOfDiagnosis() {
		return dateOfDiagnosis;
	}

	public void setDateOfDiagnosis(Date dateOfDiagnosis) {
		this.dateOfDiagnosis = dateOfDiagnosis;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((classOfDiagnosisCode == null) ? 0 : classOfDiagnosisCode
						.hashCode());
		result = prime
				* result
				+ ((classOfDiagnosisName == null) ? 0 : classOfDiagnosisName
						.hashCode());
		result = prime * result
				+ ((condition == null) ? 0 : condition.hashCode());
		result = prime * result
				+ ((dateOfDiagnosis == null) ? 0 : dateOfDiagnosis.hashCode());
		result = prime * result + dayOfTreatment;
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result
				+ ((diagnosisID == null) ? 0 : diagnosisID.hashCode());
		result = prime * result
				+ ((diagnosisNO == null) ? 0 : diagnosisNO.hashCode());
		result = prime * result + ((doctor == null) ? 0 : doctor.hashCode());
		result = prime * result
				+ ((flagOfOperation == null) ? 0 : flagOfOperation.hashCode());
		result = prime * result
				+ ((patientID == null) ? 0 : patientID.hashCode());
		result = prime
				* result
				+ ((problemDiagnosis == null) ? 0 : problemDiagnosis.hashCode());
		result = prime * result
				+ ((this.result == null) ? 0 : this.result.hashCode());
		result = prime * result + ((visitID == null) ? 0 : visitID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProblemDiagnosis other = (ProblemDiagnosis) obj;
		if (classOfDiagnosisCode == null) {
			if (other.classOfDiagnosisCode != null)
				return false;
		} else if (!classOfDiagnosisCode.equals(other.classOfDiagnosisCode))
			return false;
		if (classOfDiagnosisName == null) {
			if (other.classOfDiagnosisName != null)
				return false;
		} else if (!classOfDiagnosisName.equals(other.classOfDiagnosisName))
			return false;
		if (condition == null) {
			if (other.condition != null)
				return false;
		} else if (!condition.equals(other.condition))
			return false;
		if (dateOfDiagnosis == null) {
			if (other.dateOfDiagnosis != null)
				return false;
		} else if (!dateOfDiagnosis.equals(other.dateOfDiagnosis))
			return false;
		if (dayOfTreatment != other.dayOfTreatment)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (diagnosisID == null) {
			if (other.diagnosisID != null)
				return false;
		} else if (!diagnosisID.equals(other.diagnosisID))
			return false;
		if (diagnosisNO == null) {
			if (other.diagnosisNO != null)
				return false;
		} else if (!diagnosisNO.equals(other.diagnosisNO))
			return false;
		if (doctor == null) {
			if (other.doctor != null)
				return false;
		} else if (!doctor.equals(other.doctor))
			return false;
		if (flagOfOperation == null) {
			if (other.flagOfOperation != null)
				return false;
		} else if (!flagOfOperation.equals(other.flagOfOperation))
			return false;
		if (patientID == null) {
			if (other.patientID != null)
				return false;
		} else if (!patientID.equals(other.patientID))
			return false;
		if (problemDiagnosis == null) {
			if (other.problemDiagnosis != null)
				return false;
		} else if (!problemDiagnosis.equals(other.problemDiagnosis))
			return false;
		if (result == null) {
			if (other.result != null)
				return false;
		} else if (!result.equals(other.result))
			return false;
		if (visitID == null) {
			if (other.visitID != null)
				return false;
		} else if (!visitID.equals(other.visitID))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProblemDiagnosis [diagnosisID=" + diagnosisID + ", patientID="
				+ patientID + ", visitID=" + visitID + ", condition="
				+ condition + ", dayOfTreatment=" + dayOfTreatment
				+ ", result=" + result + ", flagOfOperation=" + flagOfOperation
				+ ", doctor=" + doctor + ", classOfDiagnosisCode="
				+ classOfDiagnosisCode + ", classOfDiagnosisName="
				+ classOfDiagnosisName + ", diagnosisNO=" + diagnosisNO
				+ ", problemDiagnosis=" + problemDiagnosis + ", description="
				+ description + ", dateOfDiagnosis=" + dateOfDiagnosis + "]";
	}
}
