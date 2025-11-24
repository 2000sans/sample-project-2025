package lk.zerocode.tuition_api.controller.dto.admin_related;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;
import java.util.Map;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CreateEducationPackageRequest {

    private String adminId;
    private String packageName;
    private Double packageValue;
    private Double admissionValue;
    private Double rentalValue;
    private Float instituteAdmissionPercentage;
    private Map<String,EducationPackageAdditionalDetailHolder> correspondingAdditionalInfo;

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public Double getPackageValue() {
        return packageValue;
    }

    public void setPackageValue(Double packageValue) {
        this.packageValue = packageValue;
    }

    public Double getAdmissionValue() {
        return admissionValue;
    }

    public void setAdmissionValue(Double admissionValue) {
        this.admissionValue = admissionValue;
    }

    public Double getRentalValue() {
        return rentalValue;
    }

    public void setRentalValue(Double rentalValue) {
        this.rentalValue = rentalValue;
    }

    public Float getInstituteAdmissionPercentage() {
        return instituteAdmissionPercentage;
    }

    public void setInstituteAdmissionPercentage(Float instituteAdmissionPercentage) {
        this.instituteAdmissionPercentage = instituteAdmissionPercentage;
    }

    public Map<String, EducationPackageAdditionalDetailHolder> getCorrespondingAdditionalInfo() {
        return correspondingAdditionalInfo;
    }

    public void setCorrespondingAdditionalInfo(Map<String, EducationPackageAdditionalDetailHolder> correspondingAdditionalInfo) {
        this.correspondingAdditionalInfo = correspondingAdditionalInfo;
    }
}
