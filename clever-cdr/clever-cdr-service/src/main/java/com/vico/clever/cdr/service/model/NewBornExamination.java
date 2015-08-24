package com.vico.clever.cdr.service.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "NewBornExamination")
public class NewBornExamination {
	private String newBornID;// 新生儿ID
	private String eye;// 眼
	private String ear;// 耳
	private String nose;// 鼻
	private String lip;// 唇
	private String heart;// 心
	private String lung;// 肺
	private String liver;// 肝
	private String spleen;// 脾
	private String armsAndLegs;// 四肢
	private String umbilicalCord;// 脐带
	private String auns;// 肛门
	private String gentials;// 生殖器
	private String otherOrgan;// 其他器官
	private String hc;// 头围
	private String cc;// 胸围
	private String bpd;// 双顶径
	private String omd;// 枕颏径
	private String ofd;// 枕额径
	private String ofc;// 枕额周径
	private String sbc;// 枕下前囟径
	private String sbd;// 枕下前囟周径
	private Date createDate;// 录入日期
	private String creator;// 录入人姓名
	private String creatorID;// 录入人ID
	private Date lastModifiedDate;// 最后修改日期
	private String lastModifierName;// 最后修改人姓名
	private String lastModifierCode;// 最后修改人ID

	public NewBornExamination() {
		super();
	}

	public String getNewBornID() {
		return newBornID;
	}

	public void setNewBornID(String newBornID) {
		this.newBornID = newBornID;
	}

	public String getEye() {
		return eye;
	}

	public void setEye(String eye) {
		this.eye = eye;
	}

	public String getEar() {
		return ear;
	}

	public void setEar(String ear) {
		this.ear = ear;
	}

	public String getNose() {
		return nose;
	}

	public void setNose(String nose) {
		this.nose = nose;
	}

	public String getLip() {
		return lip;
	}

	public void setLip(String lip) {
		this.lip = lip;
	}

	public String getHeart() {
		return heart;
	}

	public void setHeart(String heart) {
		this.heart = heart;
	}

	public String getLung() {
		return lung;
	}

	public void setLung(String lung) {
		this.lung = lung;
	}

	public String getLiver() {
		return liver;
	}

	public void setLiver(String liver) {
		this.liver = liver;
	}

	public String getSpleen() {
		return spleen;
	}

	public void setSpleen(String spleen) {
		this.spleen = spleen;
	}

	public String getArmsAndLegs() {
		return armsAndLegs;
	}

	public void setArmsAndLegs(String armsAndLegs) {
		this.armsAndLegs = armsAndLegs;
	}

	public String getUmbilicalCord() {
		return umbilicalCord;
	}

	public void setUmbilicalCord(String umbilicalCord) {
		this.umbilicalCord = umbilicalCord;
	}

	public String getAuns() {
		return auns;
	}

	public void setAuns(String auns) {
		this.auns = auns;
	}

	public String getGentials() {
		return gentials;
	}

	public void setGentials(String gentials) {
		this.gentials = gentials;
	}

	public String getOtherOrgan() {
		return otherOrgan;
	}

	public void setOtherOrgan(String otherOrgan) {
		this.otherOrgan = otherOrgan;
	}

	public String getHc() {
		return hc;
	}

	public void setHc(String hc) {
		this.hc = hc;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getBpd() {
		return bpd;
	}

	public void setBpd(String bpd) {
		this.bpd = bpd;
	}

	public String getOmd() {
		return omd;
	}

	public void setOmd(String omd) {
		this.omd = omd;
	}

	public String getOfd() {
		return ofd;
	}

	public void setOfd(String ofd) {
		this.ofd = ofd;
	}

	public String getOfc() {
		return ofc;
	}

	public void setOfc(String ofc) {
		this.ofc = ofc;
	}

	public String getSbc() {
		return sbc;
	}

	public void setSbc(String sbc) {
		this.sbc = sbc;
	}

	public String getSbd() {
		return sbd;
	}

	public void setSbd(String sbd) {
		this.sbd = sbd;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getCreatorID() {
		return creatorID;
	}

	public void setCreatorID(String creatorID) {
		this.creatorID = creatorID;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getLastModifierName() {
		return lastModifierName;
	}

	public void setLastModifierName(String lastModifierName) {
		this.lastModifierName = lastModifierName;
	}

	public String getLastModifierCode() {
		return lastModifierCode;
	}

	public void setLastModifierCode(String lastModifierCode) {
		this.lastModifierCode = lastModifierCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((armsAndLegs == null) ? 0 : armsAndLegs.hashCode());
		result = prime * result + ((auns == null) ? 0 : auns.hashCode());
		result = prime * result + ((bpd == null) ? 0 : bpd.hashCode());
		result = prime * result + ((cc == null) ? 0 : cc.hashCode());
		result = prime * result
				+ ((createDate == null) ? 0 : createDate.hashCode());
		result = prime * result + ((creator == null) ? 0 : creator.hashCode());
		result = prime * result
				+ ((creatorID == null) ? 0 : creatorID.hashCode());
		result = prime * result + ((ear == null) ? 0 : ear.hashCode());
		result = prime * result + ((eye == null) ? 0 : eye.hashCode());
		result = prime * result
				+ ((gentials == null) ? 0 : gentials.hashCode());
		result = prime * result + ((hc == null) ? 0 : hc.hashCode());
		result = prime * result + ((heart == null) ? 0 : heart.hashCode());
		result = prime
				* result
				+ ((lastModifiedDate == null) ? 0 : lastModifiedDate.hashCode());
		result = prime
				* result
				+ ((lastModifierCode == null) ? 0 : lastModifierCode.hashCode());
		result = prime
				* result
				+ ((lastModifierName == null) ? 0 : lastModifierName.hashCode());
		result = prime * result + ((lip == null) ? 0 : lip.hashCode());
		result = prime * result + ((liver == null) ? 0 : liver.hashCode());
		result = prime * result + ((lung == null) ? 0 : lung.hashCode());
		result = prime * result
				+ ((newBornID == null) ? 0 : newBornID.hashCode());
		result = prime * result + ((nose == null) ? 0 : nose.hashCode());
		result = prime * result + ((ofc == null) ? 0 : ofc.hashCode());
		result = prime * result + ((ofd == null) ? 0 : ofd.hashCode());
		result = prime * result + ((omd == null) ? 0 : omd.hashCode());
		result = prime * result
				+ ((otherOrgan == null) ? 0 : otherOrgan.hashCode());
		result = prime * result + ((sbc == null) ? 0 : sbc.hashCode());
		result = prime * result + ((sbd == null) ? 0 : sbd.hashCode());
		result = prime * result + ((spleen == null) ? 0 : spleen.hashCode());
		result = prime * result
				+ ((umbilicalCord == null) ? 0 : umbilicalCord.hashCode());
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
		NewBornExamination other = (NewBornExamination) obj;
		if (armsAndLegs == null) {
			if (other.armsAndLegs != null)
				return false;
		} else if (!armsAndLegs.equals(other.armsAndLegs))
			return false;
		if (auns == null) {
			if (other.auns != null)
				return false;
		} else if (!auns.equals(other.auns))
			return false;
		if (bpd == null) {
			if (other.bpd != null)
				return false;
		} else if (!bpd.equals(other.bpd))
			return false;
		if (cc == null) {
			if (other.cc != null)
				return false;
		} else if (!cc.equals(other.cc))
			return false;
		if (createDate == null) {
			if (other.createDate != null)
				return false;
		} else if (!createDate.equals(other.createDate))
			return false;
		if (creator == null) {
			if (other.creator != null)
				return false;
		} else if (!creator.equals(other.creator))
			return false;
		if (creatorID == null) {
			if (other.creatorID != null)
				return false;
		} else if (!creatorID.equals(other.creatorID))
			return false;
		if (ear == null) {
			if (other.ear != null)
				return false;
		} else if (!ear.equals(other.ear))
			return false;
		if (eye == null) {
			if (other.eye != null)
				return false;
		} else if (!eye.equals(other.eye))
			return false;
		if (gentials == null) {
			if (other.gentials != null)
				return false;
		} else if (!gentials.equals(other.gentials))
			return false;
		if (hc == null) {
			if (other.hc != null)
				return false;
		} else if (!hc.equals(other.hc))
			return false;
		if (heart == null) {
			if (other.heart != null)
				return false;
		} else if (!heart.equals(other.heart))
			return false;
		if (lastModifiedDate == null) {
			if (other.lastModifiedDate != null)
				return false;
		} else if (!lastModifiedDate.equals(other.lastModifiedDate))
			return false;
		if (lastModifierCode == null) {
			if (other.lastModifierCode != null)
				return false;
		} else if (!lastModifierCode.equals(other.lastModifierCode))
			return false;
		if (lastModifierName == null) {
			if (other.lastModifierName != null)
				return false;
		} else if (!lastModifierName.equals(other.lastModifierName))
			return false;
		if (lip == null) {
			if (other.lip != null)
				return false;
		} else if (!lip.equals(other.lip))
			return false;
		if (liver == null) {
			if (other.liver != null)
				return false;
		} else if (!liver.equals(other.liver))
			return false;
		if (lung == null) {
			if (other.lung != null)
				return false;
		} else if (!lung.equals(other.lung))
			return false;
		if (newBornID == null) {
			if (other.newBornID != null)
				return false;
		} else if (!newBornID.equals(other.newBornID))
			return false;
		if (nose == null) {
			if (other.nose != null)
				return false;
		} else if (!nose.equals(other.nose))
			return false;
		if (ofc == null) {
			if (other.ofc != null)
				return false;
		} else if (!ofc.equals(other.ofc))
			return false;
		if (ofd == null) {
			if (other.ofd != null)
				return false;
		} else if (!ofd.equals(other.ofd))
			return false;
		if (omd == null) {
			if (other.omd != null)
				return false;
		} else if (!omd.equals(other.omd))
			return false;
		if (otherOrgan == null) {
			if (other.otherOrgan != null)
				return false;
		} else if (!otherOrgan.equals(other.otherOrgan))
			return false;
		if (sbc == null) {
			if (other.sbc != null)
				return false;
		} else if (!sbc.equals(other.sbc))
			return false;
		if (sbd == null) {
			if (other.sbd != null)
				return false;
		} else if (!sbd.equals(other.sbd))
			return false;
		if (spleen == null) {
			if (other.spleen != null)
				return false;
		} else if (!spleen.equals(other.spleen))
			return false;
		if (umbilicalCord == null) {
			if (other.umbilicalCord != null)
				return false;
		} else if (!umbilicalCord.equals(other.umbilicalCord))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NewBornExamination [newBornID=").append(newBornID)
				.append(", eye=").append(eye).append(", ear=").append(ear)
				.append(", nose=").append(nose).append(", lip=").append(lip)
				.append(", heart=").append(heart).append(", lung=")
				.append(lung).append(", liver=").append(liver)
				.append(", spleen=").append(spleen).append(", armsAndLegs=")
				.append(armsAndLegs).append(", umbilicalCord=")
				.append(umbilicalCord).append(", auns=").append(auns)
				.append(", gentials=").append(gentials).append(", otherOrgan=")
				.append(otherOrgan).append(", hc=").append(hc).append(", cc=")
				.append(cc).append(", bpd=").append(bpd).append(", omd=")
				.append(omd).append(", ofd=").append(ofd).append(", ofc=")
				.append(ofc).append(", sbc=").append(sbc).append(", sbd=")
				.append(sbd).append(", createDate=").append(createDate)
				.append(", creator=").append(creator).append(", creatorID=")
				.append(creatorID).append(", lastModifiedDate=")
				.append(lastModifiedDate).append(", lastModifierName=")
				.append(lastModifierName).append(", lastModifierCode=")
				.append(lastModifierCode).append("]");
		return builder.toString();
	}

}
