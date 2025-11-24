package lk.zerocode.tuition_api.controller.dto.admin_related;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CreateSubjectProfileRequest {

    private String adminId;
    private String tutorId;
    private String subjectName;
    private String subjectType;
    private String examType;
    private String subjectMedium;
    private String subjectStream;
    private String tutorUsername;

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getTutorId() {
        return tutorId;
    }

    public void setTutorId(String tutorId) {
        this.tutorId = tutorId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public String getSubjectMedium() {
        return subjectMedium;
    }

    public void setSubjectMedium(String subjectMedium) {
        this.subjectMedium = subjectMedium;
    }

    public String getSubjectStream() {
        return subjectStream;
    }

    public void setSubjectStream(String subjectStream) {
        this.subjectStream = subjectStream;
    }

    public String getTutorUsername() {
        return tutorUsername;
    }

    public void setTutorUsername(String tutorUsername) {
        this.tutorUsername = tutorUsername;
    }
}
