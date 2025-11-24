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
    private Object correspondingTutorInfo; // edit here

}
