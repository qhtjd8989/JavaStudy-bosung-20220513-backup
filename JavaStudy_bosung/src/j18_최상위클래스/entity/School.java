package j18_최상위클래스.entity;

import java.time.LocalDate;
import java.util.Objects;

public class School {
	private String schoolName;
	private String schoolAddress;
	private String schoolType;
	private LocalDate schoolAnniversary;
	
	public School() {
		// TODO Auto-generated constructor stub
	}

	public School(String schoolName, String schoolAddress, String schoolType, LocalDate schoolAnniversary) {
		super();
		this.schoolName = schoolName;
		this.schoolAddress = schoolAddress;
		this.schoolType = schoolType;
		this.schoolAnniversary = schoolAnniversary;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	public String getSchoolType() {
		return schoolType;
	}

	public void setSchoolType(String schoolType) {
		this.schoolType = schoolType;
	}

	public LocalDate getSchoolAnniversary() {
		return schoolAnniversary;
	}

	public void setSchoolAnniversary(LocalDate schoolAnniversary) {
		this.schoolAnniversary = schoolAnniversary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(schoolAddress, schoolAnniversary, schoolName, schoolType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		return Objects.equals(schoolAddress, other.schoolAddress)
				&& Objects.equals(schoolAnniversary, other.schoolAnniversary)
				&& Objects.equals(schoolName, other.schoolName) && Objects.equals(schoolType, other.schoolType);
	}

	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + ", schoolAddress=" + schoolAddress + ", schoolType=" + schoolType
				+ ", schoolAnniversary=" + schoolAnniversary + "]";
	}
	
	
}
