package com.qa.archery.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
public class Shoot {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column
	private String dated;

	@Column
	@Min(0)
	@Max(100)
	private int distance;

	@Column
	private String targetFace;


	@Column
	private String bowType;

	@Column
	@Min(0)
	@Max(24)
	private int arrows;

	@Column
	private int limbsWeight;


	@Column
	private String arrow;

	@Column
	@Min(0)
	private int arrowLength;

	@Column
	private int endsTotal;

	@Column
	private int totalArrows;

	@Column
	private int totalScore;


	//Default constructor
	public Shoot() {}


	public Shoot(String dated, @Min(0) @Max(100) int distance, String targetFace, String bowType,
			@Min(0) @Max(24) int arrows, int limbsWeight, String arrow, @Min(0) int arrowLength, int endsTotal,
			int totalArrows, int totalScore) {
		super();
		this.dated = dated;
		this.distance = distance;
		this.targetFace = targetFace;
		this.bowType = bowType;
		this.arrows = arrows;
		this.limbsWeight = limbsWeight;
		this.arrow = arrow;
		this.arrowLength = arrowLength;
		this.endsTotal = endsTotal;
		this.totalArrows = totalArrows;
		this.totalScore = totalScore;
	}

	//For Testing
	public Shoot(long id, String dated, @Min(0) @Max(100) int distance, String targetFace, String bowType,
			@Min(0) @Max(24) int arrows, int limbsWeight, String arrow, @Min(0) int arrowLength, int endsTotal,
			int totalArrows, int totalScore) {
		super();
		this.id = id;
		this.dated = dated;
		this.distance = distance;
		this.targetFace = targetFace;
		this.bowType = bowType;
		this.arrows = arrows;
		this.limbsWeight = limbsWeight;
		this.arrow = arrow;
		this.arrowLength = arrowLength;
		this.endsTotal = endsTotal;
		this.totalArrows = totalArrows;
		this.totalScore = totalScore;
	}

	//Getters and setters
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getDated() {
		return dated;
	}


	public void setDated(String dated) {
		this.dated = dated;
	}


	public int getDistance() {
		return distance;
	}


	public void setDistance(int distance) {
		this.distance = distance;
	}


	public String getTargetFace() {
		return targetFace;
	}


	public void setTargetFace(String targetFace) {
		this.targetFace = targetFace;
	}


	public String getBowType() {
		return bowType;
	}


	public void setBowType(String bowType) {
		this.bowType = bowType;
	}


	public int getArrows() {
		return arrows;
	}


	public void setArrows(int arrows) {
		this.arrows = arrows;
	}


	public int getLimbsWeight() {
		return limbsWeight;
	}


	public void setLimbsWeight(int limbsWeight) {
		this.limbsWeight = limbsWeight;
	}


	public String getArrow() {
		return arrow;
	}


	public void setArrow(String arrow) {
		this.arrow = arrow;
	}


	public int getArrowLength() {
		return arrowLength;
	}


	public void setArrowLength(int arrowLength) {
		this.arrowLength = arrowLength;
	}


	public int getEndsTotal() {
		return endsTotal;
	}


	public void setEndsTotal(int endsTotal) {
		this.endsTotal = endsTotal;
	}


	public int getTotalArrows() {
		return totalArrows;
	}


	public void setTotalArrows(int totalArrows) {
		this.totalArrows = totalArrows;
	}


	public int getTotalScore() {
		return totalScore;
	}


	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	// 
	@Override
	public String toString() {
		return "Shoot [id=" + id + ", dated=" + dated + ", distance=" + distance + ", targetFace=" + targetFace
				+ ", bowType=" + bowType + ", arrows=" + arrows + ", limbsWeight=" + limbsWeight + ", arrow=" + arrow
				+ ", arrowLength=" + arrowLength + ", endsTotal=" + endsTotal + ", totalArrows=" + totalArrows
				+ ", totalScore=" + totalScore + "]";
	}

	//Hashcode for Testing comparisons of objects matching
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arrow == null) ? 0 : arrow.hashCode());
		result = prime * result + arrowLength;
		result = prime * result + arrows;
		result = prime * result + ((bowType == null) ? 0 : bowType.hashCode());
		result = prime * result + ((dated == null) ? 0 : dated.hashCode());
		result = prime * result + distance;
		result = prime * result + endsTotal;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + limbsWeight;
		result = prime * result + ((targetFace == null) ? 0 : targetFace.hashCode());
		result = prime * result + totalArrows;
		result = prime * result + totalScore;
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
		Shoot other = (Shoot) obj;
		if (arrow == null) {
			if (other.arrow != null)
				return false;
		} else if (!arrow.equals(other.arrow))
			return false;
		if (arrowLength != other.arrowLength)
			return false;
		if (arrows != other.arrows)
			return false;
		if (bowType == null) {
			if (other.bowType != null)
				return false;
		} else if (!bowType.equals(other.bowType))
			return false;
		if (dated == null) {
			if (other.dated != null)
				return false;
		} else if (!dated.equals(other.dated))
			return false;
		if (distance != other.distance)
			return false;
		if (endsTotal != other.endsTotal)
			return false;
		if (id != other.id)
			return false;
		if (limbsWeight != other.limbsWeight)
			return false;
		if (targetFace == null) {
			if (other.targetFace != null)
				return false;
		} else if (!targetFace.equals(other.targetFace))
			return false;
		if (totalArrows != other.totalArrows)
			return false;
		if (totalScore != other.totalScore)
			return false;
		return true;
	}
	
	

}
