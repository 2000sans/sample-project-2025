package lk.zerocode.tuition_api.controller.dto.admin_related;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EducationPackageAdditionalDetailHolder {

    private String subjectProfileId;
    private Float tutorAdmissionPercentage;
    private Float tutorRentalPercentage;
    private Float tutorChargePercentage;
    private Float instituteChargePercentageForTutor;
    private Double tutorEarn;
    private Double instituteEarn;

    public String getSubjectProfileId() {
        return subjectProfileId;
    }

    public void setSubjectProfileId(String subjectProfileId) {
        this.subjectProfileId = subjectProfileId;
    }

    public Float getTutorAdmissionPercentage() {
        return tutorAdmissionPercentage;
    }

    public void setTutorAdmissionPercentage(Float tutorAdmissionPercentage) {
        this.tutorAdmissionPercentage = tutorAdmissionPercentage;
    }

    public Float getTutorRentalPercentage() {
        return tutorRentalPercentage;
    }

    public void setTutorRentalPercentage(Float tutorRentalPercentage) {
        this.tutorRentalPercentage = tutorRentalPercentage;
    }

    public Float getTutorChargePercentage() {
        return tutorChargePercentage;
    }

    public void setTutorChargePercentage(Float tutorChargePercentage) {
        this.tutorChargePercentage = tutorChargePercentage;
    }

    public Float getInstituteChargePercentageForTutor() {
        return instituteChargePercentageForTutor;
    }

    public void setInstituteChargePercentageForTutor(Float instituteChargePercentageForTutor) {
        this.instituteChargePercentageForTutor = instituteChargePercentageForTutor;
    }

    public Double getTutorEarn() {
        return tutorEarn;
    }

    public void setTutorEarn(Double tutorEarn) {
        this.tutorEarn = tutorEarn;
    }

    public Double getInstituteEarn() {
        return instituteEarn;
    }

    public void setInstituteEarn(Double instituteEarn) {
        this.instituteEarn = instituteEarn;
    }
}
